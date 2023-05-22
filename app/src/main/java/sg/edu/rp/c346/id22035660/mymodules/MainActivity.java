package sg.edu.rp.c346.id22035660.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346;
    TextView tvC110;
    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvG953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textView1);
        tvC110= findViewById(R.id.textView2);
        tvC203= findViewById(R.id.textView3);
        tvC206= findViewById(R.id.textView4);
        tvC218= findViewById(R.id.textView5);
        tvG953= findViewById(R.id.textView6);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Android Programming");
                intent.putExtra("Academic Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "E63A");
                startActivity(intent);
            }
        });

        tvC110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C110");
                intent.putExtra("Module Name", "Programming Fundamentals I");
                intent.putExtra("Academic Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "E65P");
                startActivity(intent);
            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C203");
                intent.putExtra("Module Name", "Web AppIn Development in php");
                intent.putExtra("Academic Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C206");
                intent.putExtra("Module Name", "Software Development Process");
                intent.putExtra("Academic Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C218");
                intent.putExtra("Module Name", "UI/UX Design for Apps");
                intent.putExtra("Academic Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "G953");
                intent.putExtra("Module Name", "Life Skills III");
                intent.putExtra("Academic Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "1");
                intent.putExtra("Venue", "E-learning");
                startActivity(intent);
            }
        });
    }
}