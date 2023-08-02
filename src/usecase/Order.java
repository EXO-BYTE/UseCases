package usecase;

import java.awt.List;

class Order {
    private String orderId;
    private User user;
    private java.util.List<Book> books;

    public Order(String orderId, User user,java.util.List<Book> user1Books) {
        this.orderId = orderId;
        this.user = user;
        this.books = user1Books;
    }
}