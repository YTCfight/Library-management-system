package package1.user;

import package1.Operation.*;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        //在这里构造 operation 数组
        //让我们数组中的 operation 对象的顺序和菜单中的序号相匹配
        operations = new IOperation[] {
                new ExitOpreation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new PrintAllOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("----------------");
        System.out.println("hello " + name);
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.打印所有图书信息");
        System.out.println("0.退出");
        System.out.println("----------------");
        System.out.println("请输入您的选择： ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        //close 本质上是在关闭 System.in
        //后面还要用到 System.in ，此处不能盲目关闭
        //scanner.close();
        return choice;
    }
}
