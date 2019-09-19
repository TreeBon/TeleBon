package org.telebon.messenger;

import android.content.Context;
import androidx.multidex.MultiDex;

public class MultiDexApplicationLoader extends ApplicationLoader{

	@Override
	protected void attachBaseContext(Context base){
		super.attachBaseContext(base);
		MultiDex.install(this);
	}
}