package bt.edu.cst.www.ecounselling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {
    TextView quest, sympt;
    Button yesBut, noBut, exitBut;
    String q,s,q1,q2,q3,s1,s2,s3,depr,nodepr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //Initialization
        quest=findViewById(R.id.ques);
        sympt=findViewById(R.id.symp);
        //Logic
        yesBut=findViewById(R.id.yesbut);
        noBut=findViewById(R.id.nobut);
        exitBut=findViewById(R.id.exitbut);
        q1=getString(R.string.question1);
        q2=getString(R.string.question2);
        q3=getString(R.string.question3);
        s1=getString(R.string.symptoms1);
        s2=getString(R.string.symptoms2);
        s3=getString(R.string.symptoms3);
        depr=getString(R.string.depression);
        nodepr=getString(R.string.no_dep);
    }

    public void yesClick(View v) {
        q=quest.getText().toString();
        if(q.equals(q1)) {
            quest.setText(q2);
            sympt.setText(s2);
        }
        if(q.equals(q2)) {
            quest.setText(q3);
            sympt.setText(s3);
        }
        if(q.equals(q3)) {
            quest.setText("");
            sympt.setText(depr);
            yesBut.setVisibility(View.GONE);
            noBut.setVisibility(View.GONE);
            exitBut.setVisibility(View.VISIBLE);
        }

    }

    public void noClick(View v) {
        q=quest.getText().toString();
        quest.setText("");
        sympt.setText(nodepr);
        yesBut.setVisibility(View.GONE);
        noBut.setVisibility(View.GONE);
        exitBut.setVisibility(View.VISIBLE);
    }

    public void exitToMain(View v) {
        startActivity(new Intent(getApplication(), MainActivity.class));
    }
}
