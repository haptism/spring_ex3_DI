package com.iu.notice;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Inject
	private NoticeDAO noticeDAO;
	
	public void insert()throws Exception{
		System.out.println("Notice Service");
		noticeDAO.insert();
	}

}
