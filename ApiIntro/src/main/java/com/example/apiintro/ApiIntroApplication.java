package com.example.apiintro;

import com.example.apiintro.dto.TodoDto;
import com.example.apiintro.enums.TodoStatusEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class ApiIntroApplication {

    public static List<TodoDto> todos = new ArrayList<>();

    public static void main(String[] args) {
        todos.add(TodoDto.builder()
                .id(UUID.randomUUID())
                .status(TodoStatusEnum.PENDING)
                .title("Complete Training")
                .build());
        todos.add(TodoDto.builder()
                .id(UUID.randomUUID())
                .status(TodoStatusEnum.COMPLETED)
                .title("Take Lunch")
                .build());
        todos.add(TodoDto.builder()
                .id(UUID.randomUUID())
                .status(TodoStatusEnum.CANCELLED)
                .title("Travel Home")
                .build());
        SpringApplication.run(ApiIntroApplication.class, args);
    }

}
