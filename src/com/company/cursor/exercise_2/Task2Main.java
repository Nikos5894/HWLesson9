package com.company.cursor.exercise_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task2Main {

    public static void main(String[] args) {

        User user = new User("cat@gmail.com", LocalDate.of(2022, 1, 19), Team.TEAMONE);
        User user1 = new User("dog@gmail.com", LocalDate.of(2022, 1, 17), Team.TEAMTWO);
        User user2 = new User("bird@gmail.com", LocalDate.of(2022, 1, 8), Team.TEAMTHREE);
        User user3 = new User("elephant@gmail.com", LocalDate.of(2022, 1, 4), Team.TEAMFOUR);
        User user4 = new User("mouse@gmail.com", LocalDate.of(2022, 1, 18), Team.TEAMONE);

        List<User> userList = new ArrayList<>();
        Collections.addAll(userList, user, user1, user2, user3, user4);
        System.out.println("List of users \n" + userList +  "\n");

        var newList = userList.stream()
                .filter(it -> it.getLoginDate().isAfter(LocalDate.now().minusDays(7)))
                .collect(Collectors.groupingBy(User::getTeam, Collectors.toList()));
        System.out.println("List of users who logged after week ago, group by team \n" + newList);

    }

}
