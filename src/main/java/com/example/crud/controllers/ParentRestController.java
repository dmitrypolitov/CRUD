package com.example.crud.controllers;

import com.example.crud.dto.ParentDTO;
import com.example.crud.mappers.ParentMapper;
import com.example.crud.models.Parent;
import com.example.crud.service.ParentServiceImpl;
import com.example.crud.smth.MapConfig;
import com.example.crud.smth.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class ParentRestController {

    @Autowired
    private ParentServiceImpl parentService;
    @Autowired
    private ParentMapper parentMapper;

    @Autowired
    MapConfig mapConfig;

    @Autowired
    Test test;

    @GetMapping("")
    public List<ParentDTO> getAll1() {
        return parentMapper.toDTOList(parentService.getAll());
    }

    @GetMapping("1")
    public List<ParentDTO> getAll() {
        test.dosmth();
        System.out.println("Я РАБОТАЮ");
        return null;
    }

    @PostMapping()
    public void create(@RequestBody Parent parent) {
        parentService.create(parent);
    }
}
