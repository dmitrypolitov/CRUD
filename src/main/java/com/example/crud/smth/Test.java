package com.example.crud.smth;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Test {

    private final MapConfig mapConfig;

    public void dosmth() {
        var yandexMapCompany = YandexMapCompany.builder()
                .inn(mapConfig.getInn())
                .ogrn(mapConfig.getOgrn())
                .phone(YandexMapCompany.Phone.builder()
                        .number(mapConfig.getNumber())
                        .build())
                .build();

        System.out.println(yandexMapCompany);
    }
}
