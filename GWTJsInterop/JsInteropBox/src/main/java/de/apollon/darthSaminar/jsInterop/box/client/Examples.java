/**
 *
 */
package de.apollon.darthSaminar.jsInterop.box.client;

import com.google.gwt.core.client.EntryPoint;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;

/**
 * @author snitsche
 *
 */
public class Examples implements EntryPoint
{

	@Override
	public void onModuleLoad()
	{
		init();
	}


	@JsMethod(namespace=JsPackage.GLOBAL)
	public static native void init();
}
