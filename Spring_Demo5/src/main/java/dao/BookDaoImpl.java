package dao;

import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Customer customer) {
        String sql = "insert into customers(name,email,birth) values(?,?,?)";
        Object[] args = {customer.getName(), customer.getEmail(), customer.getBirth()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void update(Customer customer) {
        String sql = "update customers set email=? where id=?";
        Object[] args = {customer.getEmail(),customer.getId()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void delete(int id) {
        String sql = "delete from customers where id = ?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }

    @Override
    public int select() {
        String sql = "select count(*) from customers";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;

    }

    @Override
    public Customer selectObject(int id) {
        String sql = "select * from customers where id = ?";
        Customer customer = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(Customer.class), id);
        return customer;
    }

    @Override
    public List<Customer> selectList() {
        String sql = "select * from customers";
        List<Customer> customers = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class));
        return customers;
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into customers value(?,?,?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

}
