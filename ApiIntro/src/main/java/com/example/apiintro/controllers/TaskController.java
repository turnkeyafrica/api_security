package com.example.apiintro.controllers;

import com.example.apiintro.dto.TodoDto;
import com.example.apiintro.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.UUID;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 12/05/2023
 */

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public ResponseEntity<List<TodoDto>> getListOfTodos() {
        return ResponseEntity.ok().body(taskService.getListOfTodos());
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<TodoDto> getTodoById(@PathVariable UUID taskId) {
        return ResponseEntity.ok(taskService.getTodoById(taskId));
    }

    @PostMapping
    public ResponseEntity<TodoDto> saveTod(@RequestBody TodoDto todoDto) {
        TodoDto savedTodo = taskService.saveTodo(todoDto);
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentContextPath().path("/" + savedTodo.getId()).build().toUri()).body(savedTodo);
    }
}
