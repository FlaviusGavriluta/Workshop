package org.example;

import java.time.LocalDate;

public class Mentor extends User {
    private Room currentRoom;
    private String githubAccount;

    public Mentor(String name, String location, LocalDate startedCodeCoolDate, String email, Room currentRoom, String githubAccount) {
        super(name, location, startedCodeCoolDate, email);
        this.currentRoom = currentRoom;
        this.githubAccount = githubAccount;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String getGithubAccount() {
        return githubAccount;
    }

    public void setGithubAccount(String githubAccount) {
        this.githubAccount = githubAccount;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "currentRoom=" + currentRoom +
                ", githubAccount='" + githubAccount + '\'' +
                '}';
    }
}
