package com.diogoamorim.workshopmongo.dto;

import java.util.Date;

public class CommentDTO {
	
	private String text;
	private Date date;
	private AuthorDTO author;
	
	public CommentDTO() {
		
	}
	
	public CommentDTO(String text, Date date, AuthorDTO author) {
		super();
		this.text = text;
		this.date = date;
		this.author = author;
	}

}
