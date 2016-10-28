package cn.acheng1314.controller;

import cn.acheng1314.domain.Company;
import cn.acheng1314.domain.User;
import cn.acheng1314.service.BaseService;
import cn.acheng1314.service.serviceImpl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by luozhiyun on 16/10/28.
 */
@Controller
public class BaseController {

	@Autowired
	private BaseService baseService;

	@RequestMapping(value = "/user",method = RequestMethod.GET)
	public String toprintMain(){

		return "user";
	}

	@RequestMapping(value = "/addUser",method = RequestMethod.GET)
	public String printMain(User user){

		Integer i = baseService.addUser(user);
		return "user";
	}

	@RequestMapping(value = "/company",method = RequestMethod.GET)
	public String toCompany(){

		return "company";
	}

	@RequestMapping(value = "/addCompany",method = RequestMethod.GET)
	public String company(Company company){

		 baseService.addCompany(company);
		return "company";
	}

}
