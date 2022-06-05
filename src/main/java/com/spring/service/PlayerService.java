package com.spring.service;

import com.spring.dao.PlayerDao;
import com.spring.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;

    public List<Player> players() {
        return playerDao.findAll();
    }

    public Player addPlayer(Player player) {
        return playerDao.save(player);
    }

    public Player getPlayer(int id) {
        return playerDao.findById(id).get();
    }

    public void deletePlayer(int id) {
        playerDao.deleteById(id);
    }
}
