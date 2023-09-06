package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Journey {
    private List<Mentor> mentors;
    private List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }

    public Journey() {
        mentors = new ArrayList<>();
        rooms = new ArrayList<>();


        List<Student> studentList = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        Map<LocalDate, Attendance> attendanceMap = new HashMap<>();
        attendanceMap.put(LocalDate.now(), Attendance.PRESENT);

        studentList.add(new Student("Flavius", "Timis", LocalDate.now(), "Flavius@gmail.com", LocalDate.now(), "examples", attendanceMap));
        studentList.add(new Student("Flavius2", "Timis2", LocalDate.now(), "Flavius2@gmail.com", LocalDate.now(), "examples2", attendanceMap));
        studentList.add(new Student("Flavius3", "Timis3", LocalDate.now(), "Flavius3@gmail.com", LocalDate.now(), "examples3", attendanceMap));

        studentList2.add(new Student("Flaviu", "Timi", LocalDate.now(), "Flaviu@gmail.com", LocalDate.now(), "example", attendanceMap));
        studentList2.add(new Student("Flaviu2", "Timi2", LocalDate.now(), "Flaviu2@gmail.com", LocalDate.now(), "example2", attendanceMap));
        studentList2.add(new Student("Flaviu3", "Timi3", LocalDate.now(), "Flaviu3@gmail.com", LocalDate.now(), "example3", attendanceMap));

        Room room = new Room("Red room", Color.RED, studentList);
        Room room2 = new Room("Blue room", Color.BLUE, studentList2);

        rooms.add(room);
        rooms.add(room2);

        mentors.add(new Mentor("Tavi", "Cluj", LocalDate.now(), "Tavi@gmail.com", room, "Tavi"));
        mentors.add(new Mentor("Tavi2", "Cluj2", LocalDate.now(), "Tavi2@gmail.com", room2, "Tavi2"));


    }

    public List<User> usersOnSameDate(LocalDate date) {
        List<User> mentorsResult = mentors.stream()
                .filter(mentor -> mentor.getStartedCodeCoolDate().equals(date))
                .collect(Collectors.toList());

        List<User> studentsResult = rooms.stream()
                .flatMap(room -> room.getStudents().stream()
                        .filter(student -> student.getStartDateCurrentRoom().equals(date)))
                .collect(Collectors.toList());

        mentorsResult.addAll(studentsResult);
        return mentorsResult;
    }

    public List<String> studentsNameBySpecificRoom(Room room) {
        return room.getStudents().stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }

    public List<Student> studentsAlwaysPresent() {
        return rooms.stream()
                .flatMap(room -> room.getStudents().stream()
                        .filter(student -> student.getAttendanceMap().values().stream()
                                .allMatch(attendance -> attendance.equals(Attendance.PRESENT))))
                .collect(Collectors.toList());
    }
}