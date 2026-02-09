/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.borrowing_service.borrowing_service.client;

import com.borrowing_service.borrowing_service.dto.BookResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author AL
 */
@FeignClient(name = "book-service")
public interface BookClient {
    @GetMapping("/api/books/{id}")
    BookResponse getBookById(@PathVariable("id") Long id);
}
