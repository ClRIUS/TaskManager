package com.cirion.taskManager.task.domain;

import jakarta.persistence.Entity;

import java.util.UUID;

@Entity(name = "Task")
public class Task {
    private UUID idTask;
    private String taskName;
    private PriorityTask priorityTask;
    private boolean completed;
}
