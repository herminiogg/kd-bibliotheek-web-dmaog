package eu.kazernedossin.bibliotheekweb;

import eu.kazernedossin.bibliotheekweb.dao.DcText;
import eu.kazernedossin.bibliotheekweb.dao.DcTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(maxAge = 3600)
@Controller
public class BiblioteekWebApplication {

	@Autowired
	private DcTextAdapter dcTextAdapter;

	@Autowired
	private CacheManager cacheManager;

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String books(Model model) {
		List<DcText> books = dcTextAdapter.getAllBooks();
		model.addAttribute("books", books);
		return "books";
	}

	@GetMapping(value = "/books/{id}")
	public String book(@PathVariable String id, Model model) {
		Optional<DcText> book = dcTextAdapter.getBook(id);
		model.addAttribute("book", book.get());
		return "book";
	}

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}

	// SPARQL endpoint
	@GetMapping(value = "/sparql")
	public String sparql() {
		return "sparql";
	}

	@CrossOrigin("*")
	@PostMapping(value = "/sparql")
	public String postSparql() {
		return "redirect:http://bibliotheek.kazernedossin.eu:3000/sparql";
	}

	@Scheduled(fixedRate = 5 * 60 * 1000)
	public void removeCache() {
		Cache cache = cacheManager.getCache("books");
		if(cache != null) {
			cache.clear();
		}
	}

}
