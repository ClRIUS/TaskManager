package com.cirion.taskManager.task.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/task")
public interface TaskAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    TaskResponse createTask(@Valid @RequestBody TaskRequest taskRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<TaskListResponse> listTasks();
}
