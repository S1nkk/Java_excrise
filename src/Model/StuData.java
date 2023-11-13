package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


/**
 * @author S1nk
 */
public class StuData {
    public static void main(String[] args)
    {
        //写入
        Scanner sc = new Scanner(System.in);
        StuManager stum = new StuManager();
        System.out.println("请输入专业");
        stum.major = sc.next();
        System.out.println("请输入班级信息");
        stum.class_detail = sc.next();
        System.out.println("请输入年级信息");
        stum.grade_detail = sc.nextInt();
        System.out.println("请输入辅导员信息");
        stum.class_detail = sc.next();
        System.out.println("请依次输入学生信息");
        stum.students = initStuData();

    }


    public static Student[] initStuData() {
        //初始化5个同学信息
        Scanner sc = new Scanner(System.in);
        Student[] stud = new Student[5];
        for (int i = 0; i < 5; i++) {
            stud[i] = new Student();
            stud[i]=modify_student();

        }
        return stud;
    }

    public static Student modify_student()
    {
        Scanner sc = new Scanner(System.in);
        Student stud = new Student();
        System.out.println("请输入学生信息");
        //初始化学生对象
        //以下依次输入
        System.out.println("请输入姓名");
        stud.setName(sc.next());
        System.out.println("您输入的姓名是：" + stud.getName());
        System.out.println("请输入性别");
        stud.setGender(sc.next().charAt(0));
        System.out.println("您输入的姓别是：" + stud.getGender());
        System.out.println("请输入年龄");
        stud.setAge(sc.nextInt());
        System.out.println("您输入的年龄是：" + stud.getAge());
        System.out.println("请输入身高");
        stud.setHeight(sc.nextFloat());
        System.out.println("您输入的身高是：" + stud.getHeight());
        System.out.println("请输入体重");
        stud.setWeight(sc.nextDouble());
        System.out.println("您输入的体重是：" + stud.getWeight());
        System.out.println("请输入电话");
        stud.setNumber(sc.next());
        System.out.println("您输入的电话是：" + stud.getNumber());
        System.out.println("请输入籍贯");
        stud.setHome(sc.next());
        System.out.println("您输入的籍贯是：" + stud.getHome());
        System.out.println("请输入班级");
        stud.setClasses(sc.next());
        System.out.println("您输入的班级是：" + stud.getClasses());
        System.out.println("请输入年级");
        stud.setGrade(sc.nextInt());
        System.out.println("您输入的年级是：" + stud.getGrade());
        System.out.println("学生是否毕业");
        String temp = sc.next();
        stud.setGraduated(Objects.equals(temp, "是"));
        //判断是否毕业并填入布尔值类型
        System.out.println("该学生是否毕业：" + stud.getGraduated());

        return stud;
    }
}