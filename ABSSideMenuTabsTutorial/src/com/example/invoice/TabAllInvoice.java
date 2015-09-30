package com.example.invoice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.actionbarsherlock.app.SherlockFragment;
import com.example.invoice.R;

public class TabAllInvoice extends SherlockFragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.tab_all_invoice, container,
				false);
		ImageButton addNewInvoiceBtn = (ImageButton) rootView
				.findViewById(R.id.ib_add_invice_btn);
		addNewInvoiceBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Fragment fragment = new AddNewInvoiceFragment();
				FragmentManager fragmentManager = getActivity()
						.getSupportFragmentManager();
				FragmentTransaction fragmentTransaction = fragmentManager
						.beginTransaction();
				fragmentTransaction.replace(R.id.content_frame, fragment);
				fragmentTransaction.addToBackStack(null);
				fragmentTransaction.commit();
			}
		});
		return rootView;
	}
}
