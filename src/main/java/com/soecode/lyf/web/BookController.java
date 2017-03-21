package com.soecode.lyf.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.dto.Result;
import com.soecode.lyf.entity.Book;
import com.soecode.lyf.enums.AppointStateEnum;
import com.soecode.lyf.exception.NoNumberException;
import com.soecode.lyf.exception.RepeatAppointException;
import com.soecode.lyf.service.BookService;

@Controller
@RequestMapping("/book") // url:/模块/资源/{id}/细分 /seckill/list
public class BookController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	private String demo(Model model) {
		/*List<Book> list = bookService.getList();
		model.addAttribute("list", list);*/
		// list.jsp + model = ModelAndView
		return "demo";// WEB-INF/jsp/"demo".jsp
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@ResponseBody
	private String add(@Param("name") String name,@Param("number") int number) {
		Integer addList = bookService.addBook(name,number);
		return "add";// WEB-INF/jsp/"add".jsp
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	@ResponseBody
	private String updateBook(@Param("bookId") int bookId,@Param("name") String name,@Param("number") int number) {
		Integer addList = bookService.updateBook(bookId,name,number);
		return "update";// WEB-INF/jsp/"update".jsp
	}

	@RequestMapping(value = "/del", method = RequestMethod.GET)
	@ResponseBody
	private String del(@Param("bookId") int bookId) {
		Integer addList = bookService.delBook(bookId);
		return "del";// WEB-INF/jsp/"del".jsp
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	private List<Book> list(Model model) {
		List<Book> list = bookService.getList();
		//model.addAttribute("list", list);
		//System.out.print(list.get(0).getName());
		// list.jsp + model = ModelAndView
		//return "list";// WEB-INF/jsp/"list".jsp
		return list;
	}

	// ajax json
	@RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
	@ResponseBody
	private String detail(@PathVariable("bookId") Long bookId, Model model) {
		if (bookId == null) {
			return "redirect:/book/list";
		}
		Book book = bookService.getById(bookId);
		if (book == null) {
			return "forward:/book/list";
		}
		model.addAttribute("book", book);
		return "detail";
	}

	@RequestMapping(value = "/{bookId}/appoint", method = RequestMethod.POST, produces = {
			"application/json; charset=utf-8" })
	private Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId, @Param("studentId") Long studentId) {
		if (studentId == null || studentId.equals("")) {
			return new Result<>(false, "学号不能为空");
		}
		AppointExecution execution = null;
		try {
			execution = bookService.appoint(bookId, studentId);
		} catch (NoNumberException e1) {
			execution = new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
		} catch (RepeatAppointException e2) {
			execution = new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
		} catch (Exception e) {
			execution = new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
		}
		return new Result<AppointExecution>(true, execution);
	}

}
