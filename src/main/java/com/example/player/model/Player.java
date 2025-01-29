// Write your code here
package com.example.player.model;

import java.util.*;

public class Player {
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId, String playerName, int jerseyNumber, String role) {

        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public int getJerseyNumber() {
        return this.jerseyNumber;
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

    public void setJerseyNumber(int name) {
        this.jerseyNumber = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
