package com.knowledgemeet.bookstore;

import com.knowledgemeet.bookstore.entity.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class BookStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
    }

}


@RestController
@RequestMapping("/")
class BookController {

    private final BookRepository bookRepository;

    BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("books")
    ResponseEntity<List<Book>> list() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("book/{id}")
    ResponseEntity<Book> getById(@PathVariable Long id) {
        return new ResponseEntity<>(bookRepository.findById(id).get(), HttpStatus.OK);
    }

}

interface BookRepository extends JpaRepository<Book, Long> {

}