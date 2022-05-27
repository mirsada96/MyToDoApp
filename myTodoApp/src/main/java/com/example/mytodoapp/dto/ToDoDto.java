package com.example.mytodoapp.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.mytodoapp.entities.ToDo;

public class ToDoDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private String text;
	private Integer status;
	private Date toDoCreationDate;
	private Date toDoExpireDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getToDoCreationDate() {
		return toDoCreationDate;
	}
	public void setToDoCreationDate(Date toDoCreationDate) {
		this.toDoCreationDate = toDoCreationDate;
	}
	public Date getToDoExpireDate() {
		return toDoExpireDate;
	}
	public void setToDoExpireDate(Date toDoExpireDate) {
		this.toDoExpireDate = toDoExpireDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ToDoDto fromEntity(ToDo entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.text = entity.getText();
		this.status = entity.getStatus();
		this.toDoCreationDate = entity.getToDoCreationDate();
		this.toDoExpireDate = entity.getToDoExpireDate();
		return this;
	}

	
}
