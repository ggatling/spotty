package com.example.spotty.controller;

import com.example.spotty.model.Song;
import com.example.spotty.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("songslist")
    public List<Song> listCourses(){
        return songService.listSongs();
    }

    @PostMapping("/savesong")
    public Song saveSong(@RequestBody Song song){
        return songService.saveSong(song);
    }
}
