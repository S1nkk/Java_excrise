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


    public static Students[] initStuData() {
        //初始化5个同学信息
        Scanner sc = new Scanner(System.in);
        Students[] stud = new Students[5];
        for (int i = 0; i < 5; i++) {
            stud[i] = new Students();
            System.out.println("请输入第"+ i + "个学生信息");
            //初始化学生对象
            //以下依次输入
            System.out.println("请输入姓名");
            stud[i].setName(sc.next());
            System.out.println("您输入的姓名是：" + stud[i].getName());
            System.out.println("请输入性别");
            stud[i].setGender(sc.next().charAt(0));
            System.out.println("您输入的姓别是：" + stud[i].getGender());
            System.out.println("请输入年龄");
            stud[i].setAge(sc.nextInt());
            System.out.println("您输入的年龄是：" + stud[i].getAge());
            System.out.println("请输入身高");
            stud[i].setHeight(sc.nextFloat());
            System.out.println("您输入的身高是：" + stud[i].getHeight());
            System.out.println("请输入体重");
            stud[i].setWeight(sc.nextDouble());
            System.out.println("您输入的体重是：" + stud[i].getWeight());
            System.out.println("请输入电话");
            stud[i].setNumber(sc.next());
            System.out.println("您输入的电话是：" + stud[i].getNumber());
            System.out.println("请输入籍贯");
            stud[i].setHome(sc.next());
            System.out.println("您输入的籍贯是：" + stud[i].getHome());
            System.out.println("请输入班级");
            stud[i].setClasses(sc.next());
            System.out.println("您输入的班级是：" + stud[i].getClasses());
            System.out.println("请输入年级");
            stud[i].setGrade(sc.nextInt());
            System.out.println("您输入的年级是：" + stud[i].getGrade());
            System.out.println("学生是否毕业");
            String temp = sc.next();
            stud[i].setGraduated(Objects.equals(temp, "是"));
            //判断是否毕业并填入布尔值类型
            System.out.println("该学生是否毕业：" + stud[i].getGraduated());

        }
        return stud;
    }
}