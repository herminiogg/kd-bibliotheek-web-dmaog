package eu.kazernedossin.bibliotheekweb.domain;

public class SparqlQuery {

    private String query;

    public SparqlQuery() {}

    public String getQuery() {
        return query;
    }

    public SparqlQuery setQuery(String query) {
        this.query = query;
        return this;
    }
}
