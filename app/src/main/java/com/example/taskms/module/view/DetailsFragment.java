package com.example.taskms.module.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.taskms.MainActivity;
import com.example.taskms.R;
import com.example.taskms.module.model.ListModel;

public class DetailsFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView name = view.findViewById(R.id.detail);
        TextView comment = view.findViewById(R.id.comment);

        comment.setText(""+((MainActivity) getActivity()).ListModel.getComment());
        name.setText(""+((MainActivity) getActivity()).ListModel.getDescription());


        return view;
    }
}
