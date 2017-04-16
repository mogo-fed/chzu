package com.soecode.lyf.dao;

import com.soecode.lyf.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {

	/**
	 * 查询
	 * @return
	 */
	List<Order> queryOrderAll(@Param("userid") int userid);

	/**
	 * 添加
	 * @param
	 * @return
	 */
	Integer addOrder(@Param("userid") int userid, @Param("sellerid") int sellerid, @Param("mdid") int mdid,
					 @Param("order_create_time") String order_create_time, @Param("order_number") String order_number,
					 @Param("order_total_price") String order_total_price,@Param("order_single_number") int order_single_number);

}
