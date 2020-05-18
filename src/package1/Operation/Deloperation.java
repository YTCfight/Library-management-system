package package1.Operation;

import package1.book.Book;
import package1.book.BookList;

import java.util.Scanner;

public class Deloperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的序号: ");
        String id = scanner.next();
        //先查找
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getId().equals(id)) {
                //找到了
                break;
            }
        }
        if (i >= bookList.getSize()) {
            //没找到
            return;
        }
        //处理找到了的情况
        //直接用最后一个元素覆盖当前要删除的元素，然后在把 size-- 即可。
        //bookList.setBook(i,bookList.getBook(bookList.getSize() - 1));
        Book lastBook = bookList.getBook(bookList.getSize() - 1);
        bookList.setBook(i,lastBook);
        bookList.setSize(bookList.getSize() - 1);
    }
}
