package com.example.crud.smth;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class YandexMapCompany {

    @Builder.Default
    String inn = "faf";
    @Builder.Default
    String ogrn = "zcz";
    Phone phone;

    @Data
    @Builder
    @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
    static class Phone {
        String number;
        @Builder.Default
        String second = "afafaf";
        @Builder.Default
        String third = "three three";
    }


}
