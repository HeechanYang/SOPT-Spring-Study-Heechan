package com.example.demo.controller;

import com.example.demo.dto.request.InsertBookRequestDTO;
import com.example.demo.dto.request.UpdateBookRequestDTO;
import com.example.demo.dto.response.BookDetailResponseDTO;
import com.example.demo.dto.response.BookSimpleResponseDTO;
import com.example.demo.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity saveBook(@RequestBody InsertBookRequestDTO newBook){
        return bookService.saveBook(newBook);
    }
    //
    @GetMapping
    public List<BookSimpleResponseDTO> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{bookId}")
    public BookDetailResponseDTO getBook(@PathVariable("bookId") int bookId){
        return bookService.getBookById(bookId);
    }

    @PutMapping("/{bookId}")
    public boolean putBook(@PathVariable("bookId") int bookId,
                        @RequestBody UpdateBookRequestDTO puttedBook){
        return bookService.putBook(bookId, puttedBook);
    }

    @DeleteMapping("/{bookId}")
    public boolean deleteBook(@PathVariable("bookId") int bookId){
        return bookService.deleteBook(bookId);
    }
}
