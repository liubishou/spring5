package test;

import entity.Customer;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

import java.awt.print.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class testCustomer {
    @Test
    public void addTest() throws ParseException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Customer customer = new Customer();
        customer.setName("刘必寿");
        customer.setEmail("123@qq.com");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2002-07-13");
        customer.setBirth(new java.sql.Date(parse.getTime()));
        bookService.add(customer);
    }
    @Test
    public void updateTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Customer customer = new Customer();
        customer.setEmail("234@qq.com");
        customer.setId(5);
        bookService.updateCustomer(customer);
    }
    @Test
    public void deleteTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteCustomer(4);
    }
    @Test
    public void selectTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int count = bookService.selectCount();
        System.out.println(count);
    }
    @Test
    public void selectObjectTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Customer customer = bookService.selectCustomer(5);
        System.out.println(customer);
    }
    @Test
    public void seletCustomerTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Customer> customers = bookService.selectList();
        System.out.println(customers);
    }
    @Test
    public void addBatchTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        List<Object[]> customers = new ArrayList<>();
        Object[] o1 = {26,"kobe","10086@qq.com","1998-02-02","null"};
        Object[] o2 = {27,"james","10087@qq.com","1999-03-03","null"};
        Object[] o3 = {28,"book","10088@qq.com","1999-04-04","null"};
        customers.add(o1);
        customers.add(o2);
        customers.add(o3);
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBatch(customers);
    }
}
