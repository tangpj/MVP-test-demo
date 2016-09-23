package com.example.searchview.mvp_test_demo.login;

/**
 * Created by user on 16/9/22.
 */
public interface ILoginPresenter {

    void loginToServer(String userName,String password);

    void loginSucceed();
}
