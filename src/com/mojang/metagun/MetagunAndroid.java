package com.mojang.metagun;

import android.os.*;
import com.badlogic.gdx.backends.android.*;

public class MetagunAndroid extends AndroidApplication {
	/** Called when the activity is first created. */
	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
		initialize(new Metagun(), cfg);
	}

	//private void initialize(Metagun metagun)
	//{
		// TODO: Implement this method
	//}
}
