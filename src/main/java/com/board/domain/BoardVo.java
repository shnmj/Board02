package com.board.domain;

public class BoardVo {
	private int     bno;
	private String  title;
	private String  content;
	private String  writer;
	private String  regdate;
	private int     hit;
	
	// Cons ---------------------------
	public BoardVo() {}
	public BoardVo(int bno, String title, String content, 
				String writer, String regdate, int hit) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.hit = hit;
	}

	
	// G & T -----------------------------
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	// toString -----------------------------
	@Override
	public String toString() {
		return "BoardVo [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", hit=" + hit + "]";
	}
	
	
}
