package com.example.joker.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


//TODO 11 implement ClickListner interface and override the methods and show toast of hero name clicked in it.
public class MainActivity extends AppCompatActivity implements ClickListner {

    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private List<Movie> movieArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 2: Create class Hero having a constructor with fields as id,name and detail and create setters and getters respectively.


        //TODO 3: Get reference to recyclerVeiw and set its layout manager to Linear.
        movieAdapter = new MovieAdapter(this,(ArrayList<Movie>)movieArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(movieAdapter);

        prepareMovieData();


        }

        public void prepareMovieData(){
        Movie movie = new Movie("batman","action & adventure");
        movieArrayList.add(movie);


        movie = new Movie("deadpool", "Animation, Kids & Family");
        movieArrayList.add(movie);

        movie = new Movie("Doctor Strange", "Animation, Kids & Family");
        movieArrayList.add(movie);

        movie = new Movie("Iron Man", "Animation");
        movieArrayList.add(movie);

        movie = new Movie("spiderman", "Animation");
        movieArrayList.add(movie);



        }

    @Override
    public void onClick(int position) {
        Toast.makeText(MainActivity.this,"item is clicked",Toast.LENGTH_SHORT).show();
    }


    //TODO 12 Using shared preference find if user is new user or not. and show toast Welcome or Welcome again accordingly.


}
