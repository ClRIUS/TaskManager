package com.cirion.taskManager.task.application.api;

import com.cirion.taskManager.task.application.service.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class TaskController implements TaskAPI{

    private final TaskService taskService;

    @Override
    public TaskResponse createTask(TaskRequest taskRequest) {
        log.info("[Start] TaskController - createTask");
        TaskResponse taskCreated = taskService.createTask(taskRequest);
        log.info("[Finish] TaskController - createTask");
        return taskCreated;
    }
}
