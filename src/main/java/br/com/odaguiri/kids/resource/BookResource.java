package br.com.odaguiri.kids.resource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.odaguiri.kids.entity.Book;
import br.com.odaguiri.kids.repository.BookRepository;

@RestController
@RequestMapping("/v1/book")
public class BookResource {

	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public ResponseEntity<List<Book>> list() {
		List<Book> beers = StreamSupport
				.stream(bookRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(beers);
	}
}
