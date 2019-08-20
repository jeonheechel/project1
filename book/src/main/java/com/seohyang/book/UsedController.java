package com.seohyang.book;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.apache.bcel.internal.generic.RETURN;

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
	
	
	  @RequestMapping("select.do") public void select(Model model,UsedDTO usedDTO) {
	  usedDTO = dao.select(usedDTO); System.out.println("Bbs select 요청");
	  model.addAttribute("select", usedDTO); }
	  
	  @RequestMapping("selectAll.do") 
	  public String selectAll(Model model) 
	  { List<UsedDTO>list = dao.selectAll();
	  System.out.println("Bbs selectAll 요청");
	  
	  for(UsedDTO dto : list) {
	  System.out.println(dto.booktitle);
	  System.out.println(dto.bookcontent);
	  System.out.println(dto.bookgenre);
	  System.out.println(dto.bookauthor);
	  System.out.println(dto.bookprice);
	  System.out.println(dto.bookuser);
	  System.out.println(dto.booktel);
	  System.out.println(dto.bookaddr);
	  model.addAttribute("list",list); 
	  return "selectAll";
	  }
	return null;
	  
	 
	  }
}
