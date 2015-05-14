package com.pgmacdesign.fragmentexamples3_flexibleui;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by PatrickSSD2 on 1/29/2015.
 */
public class FragmentB extends Fragment {

	TextView textView;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_b, container, false);

		textView = (TextView) view.findViewById(R.id.fragment_b_text_view);

		return view;

	}


	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		//textView = (TextView) getView().findViewById(R.id.fragment_b_text_view);


	}

	public void changeTextView(int position){

		String [] descriptions = getResources().getStringArray(R.array.descriptions);

		Log.d("Position is: ", Integer.toString(position));

		textView.setText(descriptions[position]);
	}
}
