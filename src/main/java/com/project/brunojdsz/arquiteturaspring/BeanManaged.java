package com.project.brunojdsz.arquiteturaspring;

import com.project.brunojdsz.arquiteturaspring.todos.TodoEntity;
import com.project.brunojdsz.arquiteturaspring.todos.TodoRepository;
import com.project.brunojdsz.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanManaged {

    private TodoValidator validator;

    public  void use(){
        var todo = new TodoEntity();
        validator.validate(todo);
    }

    @Autowired
    private void setValidator(TodoValidator validator){
        this.validator = validator;
    }
}
