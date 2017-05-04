package com.soecode.lyf.dao;

import com.soecode.lyf.entity.OrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailDao {

	/**
	 * 查询
	 * @return
	 */
	List<OrderDetail> queryOrderDetail(@Param("userid") long userid);
}
