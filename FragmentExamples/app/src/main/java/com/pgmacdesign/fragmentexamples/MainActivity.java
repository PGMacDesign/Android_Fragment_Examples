package com.pgmacdesign.fragmentexamples;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;


public class MainActivity extends Activity implements Communicator {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		/*
		Unused at the moment
		//Object of MyFragment (The java file)
		MyFragment frag = new MyFragment();

		//Create a reference to the Fragment
		FragmentManager manager = getFragmentManager();

		FragmentTransaction transaction = manager.beginTransaction();

		transaction.add(R.id.my_layout, frag, "MyFragment");
		transaction.commit();
		*/
	}

	@Override
	public void respond(String data) {

		//Get reference to fragment 2
		FragmentManager manager = getFragmentManager();
		FragmentB f2 = (FragmentB) manager.findFragmentById(R.id.fragment2);

		f2.changeText(data);
	}


}
