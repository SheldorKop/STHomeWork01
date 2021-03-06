package STHomework01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerTest {
    public static void SMTApp(){
        ArrayList<Student> array=new ArrayList<Student>();

        while (true) {
            System.out.println("请选择操作:");
            System.out.println("***********************************");
            System.out.println("*\t\t\t\t1 插入\t\t\t\t*");
            System.out.println("*\t\t\t\t2 查找\t\t\t\t*");
            System.out.println("*\t\t\t\t3 删除\t\t\t\t*");
            System.out.println("*\t\t\t\t4 修改\t\t\t\t*");
            System.out.println("*\t\t\t\t5 输出\t\t\t\t*");
            System.out.println("*\t\t\t\t6 退出\t\t\t\t*");
            System.out.println("***********************************");//主界面//2.1注释不必要
            Scanner scanner = new Scanner(System.in);
            String choiceString = scanner.nextLine();
            switch (choiceString) {
                case "1":
                    addStudent(array);
                    break;//4.2单个条件语句未加{}
                case "2":
                    findStudent(array);
                    break;//4.2单个条件语句未加{}
                case "3":
                    deleteStudent(array);
                    break;//4.2单个条件语句未加{}
                case "4":
                    updateStudent(array);
                    break;//4.2单个条件语句未加{}
                case "5":
                    findAllStudent(array);
                    break;//4.2单个条件语句未加{}
                case "6":

                default:
                    System.out.println("end");
                    System.exit(0);
                    break;
            }
        }
    }//3.4未空行

    public static void findAllStudent(ArrayList<Student> array) {
        if(array.isEmpty()) {
            System.out.println("对不起,目前没有学生信息可供查询,请回去重新操作");
            return;
        }
        System.out.println("学号\t姓名\t出生日期\t性别");
        for(int i=0;i<array.size();i++) {
            Student s=array.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getBirDate() + "\t" + s.getGender());
        }
    }//输出全部学生功能//3.4未空行

    public static void findStudent(ArrayList<Student> array) {
        Scanner scanner=new Scanner(System.in);
        boolean flag=false;
        System.out.println("请输入你要搜索的学生姓名:");
        String name=scanner.nextLine();
        int index=-1;
        for(int i=0;i<array.size();i++) {
            Student student=array.get(i);
            if(student.getName().equals(name)) {
                System.out.println("学号\t姓名\t出生日期\t性别");
                Student s=array.get(i);
                System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getBirDate() + "\t" + s.getGender());
                flag=true;
            }
        }
        if(flag==false) {
            System.out.println("不好意思,你要查询的学生信息不存在,请重新选择操作");
        }
    }//搜索学生功能//3.4未空行

    public static void addStudent(ArrayList<Student> array) {
        Scanner scanner=new Scanner(System.in);
        String id;
        while(true) {
            System.out.println("请输入学生学号: ");
            id=scanner.nextLine();
            boolean flag=false;
            for(int i=0;i<array.size();i++) {
                Student student=array.get(i);
                if(student.getId().equals(id))
                {
                    flag=true;
                    break;
                }
            }
            if(flag) {
                System.out.println("你输入的学号已经被占用,请重新输入");
            }else {
                break;//3.7折行不恰当
            }//4.3 if-else语句不甚规范
        }
        System.out.println("请输入学生名字:");
        String name=scanner.nextLine();
        System.out.println("请输入学生出生日期: ");
        String birDate=scanner.nextLine();
        System.out.println("请输入学生性别(homme or femme): ");
        String gender=scanner.nextLine();
        Student student=new Student();
        student.setGender(gender);
        student.setBirDate(birDate);
        student.setId(id);
        student.setName(name);
        array.add(student);
        System.out.println("添加学生成功！");
    }//添加学生功能//3.4未空行

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner scanner=new Scanner(System.in);
        boolean flag=false;
        System.out.println("请输入你要删除学生的姓名:");
        String name=scanner.nextLine();
        for(int i=0;i<array.size();i++) {
            Student student=array.get(i);
            if(student.getName().equals(name)) {
                array.remove(i);
                flag=true;
                System.out.println("删除学生成功");
            }
        }
        if(flag==false) {
            System.out.println("不好意思,你要删除的学生信息不存在,请重新选择操作");
        }
    }//删除学生功能//3.4未空行

    public static void updateStudent(ArrayList<Student> array) {
        Scanner scanner=new Scanner(System.in);
        boolean flag=false;
        System.out.println("请输入你要修改学生的学号:");
        String id=scanner.nextLine();
        int index=-1;
        for(int i=0;i<array.size();i++) {
            Student student=array.get(i);
            if(student.getId().equals(id)) {
                index=i;
                flag=true;
            }
        }
        if(flag==false) {
            System.out.println("你要修改的学生信息不存在,请重新选择操作");
        }else {
            System.out.println("请输入新的学生出生日期: ");
            String birDate=scanner.nextLine();
            System.out.println("请输入新的学生名字:");
            String name=scanner.nextLine();
            System.out.println("请输入新的学生性别: ");
            String gender=scanner.nextLine();
            Student student=new Student();
            student.setGender(gender);
            student.setBirDate(birDate);
            student.setId(id);
            student.setName(name);
            array.set(index, student);
            System.out.println("修改成功");
        }//4.3 if-else语句不甚规范
    }//更新学生信息//3.4未空行

    public static String getPlace(int count) {
        String str="";
        for(int i=0;i<count;i++)
            str+=" ";
        return str;
    }
}