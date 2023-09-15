//package org.example;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//@Primary
//public class BookDAOImp implements BookDAO {
//    private JdbcTemplate jdbcTemplate;
//
//    public BookDAOImp(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public void insertBook(Book book) {
//        String query = "INSERT INTO bookdetails (ID,TITLE,AUTHOR,PRICE) VALUES (?,?,?,?)";
//        jdbcTemplate.update(query, book.getId(), book.getTitle(), book.getAuthor(), book.getPrice());
//        System.out.println("Success");
//    }
//}
