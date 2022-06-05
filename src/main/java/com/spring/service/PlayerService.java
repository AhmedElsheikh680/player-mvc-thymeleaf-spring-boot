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
}