package com.soecode.lyf.web;

import com.soecode.lyf.entity.Order;
import com.soecode.lyf.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/order") // url:/模块/资源/{id}/细分 /seckill/list
public class OrderController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private OrderService orderService;
	@RequestMapping(value = "/queryOrderAll", method = RequestMethod.GET)
	@ResponseBody
	private List<Order> list(@Param("userid") int userid) {
		List<Order> list= orderService.queryOrderAll(userid);
		return list;
	}

	@RequestMapping(value = "/addOrder", method = RequestMethod.GET)
	@ResponseBody
	private String addOrder(@Param("userid") int userid, @Param("sellerid") int sellerid, @Param("mdid") int mdid,
							@Param("order_create_time") String order_create_time, @Param("order_number") String order_number,
							@Param("order_total_price") String order_total_price,@Param("order_single_number") int order_single_number) {
		Integer addList = orderService.addOrder(userid, sellerid, mdid, order_create_time, order_number, order_total_price, order_single_number);
		return Integer.toString(addList);
	}

}
