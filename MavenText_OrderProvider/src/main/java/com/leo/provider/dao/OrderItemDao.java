package com.leo.provider.dao;

import java.util.Collection;

/**
 * projectName: ManevTest
 *
 * @author: 徐林旗
 * time:2020/11/5 23:29
 * desription:
 */
public interface OrderItemDao {
    int [] insertBatch(Collection<Object> list);
}