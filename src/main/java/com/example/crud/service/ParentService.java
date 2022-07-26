package com.example.crud.service;

import com.example.crud.models.Parent;

import java.util.List;

public interface ParentService {
    List<Parent> getAll();

    boolean create(Parent parent);
}
