package com.myboard.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	private int num;
	private String userid;
	private String passwd;
	private String subject;
	private String content;
	private Date wdate;
	private int readnum;
	
	private String filename;		// 물리적 파일명 uuid_파일명
	private String originFilename;	// 원본 파일명
	private long filesize;
	
	private String old_filename;	// 예전에 첨부한 파일명 - 글 수정 시 필요
}
