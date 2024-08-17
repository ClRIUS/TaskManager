package com.cirion.taskManager.task.application.api;

import com.cirion.taskManager.task.domain.Task;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class TaskListResponse {
    private UUID idTask;
    private String taskName;
    private boolean completed;

    public static List<TaskListResponse> convert(List<Task> tasks) {
        return tasks.stream()
                .map(TaskListResponse::new)
                .collect(Collectors.toList());
    }
    public TaskListResponse(Task task) {
        this.idTask = task.getIdTask();
        this.taskName = task.getTaskName();
        this.completed = task.isCompleted();
    }
}
