package com.example.taskms.module.presenter;





import android.util.Log;

import com.example.taskms.module.model.ListRepoModel;
import com.example.taskms.module.model.ListModel;
import com.example.taskms.module.view.IListView;

import java.util.ArrayList;

public class RepoListPresenter implements IPresenter, IRepoPresenter.OnCompletedListener {

    private IListView iListView;
    private IRepoPresenter model;

    public RepoListPresenter(IListView view) {
        this.iListView = view;
        model = new ListRepoModel();
    }

    @Override
    public void getList(int page) {

        model.getRepoList(page, this);
    }

    @Override
    public void onCompleted(ArrayList<ListModel> response) {

        Log.d("onCompleted","onCompleted");

        if (response != null && response.size() > 0) {
            iListView.listResponse(response);
        } else {
            iListView.noRecord();
        }
    }



    @Override
    public void onFailure(Throwable t) {
        iListView.noRecord();

    }

}
