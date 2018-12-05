package com.framgia.demo.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import com.framgia.demo.BR;
import com.framgia.demo.model.User;

public class LoginViewModel extends BaseObservable {
    @Bindable
    public String mToastMessage;
    private User mUser;

    public LoginViewModel(User user) {
        mUser = user;
    }

    public String getToastMessage() {
        return mToastMessage;
    }

    public void setToastMessage(String toastMessage) {
        mToastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public void afterUserNameTextChanged(CharSequence s) {
        mUser.setUserName(s.toString());
    }

    public void afterPasswordTextChanged(CharSequence s) {
        mUser.setPassword(s.toString());
    }

    public void onLoginClicked() {
        Log.d("TAG1","Onclick");
    }
}
