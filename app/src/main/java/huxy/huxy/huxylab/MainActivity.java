package huxy.huxy.huxylab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;

import huxy.huxy.huxylab2.HuxyApp;

public class MainActivity extends AppCompatActivity {

    public String textColor = "#ffffff";
    public String bg = "#000000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onShowToast(View view){

        String Bg = "#000";
        String textColor ="#fff";
        HuxyApp.customToast(MainActivity.this, "No internet connection please.",Bg,textColor)
                .setPositionAndOffSet(Gravity.BOTTOM,0,0);
    }
}
