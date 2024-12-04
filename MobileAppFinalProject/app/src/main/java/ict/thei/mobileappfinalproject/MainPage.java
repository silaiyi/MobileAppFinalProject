package ict.thei.mobileappfinalproject;
import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //FavoriteBtn  HomeBtn  CommunityBtn  HistoryBtn  MapBtn  PostBtn
        ImageButton FavoriteBtn = findViewById(R.id.FavoriteBtn);
        ImageButton HomeBtn = findViewById(R.id.HomeBtn);
        ImageButton CommunityBtn = findViewById(R.id.CommunityBtn);
        ImageButton HistoryBtn = findViewById(R.id.HistoryBtn);
        ImageButton MapBtn = findViewById(R.id.MapBtn);
        ImageButton PostBtn = findViewById(R.id.PostBtn);
        FavoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goFavPage = new Intent(MainPage.this, FavoritePage.class);
                startActivity(goFavPage);
            }
        });
        CommunityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goComPage = new Intent(MainPage.this,CommunityPage.class);
                startActivity(goComPage);
            }
        });
        HistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHistoryPage = new Intent(MainPage.this,HistoryPage.class);
                startActivity(goHistoryPage);
            }
        });
        MapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMapPage = new Intent(MainPage.this,MapPage.class);
                startActivity(goMapPage);
            }
        });
        PostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPostPage = new Intent(MainPage.this,PostPage.class);
                startActivity(goPostPage);
            }
        });

    }
}
