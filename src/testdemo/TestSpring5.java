package testdemo;

import com.atguigu.spring5.Order;
import com.atguigu.spring5.User;
import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.beans.Orders;
import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.factorybean.MyBean;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void test1(){
        //1.加载Spring配置文化
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置文件对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
        user.testDemo();
    }
    @Test
    public void test2(){
        //1.加载Spring配置文化
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置文件对象
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
        order.orderTest();
    }
    @Test
    public void test3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        UserService userservice = context.getBean("userservice", UserService.class);
        userservice.add();
    }
    @Test
    public void test4(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }
    @Test
    public void test5(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        Book book = context.getBean("book", Book.class);
        book.speak1();
    }
    @Test
    public void test6(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");
        Course course = context.getBean("mybean", Course.class);
        System.out.println(course);
    }
    @Test
    public void test7(){
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean6.xml");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean6.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取bean实例对象");
        System.out.println(orders);
        context.close();
    }
    @Test
    public void test8(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean7.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
