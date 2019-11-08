package com.example.demo.Services;

import com.example.demo.Models.Songs;

public interface SongService {

    // create a new song
    public Songs addSong(Songs song);

    // list songs by art id
    public Iterable<Songs> listSongsByArtId(Long artId);
}
