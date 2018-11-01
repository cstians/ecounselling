package bt.edu.cst.www.ecounselling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DepressionTest extends AppCompatActivity {
    Button beginTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_test);
        beginTest=findViewById(R.id.buttonBeginTest);
        beginTest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplication(),DepressionAssesment.class));            }
        });
    }
}
