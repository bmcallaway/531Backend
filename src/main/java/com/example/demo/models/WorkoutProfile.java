package com.example.demo.models;

import jakarta.persistence.*;

@Entity
public class WorkoutProfile {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private int squatPR;
    private int benchPR;
    private int deadliftPR;
    private int pressPr;

    private WorkoutType nextWorkout;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSquatPR() {
        return squatPR;
    }

    public void setSquatPR(int squatPR) {
        this.squatPR = squatPR;
    }

    public int getBenchPR() {
        return benchPR;
    }

    public void setBenchPR(int benchPR) {
        this.benchPR = benchPR;
    }

    public int getDeadliftPR() {
        return deadliftPR;
    }

    public void setDeadliftPR(int deadliftPR) {
        this.deadliftPR = deadliftPR;
    }

    public int getPressPr() {
        return pressPr;
    }

    public void setPressPr(int pressPr) {
        this.pressPr = pressPr;
    }

    public WorkoutType getNextWorkout() {
        return nextWorkout;
    }

    public void setNextWorkout(WorkoutType nextWorkout) {
        this.nextWorkout = nextWorkout;
    }
}
