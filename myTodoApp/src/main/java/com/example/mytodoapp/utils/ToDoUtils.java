package com.example.mytodoapp.utils;


import com.example.mytodoapp.dto.ToDoDto;
import com.example.mytodoapp.entities.ToDo;

public class ToDoUtils {
	
	public static ToDo fromDtoToVo (ToDoDto toDoDto) {
		ToDo toDo = new ToDo();
		toDo.setId(toDoDto.getId());
		toDo.setToDoName(toDoDto.getTitle());
		toDo.setText(toDoDto.getText());
		toDo.setStatus(toDoDto.getStatus());
		toDo.setToDoCreationDate(toDoDto.getToDoCreationDate());
		toDo.setToDoExpireDate(toDoDto.getToDoExpireDate());
		return toDo;
	}
	
	public static ToDoDto fromVoToDto (ToDo toDo) {
		ToDoDto toDoDto = new ToDoDto();
		toDoDto.setId(toDo.getId());
		toDoDto.setTitle(toDo.getTitle());
		toDoDto.setText(toDo.getText());
		toDoDto.setStatus(toDo.getStatus());
		toDoDto.setToDoCreationDate(toDo.getToDoCreationDate());
		toDoDto.setToDoExpireDate(toDo.getToDoExpireDate());
		return toDoDto;
	}
}
	
