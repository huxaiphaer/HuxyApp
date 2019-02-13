package huxy.huxy.huxylab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import huxy.huxy.huxylab2.HuxyApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onShowToast(View v){

        HuxyApp.successToast(MainActivity.this,"Hey are you okay , or you are not fine ", Gravity.CENTER,0,0);
    }
}
