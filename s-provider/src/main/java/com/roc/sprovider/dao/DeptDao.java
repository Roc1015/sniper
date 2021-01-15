package com.roc.sprovider.dao;

import com.roc.sapi.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author WP
 * @date 2021/1/15  9:59
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept getDeptById(Long id);

    public List<Dept> getDeptList();

}
