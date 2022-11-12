package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
//事务注解
@Transactional(timeout = -1 ,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)//设置隔离级别（REPEATABLE_READ：Mysql默认隔离级别（可重复读））
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){
        //-100
        userDao.lessMoney();
        int i = 10/0;
        //+100
        userDao.moreMoney();
    }
}
