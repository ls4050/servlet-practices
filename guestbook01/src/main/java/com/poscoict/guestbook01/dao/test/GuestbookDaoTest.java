package com.poscoict.guestbook01.dao.test;

import java.util.List;

import com.poscoict.guestbook01.dao.GuestbookDao;
import com.poscoict.guestbook01.vo.GuestbookVo;

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
