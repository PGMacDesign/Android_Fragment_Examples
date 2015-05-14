package com.pgmacdesign.fragmentexamples;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by PatrickSSD2 on 1/27/2015.
 */
public class FragmentA extends Fragment implements View.OnClickListener{

	Button button;
	int counter = 0;

	//Interface reference variable
	Communicator comm;

	//OnCreate to utilize the saved instance state
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		if (savedInstanceState == null){ //First time fragment is being made
			counter = 0;
			Log.d("FragmentA", "Counter is at " + counter);
		} else { //likely a previous fragment in a prevous orientation
			counter = savedInstanceState.getInt("counter", 0); //Return 0 in the event counter has a weird value
			Log.d("FragmentA", "Counter is at " + counter);
		}
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_a, container, false);
	}

	/*
	Use on Activity Created for all UI definitions as it fires AFTER onCreateView. If UI code is written
	in the onCreateView, it may fire asynchonously to the onCreate in the activity, which will cause a force close
	 */
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		button = (Button) getActivity().findViewById(R.id.fragment_a_button);
		button.setOnClickListener(this);

		//Makes a reference to the main activity
		comm = (Communicator) getActivity();
	}

	//The saved instance state method stores the data from before the app gets destroyed
	public void onSaveInstanceState(Bundle outState){
		super.onSaveInstanceState(outState);
		outState.putInt("counter", counter);
		Log.d("FragmentA", "Is this even getting called?");
	}

	@Override
	public void onClick(View v) {
		counter++;

		comm.respond("The Button was clicked " + counter + " times");
	}
}
