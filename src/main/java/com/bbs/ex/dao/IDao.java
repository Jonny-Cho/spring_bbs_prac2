package com.bbs.ex.dao;

import java.util.ArrayList;

import com.bbs.ex.dto.BDto;

public interface IDao {

	public ArrayList<BDto> list();
	public void write(String bTitle, String bContent);
	public void update(String bTitle, String bContent, String bId);
	public BDto update_view(String strID);
	public BDto content_view(String strID);
	public void upHit(String bId);
	public void delete(String bId);
	public ArrayList<BDto> search(String StrName);
	
}
