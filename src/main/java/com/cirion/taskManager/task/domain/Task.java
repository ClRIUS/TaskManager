package com.cirion.taskManager.task.domain;

import com.cirion.taskManager.task.application.api.TaskRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.UUID;

@Getter
@Entity(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idTask;
    @NotBlank
    private String taskName;
    @NotNull
    private TaskPriority taskPriority;
    private boolean completed;

    public Task(TaskRequest taskRequest) {
        this.taskName = taskRequest.getTaskName();
        this.taskPriority = taskRequest.getTaskPriority();
        this.completed = false;
    }
}
