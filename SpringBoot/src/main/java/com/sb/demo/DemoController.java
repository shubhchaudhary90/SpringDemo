package com.sb.demo;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	String s="a,b,c";
	@RequestMapping("/demo")
	public Object getDemo(){
		return (s);
	}

}
