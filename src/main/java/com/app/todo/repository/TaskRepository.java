package com.app.todo.repository;

import com.app.todo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

//this will interface with the database 
public interface TaskRepository extends JpaRepository <Task, Long> {
    
}
