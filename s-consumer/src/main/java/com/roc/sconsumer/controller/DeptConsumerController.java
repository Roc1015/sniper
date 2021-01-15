package com.roc.sconsumer.controller;

import com.roc.sapi.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author WP
 * @date 2021/1/15  10:11
 */
@RestController
public class DeptConsumerController {

    @Autowired
    RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/consumer/dept/addDept")
    public Boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/addDept",dept,Boolean.class);
    }


    @RequestMapping("/consumer/dept/getDeptById/{id}")
    public Dept getDeptById(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/getDeptById/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/getDeptList")
    public List<Dept> getDeptList(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/getDeptList",List.class);
    }

}
