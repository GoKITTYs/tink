package ru.tinkoff.edu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.edu.entity.Chat;

public interface ChatDAO extends JpaRepository<Chat, Long> {

}
