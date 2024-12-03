package ict.thei.mobileappfinalproject;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.os.Bundle;
public class SignUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        Spinner spinner = findViewById(R.id.UserMenu);
        String[] UserMenu = new String[]{"Wheel Chair user","Walking assist user","Normal user"};

    }
}
