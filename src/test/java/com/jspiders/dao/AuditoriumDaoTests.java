package com.jspiders.dao;

import com.jspiders.entity.AuditoriumEntity;
import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.MovieStatus;

public class AuditoriumDaoTests
{
    public static void main(String[] args) {

        testAddMovie();
    }

    public static void testAddMovie()
    {
        System.out.println("Testing ADD Movie");
        try {
            AuditoriumDaoImpl auditoriumDao=new AuditoriumDaoImpl();
            AuditoriumEntity auditoriumEntity= new AuditoriumEntity();
            auditoriumEntity.setName("Audi-3");
            auditoriumEntity.setSeatColumns(20);
            auditoriumEntity.setSeatRows(40);


            auditoriumDao.addAuditorium(auditoriumEntity);

            System.out.println("✅ADD MOVIE Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADD MOVIE Test FAILED");
            ex.printStackTrace();
        }
    }
}
