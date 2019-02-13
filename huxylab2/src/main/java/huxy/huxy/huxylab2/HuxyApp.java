package huxy.huxy.huxylab2;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class HuxyApp extends AppCompatActivity {



    public static void huxyToast(int position, Activity activity) {

        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.lib_activity_main,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container));

        TextView text = layout.findViewById(R.id.header1);
        text.setText("This is a toast");

        Toast toast = new Toast(activity);
        toast.setGravity(position, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    public static void huxyToast(int position, int offsetX, int offesetY, Activity activity) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.lib_activity_main,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container));

        TextView text = layout.findViewById(R.id.header1);
        text.setText("This is a custom toast");

        Toast toast = new Toast(activity);
        toast.setGravity(position, offsetX, offesetY);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.lib_activity_main);
    }

}
