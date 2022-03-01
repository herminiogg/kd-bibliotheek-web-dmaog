package eu.kazernedossin.bibliotheekweb.dao;

import com.herminiogarcia.dmaog.dataAccess.DataAccess;
import org.springframework.cache.annotation.Cacheable;

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

    public Optional<DcText> getById(String id) {
        return dataAccess.getById(DcText.class, id);
    }

    public List<DcText> getByField(String fieldName, String value) {
        return dataAccess.getByField(DcText.class, fieldName, value);
    }

}