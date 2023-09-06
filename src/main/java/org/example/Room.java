package org.example;

import java.util.List;

public class Room {
    private String name;
    private Color color;
    private List<Student> students;

    public Room(String name, Color color, List<Student> students) {
        this.name = name;
        this.color = color;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", students=" + students +
                '}';
    }
}
