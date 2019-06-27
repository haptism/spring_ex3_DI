package com.iu.board;

import org.springframework.stereotype.Repository;

import com.iu.util.DBConnecotr;


public class BoardDAO {
	
	private DBConnecotr dbConnecotr;
	
	public BoardDAO(DBConnecotr dbConnecotr) {
		this.dbConnecotr=dbConnecotr;
	}
	
	public void insert() throws Exception {
		
		System.out.println(dbConnecotr.getConnect());
		System.out.println("DAO Insert");
		
	}

}
