package com.seohyang.book;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oracle.net.aso.b;

import java.util.List;

//@Component 의 자식
//@Service
@Repository		//DB 용 Bean
public class UsedDAO {
	
	
	@Autowired
	SqlSessionTemplate myb;
	
	public void insert(UsedDTO usedDTO) {
		myb.insert("uDAO.insert", usedDTO);
		System.out.println("myBatis호출");
	}
	
	public void delete(UsedDTO usedDTO) {
		myb.delete("uDAO.delete", usedDTO);
		
	}
	
	public void update(UsedDTO usedDTO) {
		myb.update("uDAO.update", usedDTO);
	}
	public UsedDTO select(UsedDTO usedDTO) {
		return myb.selectOne("uDAO.select", usedDTO);
	}
	
	public List<UsedDTO> selectAll() {
		//Mapper 파일에 있는 resultMap 으로 list를 생성해주기 떄문에 List 를 생성해주지 않아도 된다.
		return myb.selectList("uDAO.selectAll");
	}
	
	
}
