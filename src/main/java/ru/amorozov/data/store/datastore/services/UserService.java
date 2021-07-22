package ru.amorozov.data.store.datastore.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.amorozov.data.store.datastore.dto.CreateUserDTO;
import ru.amorozov.data.store.datastore.dto.ReturnableUserDTO;
import ru.amorozov.data.store.datastore.entities.User;
import ru.amorozov.data.store.datastore.error_handling.ResourceNotFoundException;
import ru.amorozov.data.store.datastore.repositories.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<CreateUserDTO> findAll() {
        return userRepository.findAll().stream().map(CreateUserDTO::new).collect(Collectors.toList());
    }

    public CreateUserDTO createUser(CreateUserDTO createUserDTO) {
        User user = new User();
        user.setFirstName(createUserDTO.getFirstName());
        user.setLastName(createUserDTO.getLastName());
        user.setBirthday(createUserDTO.getBirthday());
        user.setPatronymic(createUserDTO.getPatronymic());
        user.setSex(createUserDTO.getSex());
        userRepository.save(user);
        return new CreateUserDTO(user);
    }

    public ReturnableUserDTO getUser(Long id) {
        Optional<User> user = Optional.ofNullable(userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User doesn't exists id: " + id)));
        ReturnableUserDTO returnableUserDTO = new ReturnableUserDTO();
        returnableUserDTO.setId(user.get().getId());
        returnableUserDTO.setFirstName(user.get().getFirstName());
        returnableUserDTO.setLastName(user.get().getLastName());
        returnableUserDTO.setPatronymic(user.get().getPatronymic());
        returnableUserDTO.setAge(user.get().getUserAge());
        return returnableUserDTO;
    }


}
