package bt.edu.cst.www.ecounselling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About_Page extends AppCompatActivity {

    public TextView textView2, getTextView3, getTextView4, getTextView5;
    String name="Name: Khushwanth Chhetri\nEmail_id:khushwanth.chhetri@gmail.com\nPhone No.:17804011";
    String sname="Name: Sonam Dema\nEmail_id:somdem96@gmail.com\nPhone No.:17890748";
    String dname="Name: Doten Dorji\nEmail_id:dotenkhengkhomshar@gmail.com\nPhone No.:17955368";
    String gname="Name: Galley Nmagyel\nEmail_id:galleynamgyel@gmail.com\nPhone No.:17453668";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__page);
        textView2=(TextView)findViewById(R.id.textView2);
        textView2.setText(name);
        getTextView3.setText(sname);
        getTextView4.setText(dname);
        getTextView5.setText(gname);
    }
}
