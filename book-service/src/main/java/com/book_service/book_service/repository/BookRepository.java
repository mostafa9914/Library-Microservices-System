/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.book_service.book_service.repository;

import com.book_service.book_service.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AL
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
