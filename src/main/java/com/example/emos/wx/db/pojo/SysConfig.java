package com.example.emos.wx.db.pojo;

import lombok.Data;

@Data
public class SysConfig {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 参数名
    */
    private String paramKey;

    /**
    * 参数值
    */
    private String paramValue;

    /**
    * 状态
    */
    private Boolean status;

    /**
    * 备注
    */
    private String remark;
}