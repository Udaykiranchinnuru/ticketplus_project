package com.jspiders.dao;

import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.MovieStatus;
import com.jspiders.service.MovieServiceImpl;

public class MovieDaoTests {

    public static void main(String[] args) {
      //  testAddMovie();
        //testMovieGetStatus();
        testGetMovieByTitle();
    }

    public static void testAddMovie()
    {
        System.out.println("Testing ADD Movie  to database");
        try {
            MovieDaoImpl movieDao = new MovieDaoImpl();

            MovieEntity movieEntity = new MovieEntity();
            movieEntity.setTitle("Movie-1");
            movieEntity.setCertification("U");
            movieEntity.setLanguage("ENG");
            movieEntity.setDuration(120);
            movieEntity.setStatus(MovieStatus.AVAILABLE);

            movieDao.addMovie(movieEntity);

            System.out.println("✅ADD MOVIE Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADD MOVIE Test FAILED");
            ex.printStackTrace();
        }
    }
    public static void testMovieGetStatus()
    {
        MovieDaoImpl movieDao=new MovieDaoImpl();
        movieDao.getMovieByStatus(MovieStatus.AVAILABLE);
    }

    public static void testGetMovieByTitle()
    {
        System.out.println("Testing Get Movie By Title");
        try {

            MovieDaoImpl movieDao = new MovieDaoImpl();
            MovieEntity movieEntity = movieDao.getMovieByTitle("aaa");
            System.out.println(movieEntity);

            System.out.println("✅Get Get Movie By Title Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌Get Get Movie By Title Test FAILED");
            ex.printStackTrace();
        }
    }
}