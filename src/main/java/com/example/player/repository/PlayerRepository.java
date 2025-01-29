package com.example.player.repository;

import java.util.*;
import com.example.player.model.Player;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player getPlayerById(int id);

    Player addPlayer(Player player);

    Player updatePlayerById(Player player, int id);

    void deletePlayerById(int id);

}