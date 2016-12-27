package com.ssm.service;

import com.ssm.domain.User;
import com.ssm.utils.PageBean;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    User login(String name, String pass) ;

    boolean exit();

    boolean add(User user);

    boolean update(int id, User user);

    boolean delete(int id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findUserById(int id);

    /**
     * 根据条件查询用户
     * @param user
     * @return
     */
    List<User> findUsersByCondition(User user);

    /**
     * 分页查询用户
     * @param page
     * @param pageSize
     * @return
     */
    PageBean<User> findUsersByPage(Integer page,Integer pageSize);
}