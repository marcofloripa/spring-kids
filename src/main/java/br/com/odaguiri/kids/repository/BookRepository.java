package br.com.odaguiri.kids.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.odaguiri.kids.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
