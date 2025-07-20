package com.example.springkadaitodo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.repository.ToDoRepository;

@Service
public class ToDoService {
    private final ToDoRepository todoRepository;

    public ToDoService(ToDoRepository userRepository) {
        this.todoRepository = userRepository;
    }

    // ToDoの一括取得メソッド
    public List<ToDo> getAllTodos() {
    	
        return todoRepository.findAll();
    }
}