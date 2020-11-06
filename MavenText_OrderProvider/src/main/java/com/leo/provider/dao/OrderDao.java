package com.leo.provider.dao;


import com.leo.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: ManevTest
 *
 * @author: 徐林旗
 * time:2020/11/5 22:51
 * desription:
 */
public interface OrderDao {
    @Insert("insert into t_order(id,aid,uid,totalmoney,freemoney,paymoney,paytype,ctime,utime,flag) values(#{id},#{aid},#{uid},#{totalmoney},#{freemoney},#{paymoney},#{paytype},now(),now(),#{flag})")
    int insert(Order order);
    @Select("select * from t_order where id=#{id} and flag=1")
    Order queryById(long id);
    @Update("update t_order set flag=#{flag} where id=#{id}")
    int updateFlag(@Param("id") long id, @Param("flag") int flag);
    @Select("select * from t_order where uid=#{uid}")
    List<Order> queryByUid(int uid);

}