package com.leo.provider.service.impl;

import com.leo.common.Dto.OrderCartDto;
import com.leo.common.util.IdGeneratorSington;
import com.leo.entity.Order;
import com.leo.entity.OrderItem;
import com.leo.provider.dao.OrderDao;
import com.leo.provider.dao.OrderItemDao;
import com.leo.provider.service.intf.OrderService;
import com.leo.provider.service.intf.R;
import org.checkerframework.checker.guieffect.qual.AlwaysSafe;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * projectName: ManevTest
 *
 * @author: 徐林旗
 * time:2020/11/5 23:28
 * desription:
 */
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao dao;
    @Autowired
    private OrderItemDao itemDao;
    @Autowired
    private RabbitTemplate template;

    @Override
    public R order(OrderCartDto dto) {
        return null;
    }

    @Override
    @Transactional
    public R orderV2(OrderCartDto dto) {
        // 下单接口
        // 校验
        if (dto!=null){
            if (dto.getUid()>0 && dto.getList() != null) {
                // 计算
                List<Object> list = new ArrayList<>();
                Order order = new Order();
                order.setId(IdGeneratorSington.getInstance().generator.nextId());
                int t = 0;
                Random rm = new Random();
                try {
//                    rediss
                }
            }
        }
        return null;
    }

    @Override
    public R queryByUid(int uid) {
        return null;
    }
}