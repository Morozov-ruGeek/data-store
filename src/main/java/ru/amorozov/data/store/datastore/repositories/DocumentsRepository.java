package ru.amorozov.data.store.datastore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.amorozov.data.store.datastore.entities.Document;

@Repository
public interface DocumentsRepository extends JpaRepository<Document, Long> {
//    void saveDocument(Document document);
}
