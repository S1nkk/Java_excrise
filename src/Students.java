import java.util.Objects;
import java.util.Scanner;

public class Students {
    //姓名
    private String name;
    //学号
    private String studentID;
    //性别
    private char gender;
    //年龄
    private int age;
    //身高
    private float height;
    //体重
    private double weight;
    //联系电话
    private String number;
    //籍贯
    private String home;
    //班级信息
    private String classes;
    //年级信息
    private int grade;
    //是否毕业
    private boolean graduated;


    public Students() {
        System.out.println("这是一个没用的无参构造方法");
    }

    public Students(int num) {
        System.out.println("这是一个有参构造方法，参数为" + num);
    }


    //以下为各个参数的Getter与Setter方法
    public void setName(String Name) {
        this.name = Name;
    }
    public String getName() {
        System.out.println(this.name);
        return this.name;
    }



    public void setAge(int Age) {
        this.age = Age;
    }
    public int getAge() {
        System.out.println(this.age);
        return this.age;
    }



    public void setWeight(double Weight) {
        this.weight = Weight;
    }
    public double getWeight() {
        System.out.println(this.weight);
        return this.weight;
    }



    public void setHeight(float Height) {
        this.height = Height;
    }
    public float getHeight() {
        System.out.println(this.height);
        return this.height;
    }



    public void setNumber(String Number) {
        this.number = Number;
    }
    public String getNumber() {
        System.out.println(this.number);
        return this.number;
    }



    public void setStudentID(String StudentID) {
        this.studentID = StudentID;
    }
    public String getStudentID() {
        System.out.println(this.studentID);
        return this.studentID;
    }



    public void setGender(char Gender) {
        this.gender = Gender;
    }
    public char getGender() {
        System.out.println(this.gender);
        return this.gender;
    }



    public void setHome(String Home) {
        this.home = Home;
    }
    public String getHome() {
        System.out.println(this.home);
        return this.home;
    }



    public void setGrade(int Grade) {
        this.grade = Grade;
    }
    public int getGrade() {
        System.out.println(this.grade);
        return this.grade;
    }



    public void setClasses(String Classes) {
        this.classes = Classes;
    }
    public String getClasses() {
        System.out.println(this.classes);
        return this.classes;
    }



    public void setGraduated(boolean Graduated) {
        this.graduated = Graduated;
    }
    public boolean getGraduated() {
        System.out.println(this.graduated);
        return this.graduated;
    }
}

