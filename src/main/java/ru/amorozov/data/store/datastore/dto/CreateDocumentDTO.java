package ru.amorozov.data.store.datastore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.amorozov.data.store.datastore.entities.Document;
import ru.amorozov.data.store.datastore.entities.TypeOfDocument;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateDocumentDTO {
    protected TypeOfDocument typeOfDocument;
    protected Long series;
    protected Long number;
    protected Date dateOfDocument;

    public CreateDocumentDTO(Document document){
        this.typeOfDocument = document.getTypeOfDocument();
        this.series = document.getSeries();
        this.number = document.getNumber();
        this.dateOfDocument = document.getDateOfDocument();
    }
}
