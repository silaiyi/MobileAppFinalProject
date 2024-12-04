package ict.thei.mobileappfinalproject;
import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CommunityPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community);
        ImageButton FavoriteBtn = findViewById(R.id.FavoriteBtn);
        ImageButton HomeBtn = findViewById(R.id.HomeBtn);
        ImageButton CommunityBtn = findViewById(R.id.CommunityBtn);
        ImageButton HistoryBtn = findViewById(R.id.HistoryBtn);
        ImageButton MapBtn = findViewById(R.id.MapBtn);
        ImageButton PostBtn = findViewById(R.id.PostBtn);
        FavoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goFavPage = new Intent(CommunityPage.this, FavoritePage.class);
                startActivity(goFavPage);
            }
        });
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHomePage = new Intent(CommunityPage.this,MainPage.class);
                startActivity(goHomePage);
            }
        });
        HistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHistoryPage = new Intent(CommunityPage.this,HistoryPage.class);
                startActivity(goHistoryPage);
            }
        });
        MapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMapPage = new Intent(CommunityPage.this,MapPage.class);
                startActivity(goMapPage);
            }
        });
        PostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPostPage = new Intent(CommunityPage.this,PostPage.class);
                startActivity(goPostPage);
            }
        });
    }
}
