package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void moreMoney() {
        String sql = "update t_count set money=money+? where name=?";
        int count = jdbcTemplate.update(sql, 100, "jack");
    }

    @Override
    public void lessMoney() {
        String sql = "update t_count set money=money-? where name=?";
        int count = jdbcTemplate.update(sql, 100, "marry");
    }
}
