/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.borrowing_service.borrowing_service.controller;

import com.borrowing_service.borrowing_service.client.BookClient;
import com.borrowing_service.borrowing_service.dto.BookResponse;
import com.borrowing_service.borrowing_service.model.Borrowing;
import com.borrowing_service.borrowing_service.repository.BorrowingRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author AL
 */
@RestController
@RequestMapping("/api/borrowings")
public class BorrowingController {
    @Autowired
    private BorrowingRepository borrowingRepository;
    
    @Autowired
    private BookClient bookClient; 
    @PostMapping
    public Borrowing createBorrowing(@RequestBody Borrowing borrowing) {
      
        BookResponse book = bookClient.getBookById(borrowing.getBookId());
        
        
        borrowing.setBookTitleDetails(book.getTitle());
        borrowing.setBorrowDate(LocalDate.now());
        
        return borrowingRepository.save(borrowing);
    }
    @GetMapping
    public List<Borrowing> getAllBorrowings() {
        return borrowingRepository.findAll();
    }
}
