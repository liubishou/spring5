package testdemo;

import com.atguigu.spring5.add.UserAdd;
import com.atguigu.spring5.annonate.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5demo {
    @Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean9.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);
    }
    @Test
    public void test2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean10.xml");
        UserAdd userAdd = context.getBean("userAdd", UserAdd.class);
        userAdd.add();
        System.out.println(userAdd);
    }
}
