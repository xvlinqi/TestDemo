package com.leo.entity;

import lombok.Data;

import java.util.Date;

/**
 * projectName: ManevTest
 *
 * @author: 徐林旗
 * time:2020/11/5 22:34
 * desription:
 */
@Data
public class OrderItem {
    private Integer id;
    private Long oid;
    private Integer skuid;
    private Integer count;
    private Integer price;
    private Date ctime;
}
