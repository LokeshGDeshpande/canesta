package com.game.canesta.model;

public class Profile {

    private String name;
    private Team team;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public enum Team {
        A("A"), B("B");

        public final String label;

        private Team(String label) {
            this.label = label;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
