package com.jspiders.service;

import com.jspiders.dao.MovieDao;
import com.jspiders.dao.MovieDaoImpl;
import com.jspiders.dto.MovieDto;
import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.MovieStatus;

import java.util.List;

public class MovieServiceImpl implements  MovieService{
    MovieDaoImpl movieDao=new MovieDaoImpl();
    @Override
    public void addMovie(MovieDto movieDto)
    {

        MovieEntity movieEntity = new MovieEntity();

        movieEntity.setTitle(movieDto.getTitle());
        movieEntity.setCertification(movieDto.getCertification());
        movieEntity.setLanguage(movieDto.getLanguage());
        movieEntity.setDuration(movieDto.getDuration());
        movieEntity.setStatus(movieDto.getStatus());
  movieEntity.setCreatedBy(movieDto.getCreatedBy());
        movieDao.addMovie(movieEntity);

    }

    @Override
    public MovieEntity getMovie(Long movieId) {
        return null;
    }

    @Override
    public List<MovieEntity> getAllMovies() {
        return List.of();
    }
}
