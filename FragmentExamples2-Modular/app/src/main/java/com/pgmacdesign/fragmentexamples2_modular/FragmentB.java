package com.pgmacdesign.fragmentexamples2_modular;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
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
		return view;

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		textView = (TextView) getActivity().findViewById(R.id.fragment_b_text_view);
	}

	public void changeData(int i){
		Resources res = getResources();

		String[] description = res.getStringArray(R.array.descriptions);

		textView.setText(description[i]);
	}
}
