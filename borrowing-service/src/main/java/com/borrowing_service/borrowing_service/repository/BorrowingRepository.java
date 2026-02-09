/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.borrowing_service.borrowing_service.repository;

import com.borrowing_service.borrowing_service.model.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AL
 */
public interface BorrowingRepository extends JpaRepository<Borrowing, Long>{
    
}
