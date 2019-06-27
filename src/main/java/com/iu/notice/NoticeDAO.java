package com.iu.notice;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.iu.util.DBConnecotr;

@Repository
public class NoticeDAO {
	
	@Inject
	private DBConnecotr dbConnecotr;
	
	
	public void insert() throws Exception {
		System.out.println(dbConnecotr);
		System.out.println("Notice DAO");
	}
	

}
