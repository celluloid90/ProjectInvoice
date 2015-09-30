package com.example.invoice;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.actionbarsherlock.app.SherlockFragment;
import com.example.invoice.R;

public class AddNewInvoiceFragment extends SherlockFragment {
	private FragmentTabHost mTabHost;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mTabHost = new FragmentTabHost(getSherlockActivity());
		mTabHost.setup(getSherlockActivity(), getChildFragmentManager(),
				R.layout.fragment_add_new_invoice);
		mTabHost.addTab(mTabHost.newTabSpec("edit").setIndicator("Edit"),
				TabInvoiceEdit.class, null);
		mTabHost.addTab(mTabHost.newTabSpec("preview").setIndicator("Preview"),
				TabInvoicePreview.class, null);
		mTabHost.addTab(mTabHost.newTabSpec("history").setIndicator("History"),
				TabInvoiceHistory.class, null);

		return mTabHost;
	}
// shahin test
}
