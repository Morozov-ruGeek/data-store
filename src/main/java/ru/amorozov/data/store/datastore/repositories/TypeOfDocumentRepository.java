package ru.amorozov.data.store.datastore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.amorozov.data.store.datastore.entities.TypeOfDocument;

import java.util.Optional;

@Repository
public interface TypeOfDocumentRepository extends JpaRepository<TypeOfDocument, Long> {
    Optional<TypeOfDocument> findByDocumentName(String documentName);
}
