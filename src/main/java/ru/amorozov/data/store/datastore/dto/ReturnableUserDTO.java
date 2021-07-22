package ru.amorozov.data.store.datastore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.amorozov.data.store.datastore.entities.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturnableUserDTO {
    protected Long id;
    protected String firstName;
    protected String lastName;
    protected String patronymic;
    protected Long age;

    public ReturnableUserDTO(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.patronymic = user.getPatronymic();
        this.age = user.getUserAge();
    }
}
