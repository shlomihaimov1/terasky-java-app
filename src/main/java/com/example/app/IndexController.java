package com.example.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "Hello TeraSky, how are you!!!!!!!!!!!!";
	}
}