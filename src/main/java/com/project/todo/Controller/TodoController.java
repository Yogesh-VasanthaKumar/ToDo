package com.project.todo.Controller;

import com.project.todo.Model.ToDo;
import com.project.todo.Service.TodoService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    public TodoService todoService;


    @GetMapping("/list")
    public List<ToDo> getAll(){
        return todoService.getAll();
    }

    @PostMapping("/to/{name}")
    public String add(@PathVariable String name){
        return todoService.add( name);
    }

}
