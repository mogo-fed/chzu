package com.soecode.lyf.web;

import com.soecode.lyf.entity.MenuSort;
import com.soecode.lyf.service.MenuSortService;
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
@RequestMapping("/menusort") // url:/模块/资源/{id}/细分 /seckill/list
public class MenuSortController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private MenuSortService menusortService;
	@RequestMapping(value = "/queryMenuSortAll", method = RequestMethod.GET)
	@ResponseBody
	private List<MenuSort> list() {
		List<MenuSort> list= menusortService.queryMenuSortAll();
		return list;
	}

	@RequestMapping(value = "/addMenuSort", method = RequestMethod.GET)
	@ResponseBody
	private String addMenuSort(@Param("msName") String msName) {
		Integer addList = menusortService.addMenuSort(msName);
		return Integer.toString(addList);
	}

	@RequestMapping(value = "/updateMenuSort", method = RequestMethod.GET)
	@ResponseBody
	private String updateMenuSort(@Param("msName") String msName) {
		Integer updateMenuSort = menusortService.updateMenuSort(msName);
		return updateMenuSort.toString();
	}
}