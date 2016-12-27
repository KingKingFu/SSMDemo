package com.ssm.service;

import com.ssm.domain.Dept;

import java.sql.SQLException;
import java.util.List;

public interface DeptService {
    /**
     * 根据条件查询Dept表
     * @param dept
     * @return
     * @throws SQLException
     */
    List<Dept> findDeptsByCondition(Dept dept) throws SQLException;

    /**
     * 根据ID查询Dept表
     * @param id
     * @return
     * @throws SQLException
     */
    Dept findDeptById(int id) throws SQLException;

    /**
     * 增加
     * @param dept
     * @return
     * @throws SQLException
     */
    boolean add(Dept dept) throws SQLException;

    /**
     * 更新
     * @param id
     * @param dept
     * @return
     * @throws SQLException
     */
    boolean update(int id, Dept dept) throws SQLException;

    /**
     * 删除
     * @param id
     * @return
     * @throws SQLException
     */
    boolean delete(int id) throws SQLException;
}