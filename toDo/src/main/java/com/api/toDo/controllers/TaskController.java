package com.api.toDo.controllers;

import com.api.toDo.models.TaskModel;
import com.api.toDo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")

public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ArrayList<TaskModel> getTasks(){
        return this.taskService.getTasks();
    }

    @PostMapping
    public TaskModel saveTask(@RequestBody TaskModel task){
        return this.taskService.saveTask(task);
    }

    @GetMapping(path = "/{id}")
    public Optional<TaskModel> getById(@PathVariable Long id){
        return this.taskService.getById(id);
    }

    @PatchMapping(path = "/{id}")
    public TaskModel updateUserById(@RequestBody TaskModel request ,@PathVariable("id") Long id){
        return this.taskService.updateByID(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.taskService.deleteTask(id);

        if(ok){
            return "Task deleted";
        } else{
            return "Failed deletation";
        }
    }
}
