package huxy.huxy.huxylab2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class HuxyApp extends AppCompatActivity {

    private final static HuxyApp INSTANCE = new HuxyApp();
    static LayoutInflater inflater;
    static Toast toast;
    static TextView text;

    /**
     * This method is capable for showing the success toast message.
     *
     * @param activity This is the activity.
     * @param message  This is the message of the toast.
     * @return This returns the instance of the class.
     */
    public static HuxyApp successToast(Activity activity, String message) {

        inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.lib_activity_main,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container));

        layout.setBackgroundColor(activity
                .getResources().getColor(R.color.successMessage));

        text = layout.findViewById(R.id.header1);
        text.setText(message);

        toast = new Toast(activity);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

        return INSTANCE;

    }

    /**
     * This is the method for showing a danger toast message.
     *
     * @param activity This is the activity.
     * @param message  This is the message of the toast.
     * @return This returns the instance of the class.
     */
    public static HuxyApp dangerToast(Activity activity, String message) {

        inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.lib_activity_main,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container));

        layout.setBackgroundColor(activity
                .getResources().getColor(R.color.dangerMessage));

        text = layout.findViewById(R.id.header1);
        text.setText(message);

        toast = new Toast(activity);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

        return INSTANCE;

    }

    /**
     * This method is responsible for displaying the warning toast message.
     *
     * @param activity This is the activity.
     * @param message  This is the message of the toast.
     * @return Return the instance of the class.
     */
    public static HuxyApp warningToast(Activity activity, String message) {

        inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.lib_activity_main,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container));

        layout.setBackgroundColor(activity
                .getResources().getColor(R.color.warningMessage));

        text = layout.findViewById(R.id.header1);
        text.setText(message);

        toast = new Toast(activity);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

        return INSTANCE;

    }

    /**
     * This method is capable for setting the position and offsets.
     *
     * @param position This aligns the toast position.
     * @param xOffset  Sets the x offset.
     * @param yOffset  Sets the y offset.
     * @return returns the instance of the class.
     */
    public static HuxyApp setPositionAndOffSet(int position, int xOffset, int yOffset) {

        toast.setGravity(position, xOffset, yOffset);
        return INSTANCE;
    }

    public static HuxyApp setTextSize(float size) {

        text.setTextSize(size);
        return INSTANCE;
    }

    public static HuxyApp setPadding(int padding) {
        text.setPadding(padding, padding, padding, padding);
        return INSTANCE;
    }


}
