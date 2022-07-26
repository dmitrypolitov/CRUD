package com.example.crud.service;

import com.example.crud.models.Parent;
import com.example.crud.repositories.ParentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentServiceImpl implements ParentService{
    @Autowired
    private ParentRepo parentRepo;

    @Override
    public List<Parent> getAll() {
        return parentRepo.findAll();
    }

    @Override
    public boolean create(Parent parent) {
        parentRepo.save(parent);
        return true;
    }
}
