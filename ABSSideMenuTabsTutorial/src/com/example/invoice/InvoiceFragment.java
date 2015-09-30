package com.example.invoice;

import java.lang.reflect.Field;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.actionbarsherlock.app.SherlockFragment;
import com.example.invoice.R;

public class InvoiceFragment extends SherlockFragment {

	private FragmentTabHost mTabHost;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mTabHost = new FragmentTabHost(getSherlockActivity());
		mTabHost.setup(getSherlockActivity(), getChildFragmentManager(),
				R.layout.fragment_invoice);
		mTabHost.addTab(mTabHost.newTabSpec("all").setIndicator("All"),
				TabAllInvoice.class, null);
		mTabHost.addTab(
				mTabHost.newTabSpec("outstanding").setIndicator("Outstanding"),
				TabOutstandingInvoice.class, null);
		mTabHost.addTab(mTabHost.newTabSpec("paid").setIndicator("Paid"),
				TabPaidInvoice.class, null);

		return mTabHost;
	}

	// Detach FragmentTabHost
	@Override
	public void onDetach() {
		super.onDetach();

		try {
			Field childFragmentManager = Fragment.class
					.getDeclaredField("mChildFragmentManager");
			childFragmentManager.setAccessible(true);
			childFragmentManager.set(this, null);

		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	// Remove FragmentTabHost
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		mTabHost = null;
	}
}
