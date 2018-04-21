package listView;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import mg.studio.myapplication.Cycle_MainActivity;
import mg.studio.myapplication.Login;
import mg.studio.myapplication.R;
import mg.studio.myapplication.SessionManager;
import mg.studio.myapplication.UserNameActivity;
import mg.studio.myapplication.app_private_MainActivity;
import mg.studio.myapplication.assets_MainActivity;
import mg.studio.myapplication.audio_recorder_MainActivity;
import mg.studio.myapplication.button_desigin_MainActivity;
import mg.studio.myapplication.button_intent_MainActivity;
import mg.studio.myapplication.button_startactivity_MainActivity;
import mg.studio.myapplication.button_toast_MainActivity;
import mg.studio.myapplication.color_MainActivity;
import mg.studio.myapplication.custom_adapter_MainActivity;
import mg.studio.myapplication.database_MainActivity;
import mg.studio.myapplication.edit_text_MainActivity;
import mg.studio.myapplication.fingerprint_MainActivity;
import mg.studio.myapplication.fragment_MainActivity;
import mg.studio.myapplication.gradient_background_MainActivity;
import mg.studio.myapplication.imagebutton_MainActivity;
import mg.studio.myapplication.intent_caller_MainActivity;
import mg.studio.myapplication.intent_extras_MainActivity;
import mg.studio.myapplication.layoutactivity_MainActivity;
import mg.studio.myapplication.listview1_MainActivity;
import mg.studio.myapplication.listview2_MainActivity;
import mg.studio.myapplication.radio_button_MainActivity;
import mg.studio.myapplication.radio_button_click_MainActivity;
import mg.studio.myapplication.service2_MainActivity;
import mg.studio.myapplication.service_MainActivity;
import mg.studio.myapplication.weather_app_MainActivity;
import mg.studio.myapplication.webview_MainActivity;

public class MainActivity extends Activity {
	private SessionManager session;
	public final static int LIFECYCLE = 0;
	public final static int USERNAME  = 1;
	public final static int Layout  = 2;
	public final static int Button_Desigin  = 3;
	public final static int Button_Toast  = 4;
	public final static int Button_intent  = 5;
	public final static int Button_StartActivity = 6;
	public final static int imageButton = 7;
	public final static int EditText = 8;
	public final static int RadioButtons_listener = 9;
	public final static int RadioBUttons_onclick = 10;
	public final static int ListView1 = 11;
	public final static int GetColor = 12;
	public final static int GradientBackground = 13;
	public final static int implicitIntent = 14;
	public final static int Weather_App_Design = 15;
	public final static int ListView2 = 16;
	public final static int ListViewCustomAdapter = 17;
	public final static int AudioRecorder = 18;
	public final static int Database = 19;
	public final static int FragmentOne = 20;
	public final static int Webview = 21;
	public final static int ServiceDemo = 22;
	public final static int Service = 23;
	public final static int Fingerprint = 24;
	public final static int AppPrivateDiretory = 25;
	public final static int AssetsFolder = 26;
	public final static int IntentExtras = 27;



	String[] myStringArray = new String[] { "LifeCycle", "UserName" ,"Layout","Button_Desigin","Button_Toast",
	"Button_intent","Button_StartActivity","imageButton","EditText","RadioButtons_listener",
	"RadioBUttons_onclick","ListView1","GetColor","GradientBackground","implicitIntent",
	"Weather_App_Design","ListView2","ListViewCustomAdapter","AudioRecorder","Database",
	"FragmentOne","Webview","ServiceDemo","Service",
	"Fingerprint","AppPrivateDiretory","AssetsFolder","IntentExtras"};

	public void logout() {
		// Updating the session
		session.setLogin(false);
		// Redirect the user to the login activity
		startActivity(new Intent(this, Login.class));
		finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.relative_layout);
		setContentView(R.layout.activity_main);
		ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myStringArray);

		ListView myListView = findViewById(R.id.myListView);
		myListView.setAdapter(arrayAdapter);

		//Handle click events
		final Context context = getApplicationContext();

		myListView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			    // Do something based on user clicked
				showToast(position, ((TextView) view).getText());
				switch (position) {
                    case LIFECYCLE:
                        startActivity(new Intent(context, Cycle_MainActivity.class));
                        break;
                    case USERNAME:
                        startActivity(new Intent(context, UserNameActivity.class));
                        break;

					case Layout:
						startActivity(new Intent(context,layoutactivity_MainActivity.class));
						break;
                    case Button_Desigin:
                        startActivity(new Intent(context,button_desigin_MainActivity.class));
                        break;
					case Button_Toast:
						startActivity(new Intent(context,button_toast_MainActivity.class));
						break;
					case Button_intent:
						startActivity(new Intent(context,button_intent_MainActivity.class));
						break;

					case Button_StartActivity:
						startActivity(new Intent(context,button_startactivity_MainActivity.class));
						break;
					case imageButton:
						startActivity(new Intent(context,imagebutton_MainActivity.class));
						break;
					case EditText:
						startActivity(new Intent(context,edit_text_MainActivity.class));
						break;
					case RadioButtons_listener:
						startActivity(new Intent(context,radio_button_MainActivity.class));
						break;
					case RadioBUttons_onclick:
						startActivity(new Intent(context,radio_button_click_MainActivity.class));
						break;
					case ListView1:
						startActivity(new Intent(context,listview1_MainActivity.class));
						break;
					case GetColor:
						startActivity(new Intent(context,color_MainActivity.class));
						break;
					case GradientBackground:
						startActivity(new Intent(context,gradient_background_MainActivity.class));
						break;
					case implicitIntent:
						startActivity(new Intent(context,intent_caller_MainActivity.class));
						break;
					case Weather_App_Design:
						startActivity(new Intent(context,weather_app_MainActivity.class));
						break;
					case ListView2:
						startActivity(new Intent(context,listview2_MainActivity.class));
						break;
					case ListViewCustomAdapter:
						startActivity(new Intent(context,custom_adapter_MainActivity.class));
						break;
					case AudioRecorder:
						startActivity(new Intent(context,audio_recorder_MainActivity.class));
						break;
                    case Database:
                        startActivity(new Intent(context,database_MainActivity.class));
                        break;
                    case FragmentOne:
                        startActivity(new Intent(context,fragment_MainActivity.class));
                        break;
					case Webview:
						startActivity(new Intent(context,webview_MainActivity.class));
						break;
					case ServiceDemo:
						startActivity(new Intent(context,service_MainActivity.class));
						break;
					case Service:
						startActivity(new Intent(context,service2_MainActivity.class));
						break;
					case Fingerprint:
						startActivity(new Intent(context,fingerprint_MainActivity.class));
						break;
					case AppPrivateDiretory:
						startActivity(new Intent(context,app_private_MainActivity.class));
						break;
					case AssetsFolder:
						startActivity(new Intent(context,assets_MainActivity.class));
						break;

					case IntentExtras:
						startActivity(new Intent(context,intent_extras_MainActivity.class));
						break;

				default:
					break;
				}
			}

			private void showToast(int position, CharSequence charSequence) {
				// Toast
				Toast.makeText(getBaseContext(), "The element in position "+position+" was clicked, it corresponds to \""+charSequence +"\"", Toast.LENGTH_LONG).show();
				
			}
		});

	}
}
