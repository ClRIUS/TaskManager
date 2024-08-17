package com.cirion.taskManager.task.application.repository;

import com.cirion.taskManager.task.domain.Task;

import java.util.List;
import java.util.UUID;

public interface TaskRepository {
    Task saveTask(Task task);
    List<Task> listAllTasks();
    Task findTaskById(UUID idTask);
}
