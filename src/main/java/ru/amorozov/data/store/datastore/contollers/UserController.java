package ru.amorozov.data.store.datastore.contollers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import ru.amorozov.data.store.datastore.dto.CreateUserDTO;
import ru.amorozov.data.store.datastore.dto.ReturnableUserDTO;
import ru.amorozov.data.store.datastore.error_handling.InvalidDataException;
import ru.amorozov.data.store.datastore.services.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<CreateUserDTO> getAllPeople() {
        return userService.findAll();
    }

    @GetMapping("/age/{id}")
    public ReturnableUserDTO getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody CreateUserDTO createUserDTO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            throw new InvalidDataException(bindingResult.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.toList()));
        }
        userService.createUser(createUserDTO);
    }
}
