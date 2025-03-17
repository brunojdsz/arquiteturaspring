package com.project.brunojdsz.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    @Autowired
    private TodoRepository repository;

    public void validate(TodoEntity todo){
        if(existTodoWithDescription(todo.getDescription())){
            throw new IllegalArgumentException("Already exist Todo with this description");
        }
    }

    private Boolean existTodoWithDescription(String description){
        return repository.existsByDescription(description);
    }
}
