package com.example.taskms;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.taskms.module.model.ListModel;
import com.example.taskms.module.view.CommentFragment;
import com.example.taskms.module.view.DetailsFragment;
import com.example.taskms.module.view.ListFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    private FragmentManager fm;
    private FragmentTransaction ft;
    private String fName = "ListFragment";
    public com.example.taskms.module.model.ListModel ListModel;
    public BottomNavigationView view;
    private Context context;
    public EditText comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.nView);
        view.setOnNavigationItemSelectedListener(item -> {
            String title = item.getTitle().toString();
            if (title.equals(getString(R.string.home))) {
                listFragment();
            } else if (title.equals(getString(R.string.comment))) {
                commentFragment();
            }
            else if (title.equals(getString(R.string.details))) {
                detailFragment();
            }
            return true;
        });

        listFragment();
    }

    private void listFragment() {
        fName = "ListFragment";
        fragmentTransaction(new ListFragment());
    }

    public void commentFragment() {
        if (ListModel == null) {
            Toast.makeText(this,"Choose any",Toast.LENGTH_SHORT).show();
        } else {
            fName = "CommentFragment";
            fragmentTransaction(new CommentFragment());
        }
    }

    public void detailFragment() {
        if (ListModel == null) {
            Toast.makeText(this,"Choose any",Toast.LENGTH_SHORT).show();
        } else {
            fName = "DetailsFragment";
            fragmentTransaction(new DetailsFragment());
        }
    }

    private void fragmentTransaction(Fragment fragment) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        Fragment oldFragment = isPresent();
        if (oldFragment == null) {
            ft.replace(R.id.frame_layout, fragment, fName);
            ft.addToBackStack(fName);
        } else {
            ft.replace(R.id.frame_layout, oldFragment);
        }
        ft.commit();
    }

    private Fragment isPresent() {
        Fragment old;
        for (int i = 0; i < fm.getBackStackEntryCount(); i++) {
            if (fm.getBackStackEntryAt(i).getName().equals(fName)) {
                old = fm.findFragmentByTag(fName);
                return old;
            }
        }
        return null;
    }

    @Override
    public void onBackPressed() {
        if (fName.equals("CommentFragment") || fName.equals("DetailFragment")) {
            listFragment();
            view.getMenu().getItem(0).setChecked(true);
        } else {
            finish();
        }
    }
}