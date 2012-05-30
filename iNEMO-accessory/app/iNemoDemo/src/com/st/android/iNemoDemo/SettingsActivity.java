package com.st.android.iNemoDemo;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {       
		super.onCreate(savedInstanceState);       
		addPreferencesFromResource(R.xml.preferences);
		setResult(RESULT_OK);
	}
}
