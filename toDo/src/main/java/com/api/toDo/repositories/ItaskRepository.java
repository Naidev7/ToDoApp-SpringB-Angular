package com.api.toDo.repositories;

import com.api.toDo.models.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItaskRepository extends JpaRepository<TaskModel, Long>{
}
