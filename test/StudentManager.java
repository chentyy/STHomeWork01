

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> studentList=new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public static   void App(){
        StudentManager studentManager=new StudentManager();
        List<Student> studentList=new ArrayList<>();
        studentManager.setStudentList(studentList);
        boolean status=true;
        while(status){
            jiemian();
            Scanner san=new Scanner(System.in);
            int num=san.nextInt();
            switch (num){
                case 1:addStudent(studentList);break;
                case 2:searchStudent(studentList);break;
                case 3:deleteStudent(studentList);break;
                case 4:updateStudent(studentList);break;
                case 5:printStudent(studentList);break;
                case 6:status=false;break;
            }
            if(status==false){
                break;
            }
        }
        System.out.println("退出成功");
    }
    public static void jiemian(){

        System.out.println("请选择操作：");
        System.out.println("**************************");
        System.out.println("**********1.插入***********");
        System.out.println("**********2.查找***********");
        System.out.println("**********3.删除***********");
        System.out.println("**********4.修改***********");
        System.out.println("**********5.输出***********");
        System.out.println("**********6.退出***********");
    }

    public static void addStudent(List<Student> studentList){
        Scanner san=new Scanner(System.in);
        System.out.println("请输入学生学号：");
        Integer ID=san.nextInt();
        boolean checkID=true;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getID()==ID){
                checkID=false;
                break;
            }
        }
        if(!checkID){
            System.out.println("该学生学号已存在");
            return;
        }
        System.out.println("请输入学生姓名：");
        String name=san.next();
        System.out.println("请输入学生出生日期：");
        String birDate=san.next();
        System.out.println("请输入学生性别(男或者女)：");
        String sex=san.next();
        boolean gender=true;
        if(sex.contains("女")){
            gender=false;
        }
        Student student=new Student(ID,name,birDate,gender);
        studentList.add(student);

    }

    public static void printStudent(List<Student> studentList){
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("学生学号："+studentList.get(i).getID());
            System.out.println("学生姓名："+studentList.get(i).getName());
            System.out.println("学生出生日期："+studentList.get(i).getBirDate());
            System.out.println("学生性别："+studentList.get(i).isGender());
        }
    }

    public static void searchStudent(List<Student> studentList){
        Scanner san=new Scanner(System.in);
        System.out.println("请输入要查找的学生学号：");
        boolean checkID=true;
        Integer ID=san.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getID()==ID){
                System.out.println("学生姓名："+studentList.get(i).getName());
                System.out.println("学生出生日期："+studentList.get(i).getBirDate());
                System.out.println("学生性别："+studentList.get(i).isGender());
                checkID=false;
            }
        }
        if(checkID){
            System.out.println("查找不到该学号的学生");
        }
    }

    public static void deleteStudent(List<Student> studentList){
        Scanner san=new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        boolean checkID=true;
        Integer ID=san.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getID()==ID){
                studentList.remove(i);
                checkID=false;
            }
        }
        if(checkID){
            System.out.println("查找不到该学号的学生");
        }else{
            System.out.println("成功删除该学生");
        }
    }

    public static void updateStudent(List<Student> studentList){
        Scanner san=new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        Integer ID=san.nextInt();
        boolean checkID=true;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getID()==ID){
                System.out.println("请输入学生姓名：");
                String name=san.next();
                studentList.get(i).setName(name);
                System.out.println("请输入学生出生日期：");
                String birDate=san.next();
                studentList.get(i).setBirDate(birDate);
                System.out.println("请输入学生性别(男或者女)：");
                String sex=san.next();
                boolean gender=true;
                if(sex.contains("女")){
                    gender=false;
                }
                studentList.get(i).setGender(gender);
                checkID=false;
            }
        }
        if(checkID){
            System.out.println("查找不到该学号的学生");
        }else{
            System.out.println("成功修改该学生信息");
        }
    }
}
