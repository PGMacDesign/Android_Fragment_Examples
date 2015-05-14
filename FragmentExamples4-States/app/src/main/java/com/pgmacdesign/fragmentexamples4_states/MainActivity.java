package com.pgmacdesign.fragmentexamples4_states;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

	//Reference to the Fragment Manager
	FragmentManager manager;

	//Buttons
	Button button, button2, button3, button4, button5, button6, button7, button8, button9, button10;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		manager = getFragmentManager(); //This is the object with which you perform all fragment activities

		button = (Button) findViewById(R.id.button);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		button10 = (Button) findViewById(R.id.button10);

		button.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
		button6.setOnClickListener(this);
		button7.setOnClickListener(this);
		button8.setOnClickListener(this);
		button9.setOnClickListener(this);
		button10.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
			//Add A
			case R.id.button:
				FragmentA f1a = new FragmentA();
				FragmentTransaction transaction1 = manager.beginTransaction();
				transaction1.add(R.id.group, f1a, "A"); //String is unique and reference-able
				transaction1.commit();
				break;

			//Remove A
			case R.id.button2:
				FragmentA f2a = (FragmentA) manager.findFragmentByTag("A"); //Same Id as mentioned above in R.id.button
				FragmentTransaction transaction2 = manager.beginTransaction();
				//Have an if else to prevent crashes
				if (f2a != null){
					transaction2.remove(f2a);
					transaction2.commit();
				} else {
					Toast.makeText(this, "Nothing to remove", Toast.LENGTH_SHORT);
				}
				break;

			//Replace A with B
			case R.id.button3:
				FragmentB f3b = new FragmentB();
				FragmentTransaction transaction3 = manager.beginTransaction();
				transaction3.replace(R.id.group, f3b, "B"); //String is unique and reference-able
				transaction3.commit();
				break;

			//Add B
			case R.id.button4:
				FragmentB f4b = new FragmentB();
				FragmentTransaction transaction4 = manager.beginTransaction();
				transaction4.add(R.id.group, f4b, "B"); //String is unique and reference-able
				transaction4.commit();
				break;

			//Replace B with A
			case R.id.button5:
				FragmentA f5a = new FragmentA();
				FragmentTransaction transaction5 = manager.beginTransaction();
				transaction5.replace(R.id.group, f5a, "A"); //String is unique and reference-able
				transaction5.commit();
				break;

			//Remove B
			case R.id.button6:
				FragmentB f6b = (FragmentB) manager.findFragmentByTag("B"); //Same Id as mentioned above in R.id.button4
				FragmentTransaction transaction6 = manager.beginTransaction();
				//Have an if else to prevent crashes
				if (f6b != null){
					transaction6.remove(f6b);
					transaction6.commit();
				} else {
					Toast.makeText(this, "Nothing to remove", Toast.LENGTH_SHORT);
				}
				break;

			//Detach A
			case R.id.button7:
				FragmentA f7a = (FragmentA) manager.findFragmentByTag("A"); //Reference the tag, "A"
				FragmentTransaction transaction7 = manager.beginTransaction();
				if (f7a != null){
					transaction7.detach(f7a);
					transaction7.commit();
				} else {
					Toast.makeText(this, "Nothing to remove", Toast.LENGTH_SHORT);
				}
				break;

			//Detach B
			case R.id.button8:
				FragmentB f8b = (FragmentB) manager.findFragmentByTag("B"); //Reference the tag, "A"
				FragmentTransaction transaction8 = manager.beginTransaction();
				if (f8b != null){
					transaction8.detach(f8b);
					transaction8.commit();
				} else {
					Toast.makeText(this, "Nothing to remove", Toast.LENGTH_SHORT);
				}
				break;

			//Attach A
			case R.id.button9:
				FragmentA f9a = (FragmentA) manager.findFragmentByTag("A");
				FragmentTransaction transaction9 = manager.beginTransaction();
				if (f9a != null){
					transaction9.attach(f9a);
					transaction9.commit();
				} else {
					Log.d("Unable To: ", "Attach A");
				}
				break;

			//Attach B
			case R.id.button10:
				FragmentB f10b = (FragmentB) manager.findFragmentByTag("B");
				FragmentTransaction transaction10 = manager.beginTransaction();
				if (f10b != null){
					transaction10.attach(f10b);
					transaction10.commit();
				} else {
					Log.d("Unable To: ", "Attach B");
				}
				break;
		}

	}
}
