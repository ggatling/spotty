package com.example.spotty.service;

import com.example.spotty.model.Song;

import java.util.List;

public interface SongService {
    public Song saveSong(Song song);

    public List<Song> listSongs();
}
