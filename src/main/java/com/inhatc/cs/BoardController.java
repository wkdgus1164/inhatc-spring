package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.inhatc.domain.BoardVO;
import com.inhatc.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Inject
	private BoardService service;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) {
		System.out.println("Register GET Called");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void registerPOST(BoardVO board, Model model) throws Exception {
		System.out.println("Register POST Called");
		service.regist(board);
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		System.out.println("Read Called");
		model.addAttribute("boardVO", service.read(bno));
	}
}
