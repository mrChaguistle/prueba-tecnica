package com.prueba.tasksmanager.mapper;

import com.prueba.tasksmanager.model.Task;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskMapper {

    void insertTask(Task task);

    List<Task> getAllTasks();
}
