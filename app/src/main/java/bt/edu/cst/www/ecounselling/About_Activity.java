package bt.edu.cst.www.ecounselling;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.hdodenhof.circleimageview.CircleImageView;

public class About_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_);

        CircleImageView imageView=(CircleImageView)findViewById(R.id.profile_image);
        String dot=Integer.toString(R.drawable.doten);
        imageView.setImageDrawable(Drawable.createFromPath(dot));
    }
}
