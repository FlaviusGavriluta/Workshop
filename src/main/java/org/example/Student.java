package org.example;

import java.time.LocalDate;
import java.util.Map;

public class Student extends User {
    private LocalDate startDateCurrentRoom;
    private String notes;
    private Map<LocalDate,Attendance> attendanceMap;

    public Student(String name, String location, LocalDate startedCodeCoolDate, String email, LocalDate startDateCurrentRoom, String notes, Map<LocalDate, Attendance> attendanceMap) {
        super(name, location, startedCodeCoolDate, email);
        this.startDateCurrentRoom = startDateCurrentRoom;
        this.notes = notes;
        this.attendanceMap = attendanceMap;
    }

    public LocalDate getStartDateCurrentRoom() {
        return startDateCurrentRoom;
    }

    public void setStartDateCurrentRoom(LocalDate startDateCurrentRoom) {
        this.startDateCurrentRoom = startDateCurrentRoom;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Map<LocalDate, Attendance> getAttendanceMap() {
        return attendanceMap;
    }

    public void setAttendanceMap(Map<LocalDate, Attendance> attendanceMap) {
        this.attendanceMap = attendanceMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "startDateCurrentRoom=" + startDateCurrentRoom +
                ", notes='" + notes + '\'' +
                ", attendanceMap=" + attendanceMap +
                '}';
    }
}
