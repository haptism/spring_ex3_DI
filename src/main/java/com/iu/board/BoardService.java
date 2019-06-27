package com.iu.board;

import org.springframework.stereotype.Service;


public class BoardService {
	
	private BoardDAO boardDAO;

	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
	
	public void insert()throws Exception{
		System.out.println("Board Service");
		boardDAO.insert();
	}

}
