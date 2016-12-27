package com.ssm.dao;

import com.ssm.domain.Dept;

import java.util.List;

public interface DeptDao {
    int deleteByPrimaryKey(Integer deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    /**
     * 条件查询
     * @param dept
     * @return
     */
    List<Dept> selectByCondition(Dept dept);
}