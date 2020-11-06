package com.leo.common.third;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.protocol.ScoredEntry;
import org.redisson.config.Config;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @program: CloudLike
 * @description:  基于Redisson实现Redis数据库的操作
 * @author: Feri(邢朋辉)
 * @create: 2020-11-02 11:13
 */
public class RedissonUtil {
    private static RedissonClient client;
    static {
        // 配置
        Config config = new Config();
        config.setThreads(1000);
        config.useSingleServer().setAddress("redis://39.105.189.141:6380").setPassword("qfjava");
        client=Redisson.create(config);
    }
    // 新增
    public static void setStr(String key, String val) {
        client.getBucket(key).set(val);
    }
    public static void setStr(String key, Object val) {
        client.getBucket(key).set(val);
    }
    public static void setStr(String key, String val, long seconds) {
        client.getBucket(key).set(val, seconds, TimeUnit.SECONDS);
    }
}
