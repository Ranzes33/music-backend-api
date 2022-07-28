package com.ranzes.musicbackendapi.controller;

import com.ranzes.musicbackendapi.entity.Album;
import com.ranzes.musicbackendapi.service.IAlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class AlbumsController {

    @Autowired
    private IAlbumsService serviceAlbums;

    @GetMapping("/all")
    public List<Album> buscarTodos(){
        return serviceAlbums.buscarTodos();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Album> buscarPorId(@PathVariable("id") int idAlbum){
        Album album = serviceAlbums.buscarPorId(idAlbum);
        if(album == null) {
            return new ResponseEntity<Album>(album, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Album>(album, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Album> guardar(@RequestBody  Album album){
        serviceAlbums.guardar(album);
        return new ResponseEntity<Album>(album, HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<Album> modificar(@RequestBody Album album){
        serviceAlbums.guardar(album);
        return new ResponseEntity<Album>(album, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Album> eliminar(@PathVariable("id") int idAlbum){
        Album album = serviceAlbums.buscarPorId(idAlbum);
        if(album == null) {
            return new ResponseEntity<Album>(album, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        serviceAlbums.eliminar(idAlbum);
        return new ResponseEntity<Album>(album, HttpStatus.OK);
    }
}
