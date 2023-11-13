package Controller;

import Model.StuManager;

import java.util.Scanner;

public class Main
{

    StuManager Main_Stu = new StuManager();
    public static void main(String[] args) {
        if(StuCmdOper.login())
        {
            Scanner sc = new Scanner(System.in);
            int decide=0;
            while (decide!=6) {
                System.out.println("" +
                        "1．查看所有同学信息，\n" +
                        "2．随机抽取3位同学信息，\n" +
                        "3．增加1位同学信息（学号和姓名不能重复），\n" +
                        "4．修改1位同学信息（根据学号修改），\n" +
                        "5．删除1位同学信息（根据学号删除），\n" +
                        "6.退出，\n"
                );
                decide = sc.nextInt();
                switch (decide) {
                    case 1: {
                        Operator.View_Stu();
                        break;
                    }
                    case 2: {
                        Operator.rand_stu();
                        break;
                    }
                    case 3:{
                        Operator.add_stu();
                        break;
                    }
                    case 4:{
                        System.out.println("输入学号");
                        Operator.mod_stu(sc.nextLine());
                    }
                    case 5:{
                        System.out.println("输入学号");
                        Operator.del_stu(sc.nextLine());
                    }
                }
            }

        }

    }
}