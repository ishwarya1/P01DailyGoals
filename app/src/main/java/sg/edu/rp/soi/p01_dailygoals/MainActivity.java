package sg.edu.rp.soi.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgMaterial, rgLesson, rgProblem;
    String strMaterial="",strLesson="",strProblem="";
    EditText etmultitext;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgMaterial = findViewById(R.id.radioGroup1);
        rgLesson = findViewById(R.id.radioGroup2);
        rgProblem = findViewById(R.id.radioGroup3);
        etmultitext = findViewById(R.id.etmultitext);
        btnOk = findViewById(R.id.btnOK);

        rgMaterial.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(RadioGroup group, int checkedId) {
                  RadioButton radioButton = (RadioButton) findViewById(checkedId);
                  strMaterial=radioButton.getText().toString().trim();
              }
          }
        );

        rgLesson.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(RadioGroup group, int checkedId) {
                  RadioButton radioButton = (RadioButton) findViewById(checkedId);
                  strLesson=radioButton.getText().toString().trim();
              }
          }
        );

        rgProblem.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(RadioGroup group, int checkedId) {
                  RadioButton radioButton = (RadioButton) findViewById(checkedId);
                  strProblem=radioButton.getText().toString().trim();
              }
          }
        );

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it=new Intent(MainActivity.this,Summary.class);
                it.putExtra("material",strMaterial);
                it.putExtra("lesson",strLesson);
                it.putExtra("problem",strProblem);
                it.putExtra("multitext",etmultitext.getText().toString().trim());
                startActivity(it);

            }
        });

    }

}
