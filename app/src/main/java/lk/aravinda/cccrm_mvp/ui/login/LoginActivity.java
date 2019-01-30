package lk.aravinda.cccrm_mvp.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import lk.aravinda.cccrm_mvp.R;
import lk.aravinda.cccrm_mvp.model.CCCRMBean;
import lk.aravinda.cccrm_mvp.ui.base.BaseActivity;
import lk.aravinda.cccrm_mvp.ui.select.SelectActivity;

public class LoginActivity extends BaseActivity implements LoginView {

    @Inject
    LoginActivityPresenter presenter;
    @BindView(R.id.usernameEdit) EditText edtUsername;
    @BindView(R.id.passwordEdit) EditText edtPassword;
    @BindView(R.id.loginBtn) Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        activityComponent().inject(this);
        presenter.attachView(this);
    }

    @Override
    public void signInSuccessfull(CCCRMBean cccrmBean) {
        System.out.print(cccrmBean);
        startActivity(new Intent(LoginActivity.this, SelectActivity.class));
    }

    @Override
    public void showErrorMessage(String msg) {
        super.showErrorMessage(msg);

    }

    @Override
    public void showToast(String msg) {
        super.showToast(msg);

    }

    @Override
    public void showProgressDialog() {
        super.showProgressDialog();

    }

    @Override
    public void hideProgressDialog() {
        super.hideProgressDialog();

    }

    @OnClick(R.id.loginBtn)
    void OnClickLogIn(){
        presenter.signIn(edtUsername.getText().toString(), edtPassword.getText().toString());
    }
}
