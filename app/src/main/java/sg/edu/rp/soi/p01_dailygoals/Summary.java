package sg.edu.rp.soi.p01_dailygoals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Summary extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_main);
        TextView tvans1 = findViewById(R.id.tvans1);
        TextView tvans2 = findViewById(R.id.tvans2);
        TextView tvans3 = findViewById(R.id.tvans3);
        TextView tvans4 = findViewById(R.id.tvans4);

        Bundle bun=getIntent().getExtras();

        if(bun!=null)
        {
            tvans1.setText(":"+bun.getString("material"));
            tvans2.setText(":"+bun.getString("lesson"));
            tvans3.setText(":"+bun.getString("problem"));
            tvans4.setText(":"+bun.getString("multitext"));
        }

    }


}
