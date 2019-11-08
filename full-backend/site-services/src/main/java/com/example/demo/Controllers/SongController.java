package com.example.demo.Controllers;

import com.example.demo.Models.Songs;
import com.example.demo.Repositories.SongsRepository;
import com.example.demo.Services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class SongController {

    @Autowired
    SongService songService;

    @Autowired
    SongsRepository songsRepository;

    @PostMapping("/song/add")
    public Songs addSong(@RequestBody Songs song) {
        return songService.addSong(song);
    }

    @GetMapping("/song/{artId}")
    public Iterable<Songs> listSongsByArtId(@PathVariable Long artId) {
        return songService.listSongsByArtId(artId);
    }
}
