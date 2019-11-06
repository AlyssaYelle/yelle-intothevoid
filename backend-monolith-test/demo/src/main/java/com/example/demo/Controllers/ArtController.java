package com.example.demo.Controllers;

import com.example.demo.Models.Art;
import com.example.demo.Services.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class ArtController {
    @Autowired
    ArtService artService;

    @PostMapping("/art/add")
    public Art addArt(@RequestBody Art art) {
        return artService.addArt(art);
    }

    @GetMapping("/art/list")
    public Iterable<Art> listAllArt(){
        return artService.listAllArt();
    }

    /**
    * TODO
     * add functionality to delete art
     * also will need to add security but that can wait
     *
    * */
}
