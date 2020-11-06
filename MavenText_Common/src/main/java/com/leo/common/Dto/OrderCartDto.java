package com.leo.common.Dto;

import lombok.Data;

import java.util.List;

/**
 * projectName: ManevTest
 *
 * @author: 徐林旗
 * time:2020/11/5 23:24
 * desription:
 */
@Data
public class OrderCartDto {
    private List<OrderGoodsDto> list;
    private int type;//标记位 1.立即购买 2.购物车
    private int uid;
    private int aid;//收货地址
    private Integer paytype;//支付方式
    private String skuids;//skuid-skuid
}