package com.example.mytodoapp.controllers;

import com.example.mytodoapp.entities.ToDo;
import com.example.mytodoapp.repository.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TodoController {

    Logger logger = LoggerFactory.getLogger(TodoController.class);
    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/todo")
    public ResponseEntity<List<ToDo>> getAll(@RequestParam(required = false) String title) {
        try {
            logger.info("getting all elements ");
            List<ToDo> tutorials = new ArrayList<ToDo>();

           //TODO

            return new ResponseEntity<>(tutorials, HttpStatus.OK);
        } catch (Exception e) {
            logger.error(" errror in getting all task {} :", e.getMessage() );
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/todo/{id}")
    public ResponseEntity<ToDo> getTaskById(@PathVariable("id") long id) {
        Optional<ToDo> task = todoRepository.findById(id);

        if (task.isPresent()) {
            return new ResponseEntity<>(task.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/todos")
    public ResponseEntity<ToDo> createTask(@RequestBody ToDo task) {
        try {
            logger.info(" saving task  ");
            ToDo _task = todoRepository
                    .save(task);
            return new ResponseEntity<>(_task, HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error(" errror in  saving  task {} :", e.getMessage() );
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    /*
    @PutMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> updateTask(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
        Optional<Tutorial> tutorialData = tutorialRepository.findById(id);

        if (tutorialData.isPresent()) {
            Tutorial _tutorial = tutorialData.get();
            _tutorial.setTitle(tutorial.getTitle());
            _tutorial.setDescription(tutorial.getDescription());
            _tutorial.setPublished(tutorial.isPublished());
            return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
        try {
            tutorialRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/todos")
    public ResponseEntity<HttpStatus> deleteAllTask() {
        try {
            tutorialRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }*/


}
