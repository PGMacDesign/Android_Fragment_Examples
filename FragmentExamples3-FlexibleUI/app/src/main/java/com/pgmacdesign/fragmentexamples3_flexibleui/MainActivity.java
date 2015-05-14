package com.pgmacdesign.fragmentexamples3_flexibleui;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by PatrickSSD2 on 1/29/2015.
 */
public class MainActivity extends Activity implements  FragmentA.Communicator{

	private FragmentA f1a;
	private FragmentB f2b;
	private FragmentManager manager;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		manager=getFragmentManager();

		f1a = (FragmentA) manager.findFragmentById(R.id.fragment1a);

		f1a.setCommunicator(this); //the respond method that is implemented from Fragment a

		f2b = (FragmentB) manager.findFragmentById(R.id.fragment2b);

	}

	@Override
	public void respond(int index) {

		//Check if portrait mode. Translates to: if fragment is not null and it's not visible, it means
		//We are seeing the fragment and it is in horizontal as I declared it to be horizontal in the XML.
		if (f2b != null && f2b.isVisible()){ //Horizontal

			f2b.changeTextView(index);
		} else { //Vertical

			Intent intent = new Intent(this, Activity2.class);
			intent.putExtra("index", index);
			Log.d("index is at: ", Integer.toString(index));
			startActivity(intent);
		}
	}
}
