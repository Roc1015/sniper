package com.roc.sapi.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author WP
 * @date 2021/1/14  17:03
 */
@Data
@NoArgsConstructor
public class Dept implements Serializable {

    private Long deptNO;
    private String dName;
    private String db_Source;


    public Dept(String dName) {
        this.dName = dName;
    }

}
