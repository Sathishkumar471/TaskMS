package com.example.taskms.module.view;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskms.MainActivity;
import com.example.taskms.R;

import com.example.taskms.module.ListAdapter;
import com.example.taskms.module.IRecyclerViewItemClick;
import com.example.taskms.module.model.ListModel;
import com.example.taskms.module.presenter.RepoListPresenter;


import java.util.ArrayList;

public class ListFragment extends Fragment implements IListView, IRecyclerViewItemClick {


    private RepoListPresenter iRepoPresenter;
    private int pageCount = 1;
    private int recordCount = 30;
    private int totalCount = 0;
    private boolean isLoading;
    private ListAdapter adapter;
    private ArrayList<ListModel> resultsArrayList = new ArrayList<>();



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            iRepoPresenter = new RepoListPresenter(this);
            callApi();
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.list);

        adapter = new ListAdapter(resultsArrayList, getActivity(), this);
        final LinearLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int visibleCount = gridLayoutManager.getChildCount();
                int position = gridLayoutManager.findFirstVisibleItemPosition();

                if ((visibleCount + position) >= totalCount && totalCount >= recordCount && !isLoading) {
                    callApi();
                }
            }
        });


        return view;
    }

    private void callApi() {

        iRepoPresenter.getList(pageCount);
        isLoading = true;
    }

    @Override
    public void click(int position) {

        ((MainActivity) getActivity()).ListModel = resultsArrayList.get(position);
        ((MainActivity) getActivity()).commentFragment();
        ((MainActivity) getActivity()).view.getMenu().getItem(1).setChecked(true);
    }

    @Override
    public void noRecord() {
        if (resultsArrayList.size() == 0) {
        }
    }

    @Override
    public void listResponse(ArrayList<ListModel> list) {
        Log.d("listResponse","listResponse");
        resultsArrayList.addAll(list);
        totalCount += recordCount;
        pageCount++;
        isLoading = false;
        adapter.notifyChange(resultsArrayList);
    }


}
