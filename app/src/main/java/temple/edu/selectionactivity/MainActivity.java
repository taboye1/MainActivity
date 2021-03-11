package temple.edu.selectionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_IMAGE = "PICTURE";
    public static final String EXTRA_MESSAGE = "TEXT";

    //Spinner spinner;
    GridView gridView;
    ImageView imageView;
    int[]catImageArray;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spinner = findViewById(R.id.spinner);
        gridView = findViewById(R.id.gridview);
        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.text);
        ArrayList catArray = new ArrayList<String>();
        catArray.add("cat1");
        catArray.add("cat2");
        catArray.add("cat3");
        catArray.add("cat4");
        catArray.add("cat5");

        catImageArray = new int[]{R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5};

        ImageAdapter imageAdapter = new ImageAdapter(this, catArray, catImageArray);

        //spinner.setAdapter(imageAdapter);
        //spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                if (parent.getItemAtPosition(i).equals("cat1")){
                    Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                    intent.putExtra(EXTRA_MESSAGE, "cat1");
                    intent.putExtra(EXTRA_IMAGE, catImageArray[i]);
                    startActivity(intent);
                }else if (parent.getItemAtPosition(i).equals("cat2")){
                    Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                    intent.putExtra(EXTRA_MESSAGE, "cat2");
                    intent.putExtra(EXTRA_IMAGE, catImageArray[i]);
                    startActivity(intent);
                }else if (parent.getItemAtPosition(i).equals("cat3")){
                    Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                    intent.putExtra(EXTRA_MESSAGE, "cat2");
                    intent.putExtra(EXTRA_IMAGE, catImageArray[i]);
                    startActivity(intent);
                }else if (parent.getItemAtPosition(i).equals("cat4")){
                    Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                    intent.putExtra(EXTRA_MESSAGE, "cat4");
                    intent.putExtra(EXTRA_IMAGE, catImageArray[i]);
                    startActivity(intent);
                }else if (parent.getItemAtPosition(i).equals("cat5")) {
                    Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                    intent.putExtra(EXTRA_MESSAGE, "cat5");
                    intent.putExtra(EXTRA_IMAGE, catImageArray[i]);
                    startActivity(intent);
                }
            }


        });
    }
}