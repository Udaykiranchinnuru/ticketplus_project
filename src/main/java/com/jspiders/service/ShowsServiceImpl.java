package com.jspiders.service;

import com.jspiders.dao.AuditoriumDaoImpl;
import com.jspiders.dao.MovieDaoImpl;
import com.jspiders.dao.ShowDaoImpl;
import com.jspiders.dto.ShowDto;
import com.jspiders.entity.AuditoriumEntity;
import com.jspiders.entity.MovieEntity;
import com.jspiders.entity.ShowEntity;
import com.jspiders.enums.ShowStatus;

import java.time.LocalDate;

public class ShowsServiceImpl implements ShowsService{
    @Override
    public void addShow(Long audiId, Long movieId, ShowDto showDto)
    {
        ShowDaoImpl showDaoImpl = new ShowDaoImpl();
        AuditoriumDaoImpl auditoriumDao = new AuditoriumDaoImpl();
        MovieDaoImpl movieDao = new MovieDaoImpl();

        //MAPPING DTO to ENTITY
        ShowEntity showEntity = new ShowEntity();
        showEntity.setShowTime(LocalDate.now());
        showEntity.setEndTime(LocalDate.now());
        showEntity.setStatus(ShowStatus.OPEN);

        AuditoriumEntity auditoriumEntity = auditoriumDao.getAuditorium(1l);
        showEntity.setAuditorium(auditoriumEntity);//link audi to show

//        MovieEntity movieEntity = movieDao.getMovie(4l);
//        showEntity.setMovie(movieEntity);//link movie to show

        showDaoImpl.addShow(showEntity);//add show to table

    }
}
