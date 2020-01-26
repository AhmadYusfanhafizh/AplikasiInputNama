package id.ac.poliban.mi.yusfan.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = findViewById(R.id.etNama);
        Button btTampil = findViewById(R.id.btTampil);

        btTampil.setOnClickListener(v -> Toast.makeText(this, "Name: " + etNama.getText().toString(), Toast.LENGTH_SHORT).show());
    }
}
