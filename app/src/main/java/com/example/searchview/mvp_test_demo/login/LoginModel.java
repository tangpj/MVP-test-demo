package com.example.searchview.mvp_test_demo.login;

import android.os.Handler;
import android.util.Log;

/**
 * Created by user on 16/9/22.
 */
public class LoginModel implements ILoginModel{

    private ILoginPresenter presenter;

    private Handler mHandler = new Handler();

    public LoginModel(ILoginPresenter presenter) {
        this.presenter = presenter;

    }

    @Override
    public void login(String name ,String password) {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("LoginModel", "run: ");
                presenter.loginSucceed();
            }
        },2000);
    }

}
