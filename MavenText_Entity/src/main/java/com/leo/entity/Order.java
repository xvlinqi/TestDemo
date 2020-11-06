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
public class Order {
    private Long id;
    private Integer uid;
    private Integer aid;
    private Integer totalmoney;
    private Integer paymoney;
    private Integer freemoney;
    private Integer flag;
    private Integer paytype;//支付方式 1支付宝 2微信
    private Date ctime;
    private Date utime;
}
