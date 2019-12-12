package com.example.demo.mapper;

import com.example.demo.dto.request.InsertBookRequestDTO;
import com.example.demo.dto.request.UpdateBookRequestDTO;
import com.example.demo.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BookMapper {

    public List<Book> getAllBooks();

    public Book getBookById(@Param("id") int id);

    public int insertBook(@Param("book") InsertBookRequestDTO book);

    public int updateBook(@Param("id") int id, @Param("book") UpdateBookRequestDTO book);

    public int deleteBook(@Param("id") int id);
}
