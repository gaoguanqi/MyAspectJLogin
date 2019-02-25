package com.ghp.demo.myaspectjlogin.app.aop;

/**
 * author: gaogq
 * time: 2019/2/25 13:59
 * description:
 */
public class UserCache {
    private boolean isLogin;

    private UserCache(){

    }

    private static class UserCacheHolder{
        private static final UserCache M_INSTANCE = new UserCache();
    }

    public static UserCache getInstance(){
        return UserCacheHolder.M_INSTANCE;
    }

    public void setLogin(boolean login){
        this.isLogin = login;
    }

    public boolean isLogin(){
        return isLogin;
    }
}
