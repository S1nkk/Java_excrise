package Controller;

import java.awt.desktop.QuitEvent;
import java.util.Scanner;

public class StuCmdOper
{
    //对StuManager对象进行操作，该类构造方法中初始化StuManager对象的学生数据，
    //定义登录login方法，提示登录操作（学号和姓名），若登录成功，转到功能操作，登录失败，提示信息，继续登录；

    private static String password="1";
    private static String username="1";
    public static boolean login()
    {
        Scanner in = new Scanner(System.in);
        String desion=null;
        if(password==null&&username==null)
        {
            while (password==null&&username==null)
            {
                System.out.println("账号密码未设置，请先设置账号密码（Y）或退出（Q）");
                desion = in.nextLine();
                if (desion.equals("y")|desion.equals("Y"))
                {
                    System.out.print("用户名：");
                    username = in.nextLine();
                    System.out.print("密码：");
                    password = in.nextLine();
                    return true;
                }else if(desion.equals("q")|desion.equals("Q")){
                    System.exit(666);
                    return true;
                }
            }
        }else {
            int num =0;
            String temp_username;
            String temp_password;
            for (;num<4;num++)
            {
                System.out.print("输入用户名：");
                temp_username = in.nextLine();
                System.out.print("输入密码：");
                temp_password = in.nextLine();
                if (username.equals(temp_username)|password.equals(temp_password))
                {
                    return true;
                }else {
                    return false;
                }

            }
        }
        return false;
    }

}
