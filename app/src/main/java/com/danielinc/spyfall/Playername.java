package com.danielinc.spyfall;

public class Playername {
    private String username;
    private String role;
    private int Wins;
    public Playername(String username,String role,int Wins){
        this.username=username;
        this.role = role;
        this.Wins = Wins;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getWins() {
        return Wins;
    }

    public void setWins(int wins) {
        Wins = wins;
    }
}
