package com.example.kosict_stikk;

import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private final int UPDATE = 200; // used for the item menu which is selected to update app
	private final int  DIALOG_ABOUT =100; // used for the item menu which is selected to open about dialog
	private Button sponsors; // sponsor button on the home activity that opens sponsor Activity
	private Button about; //about button on the home activity opens about activity
	private Button speakers; // speakers button on the home acticity opens speakers activity
	private Button saturday; // saturday button on the home activity opens saturday activity
	
	private Button venue;  //venue button on the home activity opens venue activity

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


	//Button program=(Button)findViewById(R.id.program);
	//Button speakers=(Button)findViewById(R.id.speakers);
	//Button sponsors=(Button)findViewById(R.id.sponsors);
	//Button about=(Button)findViewById(R.id.about);
    
    /*about.setOnClickListener(new OnClickListener(){
        public void onClick(View view) {
            //Create the intent to start another activity
            Intent intent = new Intent(view.getContext(), about.class);
            startActivity(intent);
        }
    });*/
        
        venue = (Button) findViewById(R.id.buttonVenue); // set sponsors button with the id
		venue.setOnClickListener(new OnClickListener() // set the onClick listener for sponsor button with anonim lokal class
		{

			@Override
			public void onClick(View v) 
			{
				Intent ourIntent = new Intent(MainActivity.this,Map.class); //new intent to open new the Sponsors Activity
				startActivity(ourIntent); // starts the intent
			}
		});
		
		speakers = (Button) findViewById(R.id.buttonSpeakers); // set sponsors button with the id
		speakers.setOnClickListener(new OnClickListener() // set the onClick listener for sponsor button with anonim lokal class
		{

			@Override
			public void onClick(View v) 
			{
				Intent ourIntent = new Intent(MainActivity.this,Speakers.class); //new intent to open new the Sponsors Activity
				startActivity(ourIntent); // starts the intent
			}
		});
		
		sponsors = (Button) findViewById(R.id.buttonSponsors); // set sponsors button with the id
		sponsors.setOnClickListener(new OnClickListener() // set the onClick listener for sponsor button with anonim lokal class
		{

			@Override
			public void onClick(View v) 
			{
				Intent ourIntent = new Intent(MainActivity.this,Sponsor.class); //new intent to open new the Sponsors Activity
				startActivity(ourIntent); // starts the intent
			}
		});
		
		about= (Button) findViewById(R.id.buttonAbout);
		about.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent ourIntent = new Intent(MainActivity.this,About.class);
				startActivity(ourIntent);
			}
		});
		
		saturday = (Button) findViewById(R.id.buttonSaturDay);
		saturday.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v) 
			{
				Intent ourIntent = new Intent(MainActivity.this, Saturday.class);
				startActivity(ourIntent);
			}
		});

        
        
        
        
}
	private boolean isNetworkAvailable() {
	    ConnectivityManager connectivityManager 
	          = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
	    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
	    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
	}

}
