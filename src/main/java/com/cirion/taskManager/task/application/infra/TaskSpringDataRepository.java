package com.cirion.taskManager.task.application.infra;

import com.cirion.taskManager.task.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskSpringDataRepository extends JpaRepository <Task, UUID> {
}
