package com.ranzes.musicbackendapi.service;

import com.ranzes.musicbackendapi.entity.Album;

import java.util.List;

public interface IAlbumsService {
    List<Album> buscarTodos();
    void guardar(Album album);
    void eliminar(int idAlbum);
    Album buscarPorId(int idAlbum);
}
