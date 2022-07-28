package com.ranzes.musicbackendapi.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="titulo")
    private String title;
    private Date lanzado;
    private Double precio;
    private String genero;
}
