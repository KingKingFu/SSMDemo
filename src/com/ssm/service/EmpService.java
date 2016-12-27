package com.ssm.service;

import com.ssm.domain.AuthAndGroup;
import com.ssm.domain.Emp;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by lanling on 2016/12/21.
 */
public interface EmpService {
    Emp login(String name, String pass);

    /**
     * 在权限组根据ID查询权限
     * @param id
     * @return
     */
    List<AuthAndGroup> findAuthInGroupById(Integer id);

    /**
     * 根据id查询不在权限组中的权限
     * @param id
     * @return
     */
    List<AuthAndGroup> findAuthOutGroupById(Integer id);
}
