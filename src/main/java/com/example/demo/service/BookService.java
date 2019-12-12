package com.example.demo.service;

import com.example.demo.dto.request.InsertBookRequestDTO;
import com.example.demo.dto.request.UpdateBookRequestDTO;
import com.example.demo.dto.response.DefaultResponse;
import com.example.demo.dto.response.BookDetailResponseDTO;
import com.example.demo.dto.response.BookSimpleResponseDTO;
import com.example.demo.mapper.BookMapper;
import com.example.demo.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookMapper bookMapper;

    public BookService(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public ResponseEntity saveBook(InsertBookRequestDTO newBook) {
        if(bookMapper.insertBook(newBook) != 0){
            return DefaultResponse.ok(newBook);
        }else{
            return DefaultResponse.badRequest("실패~");
        }
    }

    public List<BookSimpleResponseDTO> getAllBooks() {
        return bookMapper.getAllBooks().stream().map(BookSimpleResponseDTO::of).collect(Collectors.toList());
    }

    public BookDetailResponseDTO getBookById(int bookId) {
        return BookDetailResponseDTO.of(bookMapper.getBookById(bookId));
    }

    public boolean putBook(int bookId, UpdateBookRequestDTO puttedBook) {
        return bookMapper.updateBook(bookId, puttedBook) != 0;
    }

    public boolean deleteBook(int bookId) {
        return bookMapper.deleteBook(bookId) != 0;
    }
}