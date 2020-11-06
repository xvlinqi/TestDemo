package com.leo.common.util;


/**
 * projectName: ManevTest
 *
 * @author: 徐林旗
 * time:2020/11/5 23:35
 * desription:
 */
public class IdGeneratorSington {
    private IdGeneratorSington(){
        generator=new IdGenerator();
    }
    private static IdGeneratorSington singlon=new IdGeneratorSington();
    public IdGenerator generator;
    public static IdGeneratorSington getInstance(){
        return singlon;
    }
}
