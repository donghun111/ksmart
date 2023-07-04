package ksmart.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String mainPage(Model model) {
		
		model.addAttribute("title", "메인화면");
		model.addAttribute("contents", "spring boot mybatis");
		
		return "main";
	}
}
