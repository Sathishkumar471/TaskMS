package com.example.taskms.module.view;




import com.example.taskms.module.model.ListModel;

import java.util.ArrayList;

public interface IListView {
    void listResponse(ArrayList<ListModel> list);

    void noRecord();
}
