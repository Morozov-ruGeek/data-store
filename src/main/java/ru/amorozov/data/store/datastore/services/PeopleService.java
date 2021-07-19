package ru.amorozov.data.store.datastore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.amorozov.data.store.datastore.dto.PeopleDto;
import ru.amorozov.data.store.datastore.entities.People;
import ru.amorozov.data.store.datastore.repositories.PeopleRepository;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<PeopleDto> findAll(){
        return peopleRepository.findAll().stream().map(PeopleDto::new).collect(Collectors.toList());
    }

    public void save(PeopleDto peopleDto) {
        People people = new People();
        people.setFirstName(peopleDto.getFirstName());
        people.setLastName(peopleDto.getLastName());
        people.setBirthday(peopleDto.getBirthday());
        people.setSex(peopleDto.getSex());
        peopleRepository.save(people);
    }

    public Long getAge(Long id){
        LocalDate birthday = peopleRepository.findBirthdayByPeopleId(id);
        LocalDate currentDate = LocalDate.now();
        Long age = ChronoUnit.YEARS.between(birthday, currentDate);
        return age;
    }
}
