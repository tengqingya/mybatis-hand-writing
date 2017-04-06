package com.gupaoedu.mybatis.beans;

import lombok.Data;
import lombok.ToString;

@Data
public class Test {
    private Integer id;

    private Integer nums;

    private String name;

    public Test(Integer id, Integer nums, String name) {
        this.id = id;
        this.nums = nums;
        this.name = name;
    }

    public Test() {
    }
}