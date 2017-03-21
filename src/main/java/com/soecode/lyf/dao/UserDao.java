package com.soecode.lyf.dao;

import com.soecode.lyf.entity.Book;
import com.soecode.lyf.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

	/**
	 * 查询所有
	 * @param
	 * @param
	 * @return
	 */
	List<User> queryUserAll();

	/**
	 * @param username
	 * @param userpwd
	 * @param usertype
	 * @return
	 */
	User queryByName(@Param("username") String username, @Param("userpwd") String userpwd, @Param("usertype") String usertype);


	/**
	 * @param username
	 * @param userpwd
	 * @param usertel
	 * @param useradr
	 * @return
	 */
	Integer addUser(@Param("username") String username, @Param("userpwd") String userpwd, @Param("usertel") String usertel,
					@Param("useradr") String useradr,@Param("usertype") String usertype,@Param("usersellername") String usersellername);

	/**
	 * @param username
	 * @param usertel
	 * @param useradr
	 * @return
	 */
	Integer updateUser(@Param("username") String username, @Param("usertel") String usertel,@Param("useradr") String useradr,
					   @Param("usertype") String usertype,@Param("usersellername") String usersellername);


}
