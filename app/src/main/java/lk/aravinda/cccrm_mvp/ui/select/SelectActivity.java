package lk.aravinda.cccrm_mvp.ui.select;

import android.os.Bundle;

import javax.inject.Inject;

import lk.aravinda.cccrm_mvp.R;
import lk.aravinda.cccrm_mvp.ui.base.BaseActivity;

public class SelectActivity extends BaseActivity implements SelectView {

    @Inject
    SelectActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        activityComponent().inject(this);
        presenter.attachView(this);
    }
}
