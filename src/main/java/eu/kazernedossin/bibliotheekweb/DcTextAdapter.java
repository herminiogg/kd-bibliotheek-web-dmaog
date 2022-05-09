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

    public String getAllBooksTurtle() {
        return new DcTextService().getAll("turtle");
    }

    public String getAllBooksNTriples() {
        return new DcTextService().getAll("N-Triples");
    }

    public String getAllBooksXML() {
        return new DcTextService().getAll("RDF/XML");
    }

    public String getAllBooksJson() {
        return new DcTextService().getAll("JSON-LD");
    }

    public Optional<DcText> getBook(String id) {
        return new DcTextService().getById(id);
    }

    public String getBookTurtle(String id) {
        return new DcTextService().getById(id, "turtle");
    }

    public String getBookNtriples(String id) {
        return new DcTextService().getById(id, "N-Triples");
    }

    public String getBookXML(String id) {
        return new DcTextService().getById(id, "RDF/XML");
    }

    public String getBookJson(String id) {
        return new DcTextService().getById(id, "JSON-LD");
    }
}
