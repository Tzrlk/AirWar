package nz.co.aetheric.airwar;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity {
    private static final int REQ_LOGIN = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		
		// todo: get credentials from app storage
		Object auth = null;
		
		if (auth == null) {
			Intent intent = new Intent(this, LoginActivity.class);
			super.startActivityForResult(intent, REQ_LOGIN);
			return;
		}
		
        setContentView(R.layout.main);
    }
	
	@Override
	public void onActivityResult(int reqCode, int respCode, Intent data) {
		switch (reqCode) {
			case REQ_LOGIN:
			    Intent intent = new Intent(this, MenuAction.class);
				super.startActivity(intent);
				break;
		}
	}
}
