package cn.bdqn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import cn.bdqn.entity.User;
import cn.bdqn.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> userList = userService.findUserList();
		for (User user : userList) {
			System.out.println("username:" + user.getUserName());
		}
		return "index";
	}
	
 
	@RequestMapping("/login")
	public String login(User user,HttpSession session/*HttpServletRequest req*/){
		
		/*System.out.println(userName);
		return "home";*/
		session.setAttribute("user", user);
		
		/*req.setAttribute("user", user);*/
		if(user.getUserName().equals("admin")){
			throw new NullPointerException("对象创建失败");
			
			//return "redirect:home";
		}else{
			return "index";
		}
		
	}
	
	@RequestMapping("/home")
	public String home(){
		return "home";
	}
	
	
	/*@ExceptionHandler(value=NullPointerException.class)
	public String hadlerException(NullPointerException n,HttpServletRequest req){
		req.setAttribute("msg", n.getMessage());
		return "error";
	}*/
}
