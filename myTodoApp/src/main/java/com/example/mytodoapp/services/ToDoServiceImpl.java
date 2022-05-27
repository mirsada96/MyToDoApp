package com.example.mytodoapp.services;

import java.util.List;
import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.mytodoapp.dto.ToDoDto;
import com.example.mytodoapp.entities.ToDo;
import com.example.mytodoapp.repository.TodoRepository;
import com.example.mytodoapp.utils.ToDoUtils;

@Service
//stabilisce che metodo è transazionale
public class ToDoServiceImpl implements ToDoService {
	
	//faccio injection dei get & set in ToDoServiceImpl
	@Autowired
	private TodoRepository todoRepository;
	
	

	@Override
	@Transactional(propagation = Propagation.NEVER, readOnly = true)
	public List<ToDoDto> findAll() {
		List<ToDoDto> toDoDto;
		List<ToDo> toDo = todoRepository.findAll();
		return toDoDto=toDo.stream().map(
				u-> ToDoUtils.fromVoToDto(u)).collect(Collectors.toList());
	}



	@Override
	public ToDo findToDoById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Integer save(ToDoDto dto) {
		//passo da DTO a entity + salvataggio
		todoRepository.save(ToDoUtils.fromDtoToVo(dto));
		return null;
	}

//

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Integer id) {
		//elimino utente
	//	todoRepository.delete(todoRepository.findById(id).get());
	}



	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public ToDoDto update(Integer pk, ToDoDto dto) {
	// qui dovrei modificare il record che mi arriva come DTO dal Frontend
		//dovrei usare saveAndFlush
		return null;
	}
	

}
