package com.cirion.taskManager.task.application.api;

import com.cirion.taskManager.task.domain.TaskPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class TaskUpdateRequest {
    @NotBlank
    @Size(min = 4)
    private String taskName;
    @NotNull
    private TaskPriority taskPriority;
}
