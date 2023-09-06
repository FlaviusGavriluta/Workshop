package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Journey journey = new Journey();
        System.out.println("Students always present: " + journey.studentsAlwaysPresent());
        System.out.println("Users on same date: " + journey.usersOnSameDate(LocalDate.now()));
        Room room = new Room("Green", Color.GREEN, new ArrayList<>());
        System.out.println("Students name by specific Room" + journey.studentsNameBySpecificRoom(journey.getRooms().get(1)));
    }
}