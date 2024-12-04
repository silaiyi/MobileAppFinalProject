package ict.thei.mobileappfinalproject;
import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FaciitiesPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faciities);
        ImageButton FavoriteBtn = findViewById(R.id.FavoriteBtn);
        ImageButton HomeBtn = findViewById(R.id.HomeBtn);
        ImageButton CommunityBtn = findViewById(R.id.CommunityBtn);
        ImageButton HistoryBtn = findViewById(R.id.HistoryBtn);
        ImageButton MapBtn = findViewById(R.id.MapBtn);
        ImageButton PostBtn = findViewById(R.id.PostBtn);
        CommunityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goComPage = new Intent(FaciitiesPage.this, CommunityPage.class);
                startActivity(goComPage);
            }
        });
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHomePage = new Intent(FaciitiesPage.this,MainPage.class);
                startActivity(goHomePage);
            }
        });
        HistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHistoryPage = new Intent(FaciitiesPage.this,HistoryPage.class);
                startActivity(goHistoryPage);
            }
        });
        FavoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goFavPage = new Intent(FaciitiesPage.this,FavoritePage.class);
                startActivity(goFavPage);
            }
        });
        PostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPostPage = new Intent(FaciitiesPage.this,PostPage.class);
                startActivity(goPostPage);
            }
        });
        MapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPostPage = new Intent(FaciitiesPage.this,MapPage.class);
                startActivity(goPostPage);
            }
        });
    }
}