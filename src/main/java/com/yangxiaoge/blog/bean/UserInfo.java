package com.yangxiaoge.blog.bean;

public class UserInfo {
    private String mUserId;
    private String mUserName;

    public String getmUserId() {
        return mUserId;
    }

    public void setmUserId(String mUserId) {
        this.mUserId = mUserId;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "mUserId='" + mUserId + '\'' +
                ", mUserName='" + mUserName + '\'' +
                '}';
    }
}
