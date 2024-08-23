package com.plantynet.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController
{
	@GetMapping("/")
	@ResponseBody
	public String test()
	{
		return "2024-08-24 firewall test";
	}
}
