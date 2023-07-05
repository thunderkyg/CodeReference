/**
 작성자 : devsmaru
 */

package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CodeReferenceController {
 
	
	@RequestMapping(value="/")
	public void test(Model model) throws Exception {
		System.out.println("controller");
	}
}