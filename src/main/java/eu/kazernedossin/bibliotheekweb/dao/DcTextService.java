package eu.kazernedossin.bibliotheekweb.dao;

import com.herminiogarcia.dmaog.dataAccess.DataAccess;
import eu.kazernedossin.bibliotheekweb.dao.DataAccessSingleton;
import eu.kazernedossin.bibliotheekweb.dao.DcText;

import java.util.List;
import java.util.Optional;

public class DcTextService {

    private DataAccess dataAccess;

    public DcTextService() {
        this.dataAccess = DataAccessSingleton.getInstance();
    }

    public List<DcText> getAll() {
        return dataAccess.getAll(DcText.class);
    }

    public String getAll(String rdfFormat) {
        return dataAccess.getAll(DcText.class, rdfFormat);
    }

    public Optional<DcText> getById(String id) {
        return dataAccess.getById(DcText.class, id);
    }

    public String getById(String id, String rdfFormat) {
        return dataAccess.getById(DcText.class, id, rdfFormat);
    }

    public List<DcText> getByField(String fieldName, String value) {
        return dataAccess.getByField(DcText.class, fieldName, value);
    }

    public String getByField(String fieldName, String value, String rdfFormat) {
        return dataAccess.getByField(DcText.class, fieldName, value, rdfFormat);
    }

}