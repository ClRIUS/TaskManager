package com.cirion.taskManager.task.application.repository;

import com.cirion.taskManager.task.domain.Task;

import java.util.List;

public interface TaskRepository {
    Task saveTask(Task task);
    List<Task> listAllTasks();

}
