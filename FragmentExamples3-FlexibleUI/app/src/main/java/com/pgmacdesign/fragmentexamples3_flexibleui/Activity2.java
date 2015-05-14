package com.pgmacdesign.fragmentexamples3_flexibleui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

//This activity is designed to hold data that cannot be shown in split view if in portrait mode
public class Activity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);

		Intent intent = getIntent();

		int index = intent.getIntExtra("index", 0);
		Log.d("Activity 2: ", "Index = " + Integer.toString(index));

		//reference the fragment
		FragmentB f3b = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2b);
		if (f3b != null){

			f3b.changeTextView(index);

		}

	}
}
