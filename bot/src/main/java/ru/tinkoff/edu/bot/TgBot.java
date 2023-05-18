package ru.tinkoff.edu.bot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.request.SetMyCommands;
import org.springframework.stereotype.Component;

public class TgBot {
    static TelegramBot bot;
    BotCommand[] commands = {
            new BotCommand("start", "зарегестрировать пользователя"),
            new BotCommand("help", "вывести окно с командами"),
            new BotCommand("track", "начать отслеживание ссылки"),
            new BotCommand("untrack", "прекратить отслеживание ссылки"),
            new BotCommand("list", "показать список отслеживаемых ссылок")
    };
    public TgBot(String token){
        bot = new TelegramBot(token);
        bot.execute(new SetMyCommands(commands));
        bot.setUpdatesListener(new MessageProcessor(bot));
    }

    public static TelegramBot getBot(){
        return bot;
    }

}
