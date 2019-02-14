package huxy.huxy.huxylab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;

import huxy.huxy.huxylab2.HuxyApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onShowToast(View view){

        HuxyApp.dangerToast(MainActivity.this,"Hey there are you good.")
                .setPositionAndOffSet(Gravity.CENTER,0,0).setTextSize(15f);
    }
}
