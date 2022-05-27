package com.example.mytodoapp.services;

import java.util.List;

import com.example.mytodoapp.dto.ToDoDto;
import com.example.mytodoapp.entities.ToDo;

public interface ToDoService {
	
	ToDo findToDoById(Integer id);
	List<ToDoDto> findAll();
	Integer save(ToDoDto dto);
	void delete(Integer id);
	ToDoDto update(Integer pk, ToDoDto dto);

}
