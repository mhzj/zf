package com.common;

/**
 * Created by huang
 */
public class Const {
    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role{
        int ROLE_CUSTOMER=0;//项目责任单位
        int ROLE_ADMIN=1;//系统管理员
        int ROLE_XIAN=2;//县发改部门
        int ROLE_CITY=3;//市发改部门
    }
}
