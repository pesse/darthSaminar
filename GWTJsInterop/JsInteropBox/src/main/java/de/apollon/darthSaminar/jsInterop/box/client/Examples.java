/**
 *
 */
package de.apollon.darthSaminar.jsInterop.box.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * @author snitsche
 *
 */
public class Examples implements EntryPoint
{

	@Override
	public void onModuleLoad()
	{
		Box box = new Box();

		RootPanel.get().add(box);
	}

}
