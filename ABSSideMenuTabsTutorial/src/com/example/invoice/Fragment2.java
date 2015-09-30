package com.example.invoice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

public class Fragment2 extends SherlockFragment {
	// Declare Variable

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	// Detach FragmentTabHost
	@Override
	public void onDetach() {
		super.onDetach();

	}
	// Remove FragmentTabHost 
	@Override
	public void onDestroyView() {
		super.onDestroyView();
	}

}
