package com.cirion.taskManager.task.application.service;

import com.cirion.taskManager.task.application.api.TaskListResponse;
import com.cirion.taskManager.task.application.api.TaskRequest;
import com.cirion.taskManager.task.application.api.TaskResponse;
import com.cirion.taskManager.task.application.repository.TaskRepository;
import com.cirion.taskManager.task.domain.Task;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
