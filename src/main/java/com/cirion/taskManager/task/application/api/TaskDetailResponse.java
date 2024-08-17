package com.cirion.taskManager.task.application.api;

import com.cirion.taskManager.task.domain.Task;
import com.cirion.taskManager.task.domain.TaskPriority;
import lombok.Value;

import java.util.UUID;

@Value
public class TaskDetailResponse {
    private UUID idTask;
    private String taskName;
    private TaskPriority taskPriority;
    private boolean completed;

    public TaskDetailResponse(Task task) {
        this.idTask = task.getIdTask();
        this.taskName = task.getTaskName();
        this.taskPriority = task.getTaskPriority();
        this.completed = task.isCompleted();
    }
}
