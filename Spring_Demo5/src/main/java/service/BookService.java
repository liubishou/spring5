package service;

import dao.BookDao;
import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
    //添加的方法
    public void add(Customer customer){
        bookDao.add(customer);
    }

    //修改的方法
    public void updateCustomer(Customer customer){
        bookDao.update(customer);

    }
    //删除的方法
    public void deleteCustomer(int id){
        bookDao.delete(id);
    }
    //查询行数
    public int selectCount(){
        int select = bookDao.select();
        return select;
    }
    //查询返回一个对象
    public Customer selectCustomer(int id){
        Customer customer = bookDao.selectObject(id);
        return customer;
    }
    //返回集合
    public List<Customer> selectList(){
        List<Customer> customers = bookDao.selectList();
        return customers;
    }
    //多条添加
    public void addBatch(List<Object[]> addBatch){
        bookDao.batchAdd(addBatch);
    }
}
