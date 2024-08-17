package com.cirion.taskManager.task.application.api;

import com.cirion.taskManager.task.domain.Task;
import com.cirion.taskManager.task.domain.TaskPriority;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Value
public class TaskListResponse {
    private UUID idTask;
    private String taskName;
    private boolean completed;

    public static List<TaskListResponse> convert(List<Task> tasks) {
        return null;
    }
}
