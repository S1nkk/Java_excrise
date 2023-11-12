import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Test
{
    public void Print_stu(StuManager Stu_Ma)
    {
        //依次输出学生管理信息
        System.out.println("专业："+Stu_Ma.major);
        System.out.println("班级信息："+Stu_Ma.class_detail);
        System.out.println("年级信息："+Stu_Ma.grade_detail);
        System.out.println("辅导员"+Stu_Ma.counselors);
        //输出学生信息
        print_stu(Stu_Ma.students);

    }


    //输出学生数组信息
    public void print_stu(Students[] stu_temp)
    {
        //for循环输出数组stu_temp的学生信息
        for (int i=0;i<stu_temp.length;i++)
        {

            System.out.println("姓名是：" +stu_temp[i].getName());

            System.out.println("姓别是：" +stu_temp[i].getGender());

            System.out.println("年龄是：" +stu_temp[i].getAge());

            System.out.println("身高是：" +stu_temp[i].getHeight());

            System.out.println("体重是：" +stu_temp[i].getWeight());

            System.out.println("电话是：" +stu_temp[i].getNumber());

            System.out.println("籍贯是：" +stu_temp[i].getHome());

            System.out.println("班级是：" +stu_temp[i].getClasses());

            System.out.println("年级是：" +stu_temp[i].getGrade());

            System.out.println("否毕业：" +stu_temp[i].getGraduated());
        }
    }


    //方法重构输出单个学生信息
    public void print_stu(Students stu)
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


    public void rand_student(Students[] stud)
    {
        //随机数
        Random rand = new Random();
        for (int i=0;i<3;i++)
        {
            //随机输出
            print_stu(stud[rand.nextInt(5)]);
        }
    }
}




