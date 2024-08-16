package com.cirion.taskManager.task.application.service;

import com.cirion.taskManager.task.application.api.TaskListResponse;
import com.cirion.taskManager.task.application.api.TaskRequest;
import com.cirion.taskManager.task.application.api.TaskResponse;

import java.util.List;

public interface TaskService {
    TaskResponse createTask(TaskRequest taskRequest);
    List<TaskListResponse> listTasks();
}
