package com.example.crud.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObjectMapperTest {

    @Test
    public void testDefaultDeepMapMerge() throws Exception
    {
        ObjectMapper objectMapper = new ObjectMapper();
        HashMap<String,Object> input = new HashMap<>();
        input.put("list", new ArrayList<>(Arrays.asList("a")));

        Map<?,?> resultMap = objectMapper.readerForUpdating(input)
                .readValue("{\"list\":[\"b\"]}");

        List<?> resultList = (List<?>) resultMap.get("list");
        System.out.println(resultMap);
        System.out.println(input == resultMap);
        assertEquals(Arrays.asList("a", "b"), resultList);
    }

    @Test
    public void testDefaultDeepMapMerge2() throws Exception
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDefaultMergeable(false);
        HashMap<String,Object> input = new HashMap<>();
        input.put("list", new ArrayList<>(Arrays.asList("a")));

        Map<?,?> resultMap = objectMapper.readerForUpdating(input)
                .readValue("{\"list\":[\"b\"]}");

        List<?> resultList = (List<?>) resultMap.get("list");
        System.out.println(resultMap);
        assertEquals(Arrays.asList("b"), resultList);
    }

}
