package com.rozogar.englishsongs.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.rozogar.englishsongs.Adapter.MyAdapter;
import com.rozogar.englishsongs.Model.Music;
import com.rozogar.englishsongs.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    SwipeRefreshLayout refreshLayout;
    private ArrayList<Music> music;
    LinearLayoutManager verticalLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupView();
        addingMethod();
        addingPlay();


        MyAdapter adapter = new MyAdapter(music, this);
        recyclerView.setAdapter(adapter);
        verticalLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(verticalLayoutManager);


        refreshLayout.setOnRefreshListener(() -> refreshLayout.setRefreshing(false));


    }

    private void setupView() {
        recyclerView = findViewById(R.id.recyclerView);
        refreshLayout = findViewById(R.id.refresherLayout);
    }

    private void addingPlay() {
        music = new ArrayList<>();
        music.add(new Music(R.drawable.icon, getString(R.string.song_01), R.raw.farhad_1));
        music.add(new Music(R.drawable.icon, getString(R.string.song_02), R.raw.farhad_10));
    }


    private void addingMethod() {
        music = new ArrayList<>();
        music.add(new Music(R.drawable.icon, getString(R.string.song_01)));
        music.add(new Music(R.drawable.icon, getString(R.string.song_02)));


    }
}