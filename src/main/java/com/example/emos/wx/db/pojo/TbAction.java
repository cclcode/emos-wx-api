package com.example.emos.wx.db.pojo;

import lombok.Data;

/**
    * 行为表
    */
@Data
public class TbAction {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 行为编号
    */
    private String actionCode;

    /**
    * 行为名称
    */
    private String actionName;
}