package com.myboard.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myboard.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board")
@Log4j
public class BoardController {
	
	@Resource(name="boardService")
	private BoardService boardService;
	
	@GetMapping("/home")
	public String boardHome() {
		
		return "board";
	}
	
	@GetMapping("/write")
	public String boardForm() {
		
		return "input";
	}

}
