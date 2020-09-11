package com.jesper.seckill.bean;

/**
 * 登录接口返回
 * @author wujia215
 * @date 2020/9/115:02
 */

public class UserVo {
    Long userId;
    String username;
    String accessToken;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
