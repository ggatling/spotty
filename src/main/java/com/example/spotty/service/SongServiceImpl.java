package com.example.spotty.service;

import com.example.spotty.model.Song;
import com.example.spotty.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    @Autowired
    SongRepository songRepository;

    @Override
    public Song saveSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }
}
