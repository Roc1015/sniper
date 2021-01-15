package com.roc.sprovider.service;

import com.roc.sapi.pojo.Dept;

import java.util.List;

/**
 * @author WP
 * @date 2021/1/15  9:59
 */
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept getDeptById(Long id);

    public List<Dept> getDeptList();

}
