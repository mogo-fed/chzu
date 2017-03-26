package com.soecode.lyf.dao;

import com.soecode.lyf.entity.MenuSort;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuSortDao {

	/**
	 * 查询
	 * @return
	 */
	List<MenuSort> queryMenuSortAll();

	/**
	 * 添加
	 * @param msName
	 * @return
	 */
	Integer addMenuSort(@Param("msName") String msName);

	/**
	 * 更新
	 * @param msName
	 * @return
	 */
	Integer updateMenuSort(@Param("msName") String msName);

}
