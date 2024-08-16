package com.cirion.taskManager.task.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class TaskController implements TaskAPI{
    @Override
    public TaskResponse createTask(TaskRequest taskRequest) {
        log.info("[Start] TaskController - createTask");
        log.info("[Finish] TaskController - createTask");
        return null;
    }
}
