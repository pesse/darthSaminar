/**
 *
 */
package de.apollon.darthSaminar.jsInterop.box.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
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
		Button b = new Button("Click me", (ClickHandler) e -> Window.alert("Hello apollon, thanks for the fish"));
		RootPanel.get().add(b);
	}

}
