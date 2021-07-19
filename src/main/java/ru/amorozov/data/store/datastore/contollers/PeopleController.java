package ru.amorozov.data.store.datastore.contollers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.amorozov.data.store.datastore.dto.PeopleDto;
import ru.amorozov.data.store.datastore.entities.People;
import ru.amorozov.data.store.datastore.services.PeopleService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PeopleController {
    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public List<PeopleDto> getAllPeople() {
        return peopleService.findAll();
    }

    @GetMapping("/{id}/age")
    public Long getAge(@RequestParam Long id) {
        return peopleService.getAge(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPeople(@RequestBody PeopleDto peopleDto) {
        peopleService.save(peopleDto);
    }
}
