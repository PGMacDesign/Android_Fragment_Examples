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
public class FragmentA extends Fragment{

	private final String A = "FragmentA";

	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.d(A, "onAttach");
	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(A, "onCreate");
	}

	@Nullable
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_a, container, false);
		Log.d(A, "onCreate");
		return view;
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(A, "onActivityCreated");
	}

	public void onPause() {
		super.onPause();
		Log.d(A, "onPause");
	}

	public void onStop() {
		super.onStop();
		Log.d(A, "onStop");
	}

	public void onResume() {
		super.onResume();
		Log.d(A, "onResume");
	}

	public void onDestroyView() {
		super.onDestroyView();
		Log.d(A, "onDestroyView");
	}

	public void onDestroy() {
		super.onDestroy();
		Log.d(A, "onDestroy");
	}

	public void onDetach() {
		super.onDetach();
		Log.d(A, "onDetach");
	}
}
