package com.cirion.taskManager.task.application.repository;

import com.cirion.taskManager.task.domain.Task;

public interface TaskRepository {
    Task saveTask(Task task);
}
