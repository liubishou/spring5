package dao;

import entity.Customer;

import java.util.List;

public interface BookDao {
    void add(Customer customer);

    void update(Customer customer);

    void delete(int id);

    int select();

    Customer selectObject(int id);

    List<Customer> selectList();

    void batchAdd(List<Object[]> batchArgs);
}
