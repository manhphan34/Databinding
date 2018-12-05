package com.framgia.demo.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;

public class User {
    @NonNull
    private String mUserName;
    @NonNull
    private String mPassword;

    public User(String userName, String password) {
        mUserName = userName;
        mPassword = password;
    }

    @NonNull
    public String getUserName() {
        return mUserName;
    }

    public void setUserName(@NonNull String userName) {
        mUserName = userName;
    }

    @NonNull
    public String getPassword() {
        return mPassword;
    }

    public void setPassword(@NonNull String password) {
        mPassword = password;
    }

    public boolean isValidateData() {
        return !TextUtils.isEmpty(getUserName())
                && Patterns.EMAIL_ADDRESS.matcher(getUserName()).matches()
                && getPassword().length() > 5;
    }
}
