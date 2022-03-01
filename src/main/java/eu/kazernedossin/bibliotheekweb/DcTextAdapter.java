package eu.kazernedossin.bibliotheekweb;

import eu.kazernedossin.bibliotheekweb.dao.DcText;
import eu.kazernedossin.bibliotheekweb.dao.DcTextService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DcTextAdapter {

    @Cacheable("books")
    public List<DcText> getAllBooks() {
        return new DcTextService().getAll();
    }

    public Optional<DcText> getBook(String id) {
        return new DcTextService().getById(id);
    }
}
