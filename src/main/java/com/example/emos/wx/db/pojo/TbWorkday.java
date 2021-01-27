package com.example.emos.wx.db.pojo;

import java.time.LocalDate;
import lombok.Data;

@Data
public class TbWorkday {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 日期
    */
    private LocalDate date;
}