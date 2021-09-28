package com.danielinc.spyfall;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {
    String name;
    String role;
    String roomCode;
    public Player(String name,String roomCode){
        this.name = name;
        this.role = null;
        this.roomCode=roomCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
