package com.example.apiintro.services;

import com.example.apiintro.ApiIntroApplication;
import com.example.apiintro.dto.TodoDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 12/05/2023
 */

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public List<TodoDto> getListOfTodos() {
        return ApiIntroApplication.todos;
    }

    @Override
    public TodoDto getTodoById(UUID id) {
        Optional<TodoDto> todoDto = ApiIntroApplication.todos.stream()
                .filter(item -> item.getId().toString().equals(id.toString()))
                .findFirst();
        if (!todoDto.isPresent())
            throw new RuntimeException("Could not find a todo by the provided code");
        return todoDto.get(); // get the fi
    }

    @Override
    public TodoDto saveTodo(TodoDto todoDto) {
        todoDto.setId(UUID.randomUUID());
        ApiIntroApplication.todos.add(todoDto);
        return todoDto;
    }
}
