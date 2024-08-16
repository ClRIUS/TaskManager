package com.cirion.taskManager.task.application.infra;

import com.cirion.taskManager.task.application.repository.TaskRepository;
import com.cirion.taskManager.task.domain.Task;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Repository;

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
}
