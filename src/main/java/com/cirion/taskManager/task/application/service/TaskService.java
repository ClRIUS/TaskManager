package com.cirion.taskManager.task.application.service;

import com.cirion.taskManager.task.application.api.TaskRequest;
import com.cirion.taskManager.task.application.api.TaskResponse;

public interface TaskService {
    TaskResponse createTask(TaskRequest taskRequest);
}
