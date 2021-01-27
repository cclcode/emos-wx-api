package com.example.emos.wx.db.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Data;

/**
    * 会议表
    */
@Data
public class TbMeeting {
    /**
    * 主键
    */
    private Long id;

    /**
    * UUID
    */
    private String uuid;

    /**
    * 会议题目
    */
    private String title;

    /**
    * 创建人ID
    */
    private Long creatorId;

    /**
    * 日期
    */
    private LocalDate date;

    /**
    * 开会地点
    */
    private String place;

    /**
    * 开始时间
    */
    private LocalTime start;

    /**
    * 结束时间
    */
    private LocalTime end;

    /**
    * 会议类型（1在线会议，2线下会议）
    */
    private Integer type;

    /**
    * 参与者
    */
    private String members;

    /**
    * 会议内容
    */
    private String desc;

    /**
    * 工作流实例ID
    */
    private String instanceId;

    /**
    * 状态（1未开始，2进行中，3已结束）
    */
    private Integer status;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;
}