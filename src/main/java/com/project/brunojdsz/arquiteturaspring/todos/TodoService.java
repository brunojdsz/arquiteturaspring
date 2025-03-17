package com.project.brunojdsz.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private TodoValidator validator;

    @Autowired
    private MailSender mailSender;

    public TodoEntity save(TodoEntity todo) {
        validator.validate(todo);
        return todoRepository.save(todo);
    }

    public void updateStatus(TodoEntity todo) {
        todoRepository.save(todo);
        var status = todo.getCompleted() == Boolean.TRUE ? "Completed" : "Not Completed";
        mailSender.sendMessage("Todo: " + todo.getDescription() + " was  updated" + status);
    }

    public TodoEntity getById(Integer id){
        return this.todoRepository.findById(id).orElse(null);
    }
}
