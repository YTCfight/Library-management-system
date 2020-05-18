package package1.user;

import package1.Operation.IOperation;
import package1.book.BookList;

abstract public class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    //持有当前用户支持的操作对象
    protected IOperation[] operations;

    //打印一个操作菜单，不同的用户支持的操作不同，对应的菜单也就不同
    abstract public int menu();

    //根据用户输入的选项（menu的返回结果）
    //调用对应的操作对象
    //注意多态在这个代码中的体现
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
