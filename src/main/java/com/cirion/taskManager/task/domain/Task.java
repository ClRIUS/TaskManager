package com.cirion.taskManager.task.domain;

import com.cirion.taskManager.task.application.api.TaskRequest;
import com.cirion.taskManager.task.application.api.TaskUpdateRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Entity(name = "Task")
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idTask;
    @NotBlank
    private String taskName;
    @NotNull
    private TaskPriority taskPriority;
    private boolean completed = false;

    public Task(TaskRequest taskRequest) {
        this.taskName = taskRequest.getTaskName();
        this.taskPriority = taskRequest.getTaskPriority();
    }

    public void updateTask(TaskUpdateRequest taskRequest) {
        this.taskName = taskRequest.getTaskName();
        this.taskPriority = taskRequest.getTaskPriority();
        this.completed = taskRequest.isCompleted();
    }
}
