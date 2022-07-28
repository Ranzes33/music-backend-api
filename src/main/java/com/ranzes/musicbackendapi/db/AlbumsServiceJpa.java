package com.ranzes.musicbackendapi.db;

import com.ranzes.musicbackendapi.entity.Album;
import com.ranzes.musicbackendapi.repository.AlbumsRepository;
import com.ranzes.musicbackendapi.service.IAlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumsServiceJpa implements IAlbumsService {

    //se va a inyectar en esta variable, una estancia de nuestro repo
    @Autowired
    private AlbumsRepository repoAlbums;

    @Override
    public List<Album> buscarTodos() {
        return repoAlbums.findAll();
    }

    @Override
    public void guardar(Album album) {
        repoAlbums.save(album);
    }

    @Override
    public void eliminar(int idAlbum) {
        repoAlbums.deleteById(idAlbum);
    }

    @Override
    public Album buscarPorId(int idAlbum) {
        Optional<Album> optional = repoAlbums.findById(idAlbum);
        return optional.orElse(null);
    }
}
