package org.example;

import java.util.HashMap;

//В качестве задачи предлагаю вам реализовать код для демонстрации парадокса Монти Холла
//(https://ru.wikipedia.org/wiki/Парадокс_Монти_Холла) и наглядно убедиться в верности парадокса
//(запустить игру в цикле на 1000 и вывести итоговый счет).
//Необходимо:
//Создать свой Java Maven или Gradle проект;
//Подключите зависимость lombok и возможно какую то математическую библиотеку (напр. commons-math3)
//Самостоятельно реализовать прикладную задачу;
//Сохранить результат игр в одну из коллекций или в какой то библиотечный класс
//Вывести на экран статистику по победам и поражениям
//В качестве ответа прислать ссылку на репозиторий, в котором присутствует все важные файлы проекта (напр pom.xml)
public class Main {
    private static final int games = 1000;
    private static final HashMap<Integer, Boolean> statistics = new HashMap<>();
    public static void main(String[] args) {

        for (int i = 0; i < games; i++) {
            Game game = new Game(3);
            statistics.put(i, game.result());
        }
        results();
    }

    private static void results(){
        int victories = (int)statistics.values().stream().filter(value -> value).count();
        int defeats = games-victories;
        float victoryPercent = (float)victories/games*100;
        System.out.printf("Всего игр: %d, побед: %d, поражений: %d, процент побед: %f\n",games,victories,defeats,victoryPercent);
    }
}