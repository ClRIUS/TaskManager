package com.cirion.taskManager.task.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

@Entity(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idTask;
    @NotBlank
    private String taskName;
    @NotEmpty
    private PriorityTask priorityTask;
    private boolean completed;
}
