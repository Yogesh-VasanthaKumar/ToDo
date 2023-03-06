package com.project.todo.Service;

import com.project.todo.Model.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    public static List<ToDo> list= new ArrayList<>();
    static {
        list.add(new ToDo(1,true,"Java"));
    }
    public List<ToDo> getAll(){
        return list;
    }

    public String add(String Name){
       list.add(new ToDo(list.size()+1,true,Name));
       return "Created";

    }

}
