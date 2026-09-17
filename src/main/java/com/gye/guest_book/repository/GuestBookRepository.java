package com.gye.guest_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gye.guest_book.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
