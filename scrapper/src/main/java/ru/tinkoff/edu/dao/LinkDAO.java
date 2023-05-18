package ru.tinkoff.edu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.edu.entity.Link;

public interface LinkDAO extends JpaRepository<Link, Long> {
}
