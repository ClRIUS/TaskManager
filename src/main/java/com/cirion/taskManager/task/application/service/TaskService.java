package com.cirion.taskManager.task.application.service;

import com.cirion.taskManager.task.application.api.*;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    TaskResponse createTask(TaskRequest taskRequest);
    List<TaskListResponse> listTasks();
    TaskDetailResponse findTask(UUID idTask);
    void updateTask(UUID idTask, TaskUpdateRequest taskUpdateRequest);
}
