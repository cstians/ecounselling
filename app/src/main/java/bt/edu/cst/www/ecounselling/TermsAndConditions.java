package bt.edu.cst.www.ecounselling;

import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;

public class TermsAndConditions extends AppCompatActivity {
    public TextView textView3;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);

        String[] helpArray=getResources().getStringArray(R.array.termsa);
        textView3=(TextView)findViewById(R.id.textView3);
        textView3.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);

    }
}
