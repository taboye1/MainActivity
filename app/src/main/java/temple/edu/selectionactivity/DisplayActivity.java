package temple.edu.selectionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        int image = intent.getIntExtra(MainActivity.EXTRA_IMAGE, 0);

        //ImageView imageView = findViewById(R.id.imageView);
        GridView imageView = findViewById(R.id.gridview);
        TextView textView = findViewById(R.id.text);

        imageView.setImageResource(image);
        textView.setText(message);

        getSupportActionBar().setTitle("Display");
    }
}