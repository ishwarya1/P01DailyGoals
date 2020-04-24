package sg.edu.rp.soi.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.radioButtonyes1);
        Button btn1 = findViewById(R.id.radioButtonno1);
        Button btn2 = findViewById(R.id.radioButtonyes2);
        Button btn3 = findViewById(R.id.radioButtonno2);
        Button btn4 =findViewById(R.id.rbno);
        Button btn5 = findViewById(R.id.rbyes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
