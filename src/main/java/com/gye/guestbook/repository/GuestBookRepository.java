package com.gye.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gye.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
