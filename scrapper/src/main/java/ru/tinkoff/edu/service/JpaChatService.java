package ru.tinkoff.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.tinkoff.edu.entity.Chat;
import ru.tinkoff.edu.dao.ChatDAO;

import java.util.List;

public class JpaChatService {
    @Autowired
    ChatDAO repository;

    @Transactional
    public Chat createChat(long id) {
        Chat chat = new Chat();
        return repository.save(chat);
    }

    @Transactional(readOnly = true)
    public List<Chat> getAll() {
        return repository.findAll();
    }
}
