package com.example.demo.Services;

import com.example.demo.Models.Songs;
import com.example.demo.Repositories.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    SongsRepository songsRepository;

    @Override
    public Songs addSong(Songs song) {
        return songsRepository.save(song);
    }

    @Override
    public Iterable<Songs> listSongsByArtId(Long artId) {
        return songsRepository.listSongsByArtId(artId);
    }
}
