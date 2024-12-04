package ict.thei.mobileappfinalproject;
import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class SettingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        Button DontSaveBtn = findViewById(R.id.ExitNoSaveBtn);
        Button SaveBtn = findViewById(R.id.SaveExitBtn);
        Button OpenTut = findViewById(R.id.Tutorial);
        ImageButton ChangeIcon = findViewById(R.id.ChangeUserIconBtn);
        SaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHomePage = new Intent(SettingPage.this, MainPage.class);
                startActivity(goHomePage);
            }
        });
        DontSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHomePage = new Intent(SettingPage.this,MainPage.class);
                startActivity(goHomePage);
            }
        });

    }
}
