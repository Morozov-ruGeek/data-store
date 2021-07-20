package ru.amorozov.data.store.datastore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.amorozov.data.store.datastore.entities.User;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserDTO {
    protected String firstName;
    protected String lastName;
    protected String patronymic;
    protected LocalDate birthday;
    protected String sex;

    public CreateUserDTO(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.patronymic = user.getPatronymic();
        this.birthday = user.getBirthday();
        this.sex = user.getSex();
    }
}
