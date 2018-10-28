package bt.edu.cst.www.ecounselling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import bt.edu.cst.www.ecounselling.BuildConfig;

public class About extends AppCompatActivity {
    TextView versionTag, appName;
    String versionName;
    int appNameStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        versionName="Version "+BuildConfig.VERSION_NAME;
        versionTag = findViewById(R.id.version_name);
        appName = findViewById(R.id.app_name);
        versionTag.setText(versionName);
        appNameStr=R.string.app_name;
        appName.setText(appNameStr);
    }
}
