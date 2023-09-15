//package org.example;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//public class TestBook {
//
//        public static void main(String[] args) {
//            ApplicationContext c1 = new ClassPathXmlApplicationContext("beans.xml");
//            BookDAO bd = c1.getBean(BookDAO.class);
//            Book book = c1.getBean("book", Book.class);
//            bd.insertBook(book);
//        }
//    }
//
//
