package ru.tinkoff.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.tinkoff.edu.bot.TgBot;
import ru.tinkoff.edu.config.AppConfig;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class BotApp {
public static void main(String[] args) {
        var ctx = SpringApplication.run(BotApp.class, args);
        new TgBot("6270192892:AAH-uP3Q_bOJWlkr-LMs0Yr3hFJygBgc-oA");
        }
}
