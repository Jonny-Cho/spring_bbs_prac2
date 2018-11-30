package com.bbs.ex.dto;

import java.util.Date;

public class BDto {

	int bId;
	String bTitle;
	String bContent;
	Date bDate;
	Date bModify_Date;
	int bHit;
	
	public BDto() {}
	
	public BDto(int bId, String bTitle, String bContent, Date bDate, Date bModify_Date, int bHit) {
		this.bId = bId;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
		this.bModify_Date = bModify_Date;
		this.bHit = bHit;
	}
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public Date getbModify_Date() {
		return bModify_Date;
	}
	public void setbModify_Date(Date bModify_Date) {
		this.bModify_Date = bModify_Date;
	}
	public int getbHit() {
		return bHit;
	}
	public void setbHit(int bHit) {
		this.bHit = bHit;
	}

	@Override
	public String toString() {
		return "BDto [bId=" + bId + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bDate=" + bDate
				+ ", bModify_Date=" + bModify_Date + ", bHit=" + bHit + "]";
	}
	
	
	
}
