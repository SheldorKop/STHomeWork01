package STHomework01;
/*
 * 1 这是我的学生类
 */
public class Student {
    private String id;
    private String name;
    private String age;
    private String address;
    public Student(String id, String name, String age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Student() {
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

}