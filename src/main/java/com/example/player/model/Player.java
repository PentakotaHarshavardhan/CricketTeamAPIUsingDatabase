// Write your code here
package com.example.player.model;

import java.util.*;

public class Player {
    private int playerId;
    private String playerName;
    private String jerseyName;
    private String role;

    public Player(int playerId, String playerName, String jerseyName, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyName = jerseyName;
        this.role = role;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public String getJerseyName() {
        return this.jerseyName;
    }

    public String getRole() {
        return this.role;
    }

    public void setPlayerId(int id) {
        this.playerId = id;
    }

    public void setPlayerName(String name) {
        this.playerName = name;
    }

    public void setJerseyName(String name) {
        this.jerseyName = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
