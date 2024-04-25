package com.api.toDo.services;

import com.api.toDo.models.TaskModel;
import com.api.toDo.repositories.ItaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired //inyección de depend
    ItaskRepository taskRepository;

    public ArrayList<TaskModel> getTasks(){
        return (ArrayList<TaskModel>) taskRepository.findAll();
    }

    public TaskModel saveTask(TaskModel task){
        return taskRepository.save(task);
    }

    public Optional<TaskModel> getById(Long id){ //Optional tipo dato devuelve: algo o null
        return taskRepository.findById(id);
    }


    public TaskModel updateByID(TaskModel request, Long id ){
        TaskModel taskModel = taskRepository.findById(id).get();

        //setear model para añadir cambios
        taskModel.setCompleted(request.getCompleted());

        taskRepository.save(taskModel); //guardar cambios

        return taskModel;
    }

    public Boolean deleteTask (Long id){
        try{
            taskRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
