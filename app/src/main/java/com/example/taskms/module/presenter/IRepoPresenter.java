package com.example.taskms.module.presenter;


import com.example.taskms.module.model.ListModel;

import java.util.ArrayList;

public interface IRepoPresenter {

        void getRepoList(int itemPosition, OnCompletedListener listener);

        interface OnCompletedListener {
            void onCompleted(ArrayList<ListModel> list);

            void onFailure(Throwable t);
        }


}
