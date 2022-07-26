package com.example.crud.service;

import com.example.crud.models.Parent;
import com.example.crud.repositories.ParentRepo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.not;
import static org.mockito.Mockito.*;

@SpringBootTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ParentServiceTest {

    @Mock
    ParentRepo parentRepo;

    @InjectMocks
    ParentServiceImpl parentServiceImpl;

    private static Parent parent1;
    private static Parent parent2;
    private static List<Parent> listOfParents;

    @BeforeAll
    static void list(){
        parent1 = Parent.builder()
                .id(1L)
                .name("Lev")
                .build();
        parent2 = Parent.builder()
                .id(2L)
                .name("Bob")
                .build();
        listOfParents = List.of(parent1, parent2);
    }

    @Test
    void getAll() {
        when(parentRepo.findAll()).thenReturn(listOfParents);
        assertThat(parentServiceImpl.getAll()).isEqualTo(listOfParents);
        verify(parentRepo, times(1)).findAll();
    }

    @Test
    void create() {
        parentServiceImpl.create(parent1);
        verify(parentRepo, times(1)).save(parent1);
    }
}