package com.leo.common.vo;

import com.sun.scenario.effect.impl.prism.ps.PPSBlend_ADDPeer;
import lombok.Data;

/**
 * projectName: ManevTest
 *
 * @author: 徐林旗
 * time:2020/11/5 23:17
 * desription:
 */
@Data
public class R<T> {
    private int code; // 返回码
    private String msg; // 返回码的字符串信息
    private T data; // 返回的数据

    public static <T> R setR(int c, String m, T obj) {
        R r = new R();
        r.setCode(c);
        r.setData(obj);
        r.setMsg(m);
        return r;
    }
    // 成功
    public static R ok() {
        return setR(1, "ok", null);
    }
    // 成功
    public static <T> R ok (T t) {
        return setR(1, "ok", t);
    }
    // 失败
    public static R fail() {
        return setR(2, "Fail", null);
    }
    public static R fail(String msg) {
        return setR(1, msg, null);
    }
}