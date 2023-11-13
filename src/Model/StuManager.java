package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StuManager
{
    //专业
    static String major;
    //班级信息
    static String class_detail;
    //年级信息
    static int grade_detail;
    //辅导员
    static String counselors;
    //学生信息
    static Student[] students;

    public static void Print_stu()
    {
        //依次输出学生管理信息
        System.out.println("专业："+major);
        System.out.println("班级信息："+class_detail);
        System.out.println("年级信息："+grade_detail);
        System.out.println("辅导员"+counselors);
        //输出学生信息
        print_stu();

    }


    //输出学生数组信息
    public static void print_stu()
    {

        //for循环输出数组stu_temp的学生信息
        for (int i=0;i<students.length;i++)
        {

            System.out.println("姓名是：" +students[i].getName());

            System.out.println("姓别是：" +students[i].getGender());

            System.out.println("年龄是：" +students[i].getAge());

            System.out.println("身高是：" +students[i].getHeight());

            System.out.println("体重是：" +students[i].getWeight());

            System.out.println("电话是：" +students[i].getNumber());

            System.out.println("籍贯是：" +students[i].getHome());

            System.out.println("班级是：" +students[i].getClasses());

            System.out.println("年级是：" +students[i].getGrade());

            System.out.println("否毕业：" +students[i].getGraduated());
        }
    }


    //方法重构输出单个学生信息
    public static void print_stu(Student stu)
    {
        //方法重构输出单个学生信息
        System.out.println("姓名是：" +stu.getName());

        System.out.println("姓别是：" +stu.getGender());

        System.out.println("年龄是：" +stu.getAge());

        System.out.println("身高是：" +stu.getHeight());

        System.out.println("体重是：" +stu.getWeight());

        System.out.println("电话是：" +stu.getNumber());

        System.out.println("籍贯是：" +stu.getHome());

        System.out.println("班级是：" +stu.getClasses());

        System.out.println("年级是：" +stu.getGrade());

        System.out.println("否毕业：" +stu.getGraduated());

    }


    //找学生
    public void find_stu(StuManager stum)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入以下要查找的学生信息");
        System.out.println("1：学号");
        System.out.println("2：姓名");
        //中间变量确定信息
        String name = null;
        String studentID = null;
        int num_just = sc.nextInt();
        if (num_just==1)
        {
            name = sc.next();
            //for循环检查name
            for(int i = 0;i<stum.students.length;i++)
            {

                if (name.equals(stum.students[i].getName()))
                {
                    //输出
                    print_stu(stum.students[i]);
                }
                break;
            }

        } else if (num_just==2) {
            studentID = sc.next();
            //for循环检查studentID
            for(int i = 0;i<stum.students.length;i++)
            {
                if (studentID.equals(stum.students[i].getStudentID()))
                {
                    //输出
                    print_stu(stum.students[i]);
                }
                break;
            }

        }
    }


    public static void rand_student(int num)
    {
        //随机数
        Random rand = new Random();
        for (int i=0;i<num;i++)
        {
            //随机输出
            print_stu(students[rand.nextInt(students.length)]);
        }
    }


    public static void add_stu() {
        Scanner sc = new Scanner(System.in);
        students[students.length] = new Student();
        students[students.length] = StuData.modify_student();
    }

    public static void del_stu(String number)
    {
        for (int i=0;i<students.length;i++)
        {
            if(students[i].getNumber().equals(number))
            {
                students[i]=null;
            }
        }
    }

    public static void mod_stu(String number)
    {
        for (int i=0;i<students.length;i++)
        {
            if(students[i].getNumber().equals(number))
            {
                students[i] = StuData.modify_student();
            }
        }
    }
}

