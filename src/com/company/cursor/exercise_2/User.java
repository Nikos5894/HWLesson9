package com.company.cursor.exercise_2;

import java.time.LocalDate;

public class User {
    private String email;
    private LocalDate loginDate;
    private Team team;

    public User() {
        email = " ";
        loginDate = LocalDate.of(2000, 1, 1);
        team = null;
    }

    public User(String email, LocalDate loginDate, Team team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDate loginDate) {
        this.loginDate = loginDate;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", loginDate=" + loginDate +
                '}';
    }
}
