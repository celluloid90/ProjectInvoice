package com.example.invoice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.actionbarsherlock.app.SherlockFragment;
import com.example.invoice.R;

public class TabInvoiceEdit extends SherlockFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_tab_invoice_edit, container, false);
	    return rootView;
	}
}
