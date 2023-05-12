package com.example.apiintro.dto;

import com.example.apiintro.enums.TodoStatusEnum;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 12/05/2023
 */

@Data
@Builder
public class TodoDto {
    private UUID id;
    private String title;
    private TodoStatusEnum status;
}
