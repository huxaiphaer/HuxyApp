package huxy.huxy.huxylab2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class HuxyApp extends AppCompatActivity {


    public static void successToast(Activity activity, String message, int position, int xOffset, int yOffset) {

        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.lib_activity_main,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container));

        layout.setBackgroundColor(activity
                .getResources().getColor(R.color.successMessage));

        TextView text = layout.findViewById(R.id.header1);
        text.setText(message);

        Toast toast = new Toast(activity);
        toast.setGravity(position, xOffset, yOffset);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }

    public static void dangerToast(Activity activity, String message, int position, int xOffset, int yOffset) {

        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.lib_activity_main,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container));

        layout.setBackgroundColor(activity
                .getResources().getColor(R.color.dangerMessage));

        TextView text = layout.findViewById(R.id.header1);
        text.setText(message);

        Toast toast = new Toast(activity);
        toast.setGravity(position, xOffset, yOffset);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }

    public static void warningToast(Activity activity, String message, int position, int xOffset, int yOffset) {

        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.lib_activity_main,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container));

        layout.setBackgroundColor(activity
                .getResources().getColor(R.color.warningMessage));

        TextView text = layout.findViewById(R.id.header1);
        text.setText(message);

        Toast toast = new Toast(activity);
        toast.setGravity(position, xOffset, yOffset);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }


}
