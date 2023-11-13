package Controller;

import Model.StuManager;

public class Operator
{
    //定义功能操作operator方法，封装操作功能包括：
    //1．查看所有同学信息，
    //2．随机抽取3位同学信息，
    //3．增加1位同学信息（学号和姓名不能重复），
    //4．修改1位同学信息（根据学号修改），
    //5．删除1位同学信息（根据学号删除），

    public static void View_Stu()
    {
        StuManager.Print_stu();
    }

    public static void rand_stu()
    {
        StuManager.rand_student(3);
    }

    public static void add_stu()
    {
        StuManager.add_stu();
    }

    public static void del_stu(String number)
    {
        StuManager.del_stu(number);;
    }

    public  static void mod_stu(String number)
    {
        StuManager.mod_stu(number);
    }
}
