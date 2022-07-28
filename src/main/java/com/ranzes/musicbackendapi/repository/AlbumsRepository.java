package com.ranzes.musicbackendapi.repository;

import com.ranzes.musicbackendapi.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {
}
