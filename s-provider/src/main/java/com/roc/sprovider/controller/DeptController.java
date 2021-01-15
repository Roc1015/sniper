package com.roc.sprovider.controller;

import com.roc.sapi.pojo.Dept;
import com.roc.sprovider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WP
 * @date 2021/1/15  9:59
 */

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/addDept")
    public Boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/getDeptById/{id}")
    public Dept getDeptById(@PathVariable("id") Long id){
        return deptService.getDeptById(id);
    }

    @GetMapping("/dept/getDeptList")
    public List<Dept> getDeptList(){
        return deptService.getDeptList();
    }

}
