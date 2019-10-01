package flashsale.flashsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import flashsale.flashsale.domain.User;
import flashsale.flashsale.result.CodeMsg;
import flashsale.flashsale.result.Result;
import flashsale.flashsale.services.UserService;


@Controller
@RequestMapping("/demo")
public class SampleController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/hello world")
	@ResponseBody
	String home() {
		return "Hello World";
	}
	@RequestMapping("/success")
	@ResponseBody
	Result<String> hello(){
		String data="";
		return Result.success(data);
	}
	@RequestMapping("/error1")
	@ResponseBody
	Result<CodeMsg> error(){
		return Result.error(CodeMsg.SERVER_ERROR);
	}
	
	@RequestMapping("/thymeleaf")
	public String thymeleaf(Model model) {
		model.addAttribute("name", "mingxuan");
		return "hello";
	}
	
	@RequestMapping("/db/get")
	@ResponseBody
	public Result<User> doGet() {
		User user=userService.getById(1);
		return Result.success(user);
	}
	
	@RequestMapping("/db/transaction")
	@ResponseBody
	public Result<Boolean> doTransaction(){
		Boolean tx=userService.transaction();
		return Result.success(tx);
	}
	
	
}
