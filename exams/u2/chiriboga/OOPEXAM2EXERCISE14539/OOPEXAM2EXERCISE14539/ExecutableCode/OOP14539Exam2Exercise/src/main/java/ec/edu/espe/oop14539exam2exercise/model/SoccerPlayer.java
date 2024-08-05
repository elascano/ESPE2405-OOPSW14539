/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.oop14539exam2exercise.model;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class SoccerPlayer {

    private int id;
    private String name;
    private int age;
    private int goals;
    private int matchesPlayed;

    public double calculateGoalsAverage() {
        return (goals / matchesPlayed);
    }

    public double calculateOffensiveEfficiency() {
        return (goals / matchesPlayed) * 100;
    }

    public SoccerPlayer(int id, String name, int age, int goals, int matchesPlayed) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.goals = goals;
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" + "id=" + id + ", name=" + name + ", age=" + age + ", goals=" + goals + ", matchesPlayed=" + matchesPlayed + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the goals
     */
    public int getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(int goals) {
        this.goals = goals;
    }

    /**
     * @return the matchesPlayed
     */
    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    /**
     * @param matchesPlayed the matchesPlayed to set
     */
    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

}
