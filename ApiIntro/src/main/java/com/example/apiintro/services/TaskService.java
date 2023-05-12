package com.example.apiintro.services;

import com.example.apiintro.dto.TodoDto;

import java.util.List;
import java.util.UUID;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 12/05/2023
 */

public interface TaskService {

    /**
     * This method returns a list of todos
     *
     * @return list of todos
     */
    List<TodoDto> getListOfTodos();

    /**
     * This method returns a todoDto by its primary key
     *
     * @param id - the record's primary key
     * @return a todoDto
     */
    TodoDto getTodoById(UUID id);

    /**
     * This method saves a new todoDto record
     *
     * @param todoDto - the new todoDto to be saved
     * @return the persisted todoDto record
     */
    TodoDto saveTodo(TodoDto todoDto);

}
