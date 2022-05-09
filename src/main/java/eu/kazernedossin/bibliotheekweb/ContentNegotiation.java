package eu.kazernedossin.bibliotheekweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ContentNegotiation implements WebMvcConfigurer {

    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.
            favorParameter(true).
            parameterName("format").
            ignoreAcceptHeader(false).
            defaultContentType(MediaType.TEXT_HTML).
            mediaType("turtle", MediaType.parseMediaType("text/turtle")).
            mediaType("n-triples", MediaType.parseMediaType("application/n-triples")).
            mediaType("rdf/xml", MediaType.parseMediaType("application/rdf+xml")).
            mediaType("xml", MediaType.parseMediaType("application/rdf+xml")).
            mediaType("json-ld", MediaType.parseMediaType("application/ld+json")).
            mediaType("json", MediaType.parseMediaType("application/ld+json"));
    }

}
