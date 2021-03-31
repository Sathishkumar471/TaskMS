package com.example.taskms.module.view;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.taskms.MainActivity;
import com.example.taskms.R;
import com.example.taskms.module.model.ListModel;


public class CommentFragment extends Fragment {

private EditText comment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_comment, container, false);

        TextView name = view.findViewById(R.id.name);
        comment = view.findViewById(R.id.comment);

         view.findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(comment.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getActivity(),"Add Comment",Toast.LENGTH_SHORT).show();
                }else{
                    ((MainActivity) getActivity()).ListModel.setComment(comment.getText().toString());
                    Toast.makeText(getActivity(),"Added Successfully",Toast.LENGTH_SHORT).show();
                }

            }
        });

        ImageView image = view.findViewById(R.id.image);

        name.setText(((MainActivity) getActivity()).ListModel.getName());


        if (((MainActivity) getActivity()).ListModel.getOwner() != null) {
            Glide.with(getActivity()).setDefaultRequestOptions(new RequestOptions().error(R.drawable.ic_no_image)).load(((MainActivity) getActivity()).ListModel.getOwner().getAvatar_url()).into(image);
        } else {
            Glide.with(getActivity()).load(R.drawable.ic_no_image).into(image);
        }

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if(((MainActivity) getActivity()).ListModel.getComment() == null ||
                ((MainActivity) getActivity()).ListModel.getComment().isEmpty()){
            comment.setText("");
        }else{
            comment.setText(((MainActivity) getActivity()).ListModel.getComment());
        }
    }
}
