package ebus.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import ebus.service.MysqlUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    MysqlUserService mysqlService;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{

		return new ModelAndView("home");
	}
}
