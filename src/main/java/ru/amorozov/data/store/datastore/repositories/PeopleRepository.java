package ru.amorozov.data.store.datastore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.amorozov.data.store.datastore.entities.People;

import java.time.LocalDate;
import java.util.Date;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {
    LocalDate findBirthdayByPeopleId(Long id);
}
