package com.example.mytodoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mytodoapp.entities.ToDo;
import org.springframework.stereotype.Repository;



@Repository
public interface TodoRepository extends JpaRepository<ToDo,Long> {

}



