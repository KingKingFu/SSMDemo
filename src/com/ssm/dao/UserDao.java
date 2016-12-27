package com.ssm.dao;

import com.ssm.domain.User;
import com.ssm.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 条件查询
     * @param user
     * @return
     */
    List<User> selectByCondition(User user);

    /**
     * 用户名、密码查询
     * @param name
     * @param pass
     * @return
     */
    User selectByNameAndPass(@Param("name") String name, @Param("pass") String pass);

    /**
     * 分页查询
     * @param pageBean
     * @return
     */
    List<User> selectByPage(PageBean<User> pageBean);

    /**
     * 查询记录数
     * @return
     */
    Integer selectCount();
}