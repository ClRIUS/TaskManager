package com.cirion.taskManager.task.application.service;

import com.cirion.taskManager.task.application.api.*;
import com.cirion.taskManager.task.application.repository.TaskRepository;
import com.cirion.taskManager.task.domain.Task;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Log4j2
@Service
@RequiredArgsConstructor
public class TaskApplicationService implements TaskService{

    private final TaskRepository taskRepository;
    @Override
    public TaskResponse createTask(TaskRequest taskRequest) {
        log.info("[Start] TaskApplicationService - createTask");
        Task task = taskRepository.saveTask(new Task(taskRequest));
        log.info("[Finish] TaskApplicationService - createTask");
        return TaskResponse.builder()
                .idTask(task.getIdTask())
                .build();
    }

    @Override
    public List<TaskListResponse> listTasks() {
        log.info("[Start] TaskApplicationService - listTasks");
        List<Task> tasks = taskRepository.listAllTasks();
        log.info("[Finish] TaskApplicationService - listTasks");
        return TaskListResponse.convert(tasks);
    }

    @Override
    public TaskDetailResponse findTask(UUID idTask) {
        log.info("[Start] TaskApplicationService - findTask");
        Task task = taskRepository.findTaskById(idTask);
        log.info("[Finish] TaskApplicationService - findTask");
        return new TaskDetailResponse(task);
    }

    @Override
    public void updateTask(UUID idTask, TaskUpdateRequest taskUpdateRequest) {
        log.info("[Start] TaskApplicationService - updateTask");
        Task task = taskRepository.findTaskById(idTask);
        task.updateTask(taskUpdateRequest);
        taskRepository.saveTask(task);
        log.info("[Finish] TaskApplicationService - updateTask");
    }

    @Override
    public void deleteTask(UUID idTask) {
        log.info("[Start] TaskApplicationService - deleteTask");
        Task task = taskRepository.findTaskById(idTask);
        taskRepository.deleteTaskById(task);
        log.info("[Finish] TaskApplicationService - deleteTask");
    }
}
