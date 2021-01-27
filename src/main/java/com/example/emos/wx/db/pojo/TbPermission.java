package com.example.emos.wx.db.pojo;

import lombok.Data;

@Data
public class TbPermission {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 权限
    */
    private String permissionName;

    /**
    * 模块ID
    */
    private Integer moduleId;

    /**
    * 行为ID
    */
    private Integer actionId;
}