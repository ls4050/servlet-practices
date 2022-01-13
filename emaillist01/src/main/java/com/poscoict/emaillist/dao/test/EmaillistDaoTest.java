package com.poscoict.emaillist.dao.test;

import java.util.List;

import com.poscoict.emaillist.dao.EmaillistDao;
import com.poscoict.emaillist.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {
		// 테스트 케이스 만들기 
		testInsert();
		//testFindAll();
	}
	
	private static void testInsert() {
		EmaillistVo vo = new EmaillistVo();
		vo.setFirstName("이");
		vo.setLastName("원석");
		vo.setEmail("ls4050@naver.com");
		boolean result = new EmaillistDao().insert(vo);
		System.out.println(result? "success" : "fail");
	}
	
	private static void testFindAll() {
		List<EmaillistVo> list = new EmaillistDao().findAll();
		for(EmaillistVo vo : list) {
			System.out.println(vo);
		}
//		assertEqual(2, list.size()); // 두개가 같다고 단언하는 것 
	}

}
