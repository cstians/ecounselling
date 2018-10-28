package bt.edu.cst.www.ecounselling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.AccessController;

public class Help_Activity extends AppCompatActivity {
    private TextView textView1,textView2;

    String userman="User Manual";
    String terms="Terms & Conditions";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);

        textView1.setText(userman);
        textView1.setGravity(Gravity.CENTER);
        textView2.setText(terms);
        textView2.setGravity(Gravity.CENTER);


        ImageView imageview1 = (ImageView)findViewById(R.id.imageView1);
        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act1 = new Intent(v.getContext(), User_Manual.class);
                startActivity(act1);
            }
        });

        ImageView imageview2=(ImageView)findViewById(R.id.imageView2);
        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent act2=new Intent(v1.getContext(), TermsAndConditions.class);
                startActivity(act2);
            }
        });
    }
}
