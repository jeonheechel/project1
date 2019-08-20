package com.seohyang.book;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsedController {
	
	@Autowired
	UsedDAO dao;
	
	@RequestMapping("insert.do")
	public void insert(UsedDTO usedDTO) {
		dao.insert(usedDTO);
		System.out.println("Bbs insert 요청");
	}
	@RequestMapping("delete.do")
	public void delete(UsedDTO usedDTO) {
		dao.delete(usedDTO);
		System.out.println("Bbs delete 요청");
	}
	
	/*
	 * @RequestMapping("select.do") public void select(Model model,BbsDTO bbsDTO) {
	 * bbsDTO = bdao.select(bbsDTO); System.out.println("Bbs select 요청");
	 * model.addAttribute("select", bbsDTO); }
	 * 
	 * @RequestMapping("selectAll.do") public void selectAll(Model model,BbsDTO
	 * bbsDTO) { List<BbsDTO>list = bdao.selectAll();
	 * System.out.println("Bbs selectAll 요청"); model.addAttribute("selectAll",
	 * list); }
	 */
}
