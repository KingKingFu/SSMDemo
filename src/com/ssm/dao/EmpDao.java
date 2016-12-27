package com.ssm.dao;

import com.ssm.domain.AuthAndGroup;
import com.ssm.domain.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    /**
     * 用户名、密码查询
     * @param name
     * @param pass
     * @return
     */
    Emp selectByNameAndPass(@Param("name") String name, @Param("pass") String pass);

    /**
     * 查询权限组中的权限
     * @param id
     * @return
     */
    List<AuthAndGroup> selectAuthInGroup(Integer id);

    /**
     * 查询不在权限组中的权限
     * @param id
     * @return
     */
    List<AuthAndGroup> selectAuthOutGroup(Integer id);
}