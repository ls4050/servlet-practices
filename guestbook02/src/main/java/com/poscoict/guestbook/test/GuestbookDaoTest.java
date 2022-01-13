package com.poscoict.guestbook.test;

import java.util.List;

import com.poscoict.guestbook.dao.GuestbookDao;
import com.poscoict.guestbook.vo.GuestbookVo;


public class GuestbookDaoTest {

	public static void main(String[] args) {
		testfindAll();
	}
	
	public static void testfindAll() {
		List<GuestbookVo> list = new GuestbookDao().findAll();
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
	}
	
	public static void testdelete() {
		
	}
}
