package com.jbedu.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jbedu.member.dto.MemberDto;

@Controller
public class DataController {

	@RequestMapping(value="/data")
	public String data(Model model) {
		String name = "홍길동";
		
		model.addAttribute("memberName", name); //name 값을 model 객체에 담음 -> data.jsp에 전달
		
		return "data";
	}
	
	@RequestMapping(value="/datamodel")
	public ModelAndView datamodel() {	//ModelAndView 클래스를 이용한 데이터 전달
		// modelAndView -> view에 
		int age = 27; 
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("age", age );		// 모델 객체에 데이터 담기
		mv.setViewName("datamodel"); 	// view 이름 ( jsp 이름)
		
		return mv;
	}

	@RequestMapping(value="/login")
	public String login() {	
		return "login";
	}
	
	@RequestMapping(value="/login2")
	public String login2() {	
		return "login2";
	}

	@RequestMapping(value="/login3")
	public String login3() {	
		return "login3";
	}

	@RequestMapping(value="/join")
	public String join() {	
		return "join";
	}

	@RequestMapping(value="/join2")
	public String join2() {	
		return "join2";
	}

	
	@RequestMapping(value="/confirmID") // 클라이언트의 요청을 여기서 catch 
	public String confirmID(HttpServletRequest request,Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		
//		if(mid.equals("tiger") && mpw.equals("12345") ) {
//			model.addAttribute("idcheck","memberOk");
//		} else {
//			model.addAttribute("idcheck","memberNo");
//		}
		
		model.addAttribute("loginid",mid);
		model.addAttribute("loginpw",mpw);
		
		return "confirmID";
	}
	@RequestMapping(value="/checkID", method=RequestMethod.POST) // 클라이언트의 요청을 여기서 catch 
	public String checkID(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		
		if(mid.equals("tiger") && mpw.equals("12345") ) {
			model.addAttribute("idcheck","memberOk");
			model.addAttribute("loginid",mid);
			model.addAttribute("loginpw",mpw);
		} else {
			model.addAttribute("idcheck","memberNo");
		}
		
		return "checkID";
	}	
	
	@RequestMapping(value="/checkID2") // 클라이언트의 요청을 여기서 catch 
	public String checkID2(@RequestParam("mid") String mid ,@RequestParam("mpw") String mpw , Model model) {
		
//		String mid = request.getParameter("mid");
//		String mpw = request.getParameter("mpw");
		
		if(mid.equals("tiger") && mpw.equals("12345") ) {
			model.addAttribute("idcheck","memberOk");
			model.addAttribute("loginid",mid);
			model.addAttribute("loginpw",mpw);
		} else {
			model.addAttribute("idcheck","memberNo");
		}
		
		return "checkID";
	}	
	@RequestMapping(value="/joinOk") // 클라이언트의 요청을 여기서 catch 
	public String joinOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");

//		1안 - 모델에 param을 실어보내기
//		model.addAttribute("mid", mid);
//		model.addAttribute("mpw", mpw);
//		model.addAttribute("mname", mname);
//		model.addAttribute("memail", memail);
//		

//		2안 = // model에 dto를 실어 보내자
		MemberDto memberDto = new MemberDto(mid,mpw,mname, memail); 
		model.addAttribute("memberDto", memberDto);
		
		return "joinOk";
	}	
	@RequestMapping(value="/joinOk2") // 클라이언트의 요청을 여기서 catch 
	public String joinOk2(MemberDto memberDto , Model model) {
		
//		model.addAttribute("memberDto", memberDto);
		
		return "joinOk";
	}	
}
