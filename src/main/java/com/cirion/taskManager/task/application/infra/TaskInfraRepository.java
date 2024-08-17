package com.cirion.taskManager.task.application.infra;

import com.cirion.taskManager.task.application.repository.TaskRepository;
import com.cirion.taskManager.task.domain.Task;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class TaskInfraRepository implements TaskRepository {
    private final TaskSpringDataRepository taskSpringDataRepository;

    @Override
    public Task saveTask(Task task) {
        log.info("[Start] TaskInfraRepository - saveTask");
        taskSpringDataRepository.save(task);
        log.info("[Finish] TaskInfraRepository - saveTask");
        return task;
    }

    @Override
    public List<Task> listAllTasks() {
        log.info("[Start] TaskInfraRepository - listAllTasks");
        List<Task> allTasks = taskSpringDataRepository.findAll();
        log.info("[Finish] TaskInfraRepository - listAllTasks");
        return allTasks;
    }

    @Override
    public Task findTaskById(UUID idTask) {
        log.info("[Start] TaskInfraRepository - findTaskById");
        Task task = taskSpringDataRepository.findById(idTask)
                .orElseThrow(() -> new RuntimeException("Task not Found!"));
        log.info("[Finish] TaskInfraRepository - findTaskById");
        return task;
    }
}
