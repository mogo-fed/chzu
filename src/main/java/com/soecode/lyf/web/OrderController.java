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

	@RequestMapping(value = "/addOrder", method = RequestMethod.POST)
	@ResponseBody
	private String addOrder(@Param("userid") int userid, @Param("sellerid") int sellerid, @Param("mdid") String mdids) {

		//Integer order_number=sellerid.toString()+userid.toString()+mdid.toString()+order_create_time;


		Integer addList = orderService.addOrder(userid, sellerid, mdids);

		return Integer.toString(addList);
	}

}
