package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.OrderDao;
import com.soecode.lyf.entity.Order;
import com.soecode.lyf.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private OrderDao orderDao;

	@Override
	public List<Order> queryOrderAll(int  userid) {
		return orderDao.queryOrderAll(userid);
	}

	@Override
	public Integer addOrder(int userid, int sellerid, int mdid, String order_create_time, String order_number,
							String order_total_price,int order_single_number) {
		return orderDao.addOrder( userid, sellerid, mdid, order_create_time, order_number, order_total_price, order_single_number);
	}

}
