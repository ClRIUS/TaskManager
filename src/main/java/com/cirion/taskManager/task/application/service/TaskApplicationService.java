package com.cirion.taskManager.task.application.service;

import com.cirion.taskManager.task.application.api.TaskRequest;
import com.cirion.taskManager.task.application.api.TaskResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class TaskApplicationService implements TaskService{
    @Override
    public TaskResponse createTask(TaskRequest taskRequest) {
        log.info("[Start] TaskApplicationService - createTask");
        log.info("[Finish] TaskApplicationService - createTask");
        return null;
    }
}
