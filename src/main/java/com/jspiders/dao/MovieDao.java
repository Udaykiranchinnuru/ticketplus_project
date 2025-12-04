package com.jspiders.dao;

import com.jspiders.config.DBConfig;
import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.MovieStatus;
import org.hibernate.Session;

import java.util.List;

public interface MovieDao
{
    void  addMovie(MovieEntity movieEntity);


    MovieEntity getmovie(Long movieid);

    List<MovieEntity> getMovieByStatus(MovieStatus status);
    MovieEntity getMovieByTitle(String title);
}
