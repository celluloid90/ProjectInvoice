package com.example.invoice;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.invoice.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TabOutstandingInvoice extends SherlockFragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.tab_outstanding_invoice, container, false);
		return rootView;
	}

}
