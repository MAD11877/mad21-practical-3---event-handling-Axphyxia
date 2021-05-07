package sg.edu.np.week2practical;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG= "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button2);
        User user1 = new User("Jack", "Yes", 1, false);
        if (user1.followed == true){
            button.setText("Unfollow");
        }
        else {
            button.setText("Follow");
        }

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Button Pressed!");
                //If user has not followed
                if (user1.followed == false) {
                    button.setText("Unfollow");
                    user1.followed = true;
                } else {
                    //If has followed
                    button.setText("Follow");
                    user1.followed = false;
                }
            }
        });

    }
}