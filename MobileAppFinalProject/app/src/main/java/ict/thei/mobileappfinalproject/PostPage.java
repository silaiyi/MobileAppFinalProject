package ict.thei.mobileappfinalproject;
import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PostPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post);
        ImageButton FavoriteBtn = findViewById(R.id.FavoriteBtn);
        ImageButton HomeBtn = findViewById(R.id.HomeBtn);
        ImageButton CommunityBtn = findViewById(R.id.CommunityBtn);
        ImageButton HistoryBtn = findViewById(R.id.HistoryBtn);
        ImageButton MapBtn = findViewById(R.id.MapBtn);
        ImageButton PostBtn = findViewById(R.id.PostBtn);
        CommunityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goComPage = new Intent(PostPage.this, CommunityPage.class);
                startActivity(goComPage);
            }
        });
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHomePage = new Intent(PostPage.this,MainPage.class);
                startActivity(goHomePage);
            }
        });
        HistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHistoryPage = new Intent(PostPage.this,HistoryPage.class);
                startActivity(goHistoryPage);
            }
        });
        FavoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goFavPage = new Intent(PostPage.this,FavoritePage.class);
                startActivity(goFavPage);
            }
        });
        MapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMapPage = new Intent(PostPage.this,MapPage.class);
                startActivity(goMapPage);
            }
        });
    }
}
