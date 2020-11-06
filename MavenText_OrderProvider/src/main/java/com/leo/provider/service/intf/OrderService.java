package com.leo.provider.service.intf;

import com.leo.common.Dto.OrderCartDto;

/**
 * projectName: ManevTest
 *
 * @author: 徐林旗
 * time:2020/11/5 23:14
 * desription:
 */
public interface OrderService {
    // 下单接口-订单预览页面
    R order(OrderCartDto dto);

    // 订单超时 Redis 同步到Mysql
    R orderV2(OrderCartDto dto);

    // 我的订单
    R queryByUid(int uid);
}