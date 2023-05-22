package sg.edu.rp.c346.id22035660.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvModCred;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvModCred = findViewById(R.id.textViewCreds);
        tvVenue = findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("Module Code");
        String moduleName = intentReceived.getStringExtra("Module Name");
        int academicYear = intentReceived.getIntExtra("Academic Year",2020);
        int semester = intentReceived.getIntExtra("Semester", 1);
        int moduleCredit = intentReceived.getIntExtra("Module Credit", 4);
        String venue = intentReceived.getStringExtra("Venue");

        tvCode.setText("Module Code: " + moduleCode);
        tvName.setText("Module Name: " + moduleName);
        tvYear.setText("Academic Year: " + academicYear);
        tvSem.setText("Semester: " + semester);
        tvModCred.setText("Module Credit: " + moduleCredit);
        tvVenue.setText("Venue: " + venue);
    }
}




