package br.com.odaguiri.kids;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.odaguiri.kids.entity.Book;
import br.com.odaguiri.kids.repository.BookRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Book pepa = new Book("Pepa Pig", "Editora Cartoon", "Infantil", 2017);
		Book patrulha = new Book("Patrulha Canina", "Editora Discovery Kids", "Infantil", 2016);
		Book superWings = new Book("Super Wings", "Editora Nick Jr.", "Infantil", 2017);
		bookRepository.save(pepa);
		bookRepository.save(patrulha);
		bookRepository.save(superWings);
	}

}
