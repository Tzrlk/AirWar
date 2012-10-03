package nz.co.aetheric.airwar;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;

/** This activity represents the main menu, and entry point for the application. */
public class MenuActivity extends Activity {
    private static final int REQ_LOGIN = 1;
	
	private AuthStatus authStatus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		
		// Get the current auth status, if any.
		Intent intent = new Intent(this, AuthActivity.class);
		super.startActivityForResult(intent, REQ_LOGIN);
		
        super.setContentView(R.layout.menu);
    }
	
	@Override
	public void onActivityResult(int reqCode, int respCode, Intent data) {
		switch (reqCode) {
			case REQ_LOGIN:
			    String authStatus = data.getStringExtra(Keys.AuthStatus);
				this.authStatus = AuthStatus.valueOf(authStatus);
				break;
		}
	}
}
