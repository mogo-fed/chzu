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
	public Integer addOrder(int userid, int sellerid, String[] mdids) {
		//TODO 添加事务 transaction

		String order_number=sellerid.toString()+userid.toString()+mdid.toString()+order_create_time;
		String order_create_time=new Date().getTime().toString();

		for(int i=0;i<mdids.length;i++){
			String[] _mdid=mdids[i].split("-");
			Integer order_single_number=Integer.parseInt(_mdid[0]);
			Integer mdid=Integer.parseInt(_mdid[1]);

			orderDao.addOrder( userid, sellerid, mdid, order_create_time, order_number, order_single_number);
		}
		
		
		return 1;

	}

}
