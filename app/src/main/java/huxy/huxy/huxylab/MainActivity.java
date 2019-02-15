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

        HuxyApp.customToast(MainActivity.this,
                "No internet connection please.",
                bg,textColor).setTextSize(15f).setPadding(3).setPositionAndOffSet(Gravity.CENTER,200,20);
    }
}
