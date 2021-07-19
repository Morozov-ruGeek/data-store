package ru.amorozov.data.store.datastore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.amorozov.data.store.datastore.entities.People;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeopleDto {
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthday;
    private String sex;

    public PeopleDto(People people) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.sex = sex;
    }
}
