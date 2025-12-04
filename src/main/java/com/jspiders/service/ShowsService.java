package com.jspiders.service;

import com.jspiders.dto.ShowDto;

public interface ShowsService
{
    void addShow(Long audiId, Long movieId, ShowDto showDto);
}
