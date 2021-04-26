
public class Student {
    private Integer ID;//学号

    private String name;//姓名

    private String birDate;//出生日期

    private boolean gender;//性别

    public Student() {
    }

    public Student(Integer ID, String name, String birDate, boolean gender) {
        this.ID = ID;
        this.name = name;
        this.birDate = birDate;
        this.gender = gender;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", birDate='" + birDate + '\'' +
                ", gender=" + gender +
                '}';
    }
}
