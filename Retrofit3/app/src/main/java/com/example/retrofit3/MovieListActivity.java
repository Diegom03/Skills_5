package com.example.retrofit3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.retrofit3.viewmodels.MovieListViewModel;

public class MovieListActivity extends AppCompatActivity implements OnMovieListener{

    // RecyclerView
    private RecyclerView recyclerView;
    private MovieRecyclerView movieRecyclerAdapter;

    // ViewModel
    private MovieListViewModel movieListViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);
        recyclerView = findViewById(R.id.recyclerView);

        movieListViewModel = new ViewModelProvider(this).get(MovieListViewModel.class);

        ObserveAnyChane();

        private void searchMovieApi(String query, int pagenUmber) {
            movieListViewModel.searchoMovieApi(query, pagenUmber);
        }

        private void ConfigureRecyclerview(){
            movieRecyclerAdapter = new MovieRecyclerView(movieListViewModel.getMovies(). this);
        }
    }
}