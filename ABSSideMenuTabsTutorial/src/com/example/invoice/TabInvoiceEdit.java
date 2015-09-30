package com.example.invoice;

import com.actionbarsherlock.app.SherlockFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class TabInvoiceEdit extends SherlockFragment {

	private AddInvoiceCustomAdapter mAdapter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_tab_invoice_edit, container, false);
		mAdapter = new AddInvoiceCustomAdapter(getActivity());
//		for (int i = 1; i < 30; i++) {
//			mAdapter.addItem("Row Item #" + i);
//			if (i % 4 == 0) {
//				mAdapter.addSectionHeaderItem("Section #" + i);
//			}
//		}
		((ListView) rootView.findViewById(R.id.lv_invoice_item)).setAdapter(mAdapter);
	    return rootView;
	}
}
