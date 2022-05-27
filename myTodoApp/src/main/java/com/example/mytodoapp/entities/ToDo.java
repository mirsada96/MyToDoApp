package com.example.mytodoapp.entities;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.*;


@Entity
@Table(name = "todo")
public class ToDo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "text")
	private String text;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "creationDate")
	@Temporal(TemporalType.DATE)
	private Date toDoCreationDate;
	
	@Column(name = "expireDate")
	@Temporal(TemporalType.DATE)
	private Date toDoExpireDate;

	public ToDo() {
	}
	
	public ToDo(long id, String title, String text, int status, Date toDoCreationDate, Date toDoExpireDate) {
		super();
		this.id = id;
		this.title = title;
		this.text = text;
		this.status = status;
		this.toDoCreationDate = toDoCreationDate;
		this.toDoExpireDate = toDoExpireDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setToDoName(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
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

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", toDoName=" + title + ", text=" + text + ", status=" + status
				+ ", toDoCreationDate=" + toDoCreationDate + ", toDoExpireDate=" + toDoExpireDate + "]";
	}
	

}
