package com.example.kosict_stikk;

import java.util.ArrayList;
import java.util.List;


import android.app.Activity;
import android.os.Bundle;

public class Speakers extends Activity {
	
	private final int UPDATE = 500; 
	private final int  DIALOG_ABOUT = 100;
	private List<Speaker> mySpeakers = new ArrayList<Speaker>(); // ArrayList to hold all speaker items
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speakers);
			
	}
}
