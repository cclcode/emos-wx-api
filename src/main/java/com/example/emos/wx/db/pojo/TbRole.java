package com.example.emos.wx.db.pojo;

import lombok.Data;

/**
    * 角色表
    */
@Data
public class TbRole {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 角色名称
    */
    private String roleName;

    /**
    * 权限集合
    */
    private String permissions;
}