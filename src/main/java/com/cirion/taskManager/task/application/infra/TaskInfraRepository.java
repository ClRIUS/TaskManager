package com.cirion.taskManager.task.application.infra;

import com.cirion.taskManager.task.application.repository.TaskRepository;
import com.cirion.taskManager.task.domain.Task;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class TaskInfraRepository implements TaskRepository {
    @Override
    public Task saveTask(Task task) {
        log.info("[Start] TaskInfraRepository - saveTask");
        log.info("[Finish] TaskInfraRepository - saveTask");
        return null;
    }
}
