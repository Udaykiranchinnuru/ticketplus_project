package com.jspiders.dto;

import com.jspiders.enums.ShowStatus;

import java.time.LocalDate;

public class ShowDto
{

    private LocalDate showTime;

    private LocalDate endTime;

    private ShowStatus status;

    public LocalDate getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalDate showTime) {
        this.showTime = showTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public ShowStatus getStatus() {
        return status;
    }

    public void setStatus(ShowStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ShowDto{" +
                "showTime=" + showTime +
                ", endTime=" + endTime +
                ", status=" + status +
                '}';
    }
}
