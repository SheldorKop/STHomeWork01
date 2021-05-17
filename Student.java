package STHomework01;

public class Student {
    private String id;
    private String name;
    private String birDate;
    private String gender;
    public Student(String id, String name, String birDate, String gender) {
        this.id = id;
        this.name = name;
        this.birDate = birDate;
        this.gender = gender;
    }//学生信息
    public Student() {
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getBirDate() {
        return birDate;
    }
    public String getGender() {
        return gender;
    }

}//设置和搜索学生信息