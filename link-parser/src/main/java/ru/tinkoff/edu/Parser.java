package ru.tinkoff.edu;

import ru.tinkoff.edu.data.GitHub;
import ru.tinkoff.edu.data.SOW;
import ru.tinkoff.edu.parsers.GitHubParser;
import ru.tinkoff.edu.parsers.SOWParser;

public class Parser {
    public void parse(String link) {
        try {

            link = link.strip();

            if (link.contains("github.com")) {
                String data = new GitHubParser().parse(link);
                GitHub response = new GitHub(data.split(":")[0],data.split(":")[1]);
                System.out.println(response);
            }
            else if (link.contains("stackoverflow.com")) {
                String data = new SOWParser().parse(link);
                SOW response = new SOW(data);
                System.out.println(response);
            }else {
                throw new RuntimeException("something wrong");
            }

        }catch (Exception e){
            throw new RuntimeException("something wrong");
        }

    }

    public static void main(String[] args) {
        new Parser().parse("https://github.com/sanyarnd/tinkoff-java-course-2022/");
    }

}
//        https://github.com/sanyarnd/tinkoff-java-course-2022/
//        https://stackoverflow.com/questions/1642028/what-is-the-operator-in-c
//        https://stackoverflow.com/search?q=unsupported%20link
