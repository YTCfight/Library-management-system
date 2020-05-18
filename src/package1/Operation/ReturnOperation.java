package package1.Operation;

import package1.book.Book;
import package1.book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
            System.out.println("归还书籍");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要归还书籍的编号");
            String id = scanner.next();
            for (int i = 0; i < bookList.getSize(); i++) {
                Book book = bookList.getBook(i);
                if (!book.getId().equals(id)) {
                    continue;
                }
                //执行具体的还书操作
                if (!book.isIsborrowed()) {
                    System.out.println("这本书已经被会还了");
                    break;
                }
                book.setIsborrowed(false);
            }
        }
}
