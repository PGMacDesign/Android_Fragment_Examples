package com.pgmacdesign.fragmentexamples2_modular;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by PatrickSSD2 on 1/29/2015.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {

	ListView listView;

	Communicator communicator;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_a, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		communicator = (Communicator) getActivity();

		listView = (ListView) getActivity().findViewById(R.id.fragment_a_list_view);

		ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.titles, android.R.layout.simple_list_item_1);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(this);
	}


	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		communicator.respond(position);
	}
}
