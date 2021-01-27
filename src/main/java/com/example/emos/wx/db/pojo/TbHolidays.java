package com.example.emos.wx.db.pojo;

import java.time.LocalDate;
import lombok.Data;

/**
    * 节假日表
    */
@Data
public class TbHolidays {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 日期
    */
    private LocalDate date;
}