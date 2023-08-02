package usecase;

public class Application {
      public static void main(String[] args) {
       
        User user1 = new User(1, "Aish");
        User user2 = new User(2, "Alice");
        
        
        Book book1 = new Book(1, "Java Basics");
        Book book2 = new Book(2, "DBMS");
        
       
        Order order1 = new Order(901, user1);
        Order order2 = new Order(902, user2);
        
     
        order1.addBook(book1);
        order2.addBook(book2);
        
       
        Payment payment1 = new Payment(5001, order1, 250);
        Payment payment2 = new Payment(5002, order2, 199);
        
        
    }


}
