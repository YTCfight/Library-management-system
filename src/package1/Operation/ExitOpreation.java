package package1.Operation;

import package1.book.BookList;

public class ExitOpreation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("goodbye!");
        System.exit(0);
    }
}
