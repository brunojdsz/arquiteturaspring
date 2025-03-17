package com.project.brunojdsz.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class TodoController {

    @Autowired
    private TodoService service;

    @PostMapping
    public TodoEntity save (@RequestBody TodoEntity todoEntity){
        try {
            return this.service.save(todoEntity);
        }  catch (IllegalArgumentException ex){
            var errorMessage = ex.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, errorMessage);
        }
    }

    @PatchMapping("{id}")
    public void updateStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);
        this.service.updateStatus(todo);
    }

    @GetMapping("{id}")
    public TodoEntity get(@PathVariable("id") Integer id){
        return this.service.getById(id);
    }
}
