package com.soecode.lyf.service;

import com.soecode.lyf.entity.Order;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface OrderService {

	/**
	 * 查询所有
	 * @return
	 */
	List<Order> queryOrderAll(int userid);

	/**
	 * 增加
	 * @return
	 */
	Integer addOrder(int userid, int sellerid, int mdid, String order_create_time, String order_number,
					 String order_total_price,int order_single_number);


}
