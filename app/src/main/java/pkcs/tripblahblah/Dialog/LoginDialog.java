package pkcs.tripblahblah.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import pkcs.tripblahblah.R;

/**
 * Created by bgh29 on 2017-07-03.
 */

public class LoginDialog extends Dialog implements DialogInterface, View.OnClickListener{
    private Button loginBtn;
    private final Context con;

    public LoginDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_login);

        con=context;
        loginBtn = (Button)findViewById(R.id.button_login);
        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==loginBtn) {
            //google login
        }
        cancel();
    }
}