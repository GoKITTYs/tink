package ru.tinkoff.edu.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.tinkoff.edu.jdbc.JdbcLinkService;

import java.net.URISyntaxException;
import java.sql.*;

@Slf4j
@Component
@RequiredArgsConstructor
public class LinksUpdaterScheduler {
    JdbcLinkService service;
    {
        try {
            service = new JdbcLinkService();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Scheduled(fixedDelayString = "#{@schedulerIntervalMs}")
    public void update() throws SQLException, URISyntaxException {
        service.update();

    }
}
