package com.pgmacdesign.fragmentexamples4_states;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//
public class FragmentB extends Fragment{

	private final String B = "FragmentB";

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.d(B, "onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(B, "onCreate");
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Log.d(B, "onCreateView");
		View view = inflater.inflate(R.layout.fragment_b, container, false);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(B, "onActivityCreated");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d(B, "onPause");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d(B, "onResume");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d(B, "onStop");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.d(B, "onDetach ");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d(B, "onDestroy");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d(B, "onDestroyView");
	}
}
