package com.cirion.taskManager.task.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class TaskResponse {
    private UUID idTask;
}
