package com.example.emos.wx.db.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
    * 用户表
    */
@Data
public class TbUser {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 长期授权字符串
    */
    private String openId;

    /**
    * 昵称
    */
    private String nickname;

    /**
    * 头像网址
    */
    private String photo;

    /**
    * 姓名
    */
    private String name;

    /**
    * 性别
    */
    private Object sex;

    /**
    * 手机号码
    */
    private String tel;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 入职日期
    */
    private LocalDate hiredate;

    /**
    * 角色
    */
    private String role;

    /**
    * 是否是超级管理员
    */
    private Boolean root;

    /**
    * 部门编号
    */
    private Integer deptId;

    /**
    * 状态
    */
    private Integer status;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;
}