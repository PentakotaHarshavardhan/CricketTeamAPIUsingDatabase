package com.example.player.service;

import java.util.*;

import com.example.player.model.Player;
import com.example.player.model.PlayerRowMapper;
import com.example.player.repository.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PlayerH2Service implements PlayerRepository {
    @Autowired
    private JdbcTemplate db;

    @Override
    public ArrayList<Player> getPlayers() {
        List<Player> list = db.query("select * from team", new PlayerRowMapper());
        ArrayList<Player> playerList = new ArrayList<>(list);
        return playerList;

    }

    @Override
    public Player getPlayerById(int id) {

        try {
            Player player = db.queryForObject("select * from team where playerid = ? ", new PlayerRowMapper(), id);
            return player;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @Override

    public Player addPlayer(Player player) {
        db.update("insert into team (playername,jerseynumber,role) values(?,?,?)", player.getPlayerName(),
                player.getJerseyName(), player.getRole());
        return db.queryForObject("select * from team where playername=? and jerseynumber=? and role=?",
                new PlayerRowMapper(), player.getPlayerName(), player.getJerseyName(), player.getRole());
    }

    @Override
    public Player updatePlayerById(Player player, int id) {
        if (player.getPlayerName() != null) {
            db.update("update team SET playername=? WHERE playerid=?", player.getPlayerName(), id);
        }
        if (player.getJerseyName() != null) {
            db.update("update team SET jerseynumber=? WHERE playerid=?", player.getJerseyName(), id);
        }
        if (player.getRole() != null) {
            db.update("update team SET role=? WHERE playerid=?", player.getRole(), id);
        }
        return db.queryForObject("select * from team where playername=? and jerseynumber=? and role=?",
                new PlayerRowMapper(), player.getPlayerName(), player.getJerseyName(), player.getRole());

    }

    @Override
    public void deletePlayerById(int id) {
        db.update("delete from team where playerid = ?", id);
    }

}
