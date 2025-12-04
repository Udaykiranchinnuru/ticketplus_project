package com.jspiders.dao;

import com.jspiders.config.DBConfig;
import com.jspiders.entity.AuditoriumEntity;
import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.MovieStatus;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class MovieDaoImpl implements MovieDao {
    @Override
    public void addMovie(MovieEntity movieEntity)//create
    {
        System.out.println("Adding Movie");

        Session session = DBConfig.getSession();

        Transaction transaction = session.beginTransaction();

        session.persist(movieEntity);

        transaction.commit();

        session.close();
    }

    @Override
    public MovieEntity getmovie(Long movieid) {
        Session session=DBConfig.getSession();
        Transaction transaction=session.beginTransaction();
        MovieEntity movieEntity=session.find(MovieEntity.class,movieid);

        return movieEntity;
    }

    @Override
    public List<MovieEntity> getMovieByStatus(MovieStatus status)
    {
       Session session=DBConfig.getSession();
        String movieGetSatus = "FROM MovieEntity me WHERE me.status=:status";
        Query<MovieEntity> query = session.createQuery(movieGetSatus,MovieEntity.class);

        query.setParameter("status",status);
        List<MovieEntity> resultList=query.getResultList();
        for(MovieEntity movie:resultList)
        {
            System.out.println(movie);
        }


        return resultList;

    }

    @Override
    public MovieEntity getMovieByTitle(String title)
    {
        Session session = DBConfig.getSession();

        String selectMovieByTitleHql = "FROM MovieEntity mov WHERE mov.title = :title";

        Query<MovieEntity> query = session.createQuery(selectMovieByTitleHql, MovieEntity.class);

        query.setParameter("title",title);

        Transaction transaction = session.beginTransaction();

        MovieEntity movieEntity = query.uniqueResult();

        transaction.commit();

        session.close();

        return movieEntity;
    }


}