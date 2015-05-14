package com.pgmacdesign.fragmentexamples;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by PatrickSSD2 on 1/27/2015.
 */
public class FragmentB extends Fragment {

	TextView text;
	String data;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_b, container, false);

		if (savedInstanceState == null){
			//Nothing, new call
		} else {
			data = savedInstanceState.getString("text");
			TextView myText = (TextView) view.findViewById(R.id.fragment_b_textView);
			myText.setText(data);
		}

		return view;


	}

	/*
	Use on Activity Created for all UI definitions as it fires AFTER onCreateView. If UI code is written
	in the onCreateView, it may fire asynchonously to the onCreate in the activity, which will cause a force close
	 */
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		text = (TextView) getActivity().findViewById(R.id.fragment_b_textView);
	}

	//The saved instance state method stores the data from before the app gets destroyed
	public void onSaveInstanceState(Bundle outState){
		super.onSaveInstanceState(outState);
		outState.putString("text", data);
	}

	//Change the text in the textview
	public void changeText(String data){
		this.data = data;
		text.setText(data);
	}
}
