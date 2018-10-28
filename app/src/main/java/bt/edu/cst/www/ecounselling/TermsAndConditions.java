package bt.edu.cst.www.ecounselling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TermsAndConditions extends AppCompatActivity {
    public TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);

        textView3=(TextView)findViewById(R.id.textView3);
        String Heading="All the users of eCounselling app are expected to comply with following terms and conditions";
        textView3.setText(Heading);
    }
}
