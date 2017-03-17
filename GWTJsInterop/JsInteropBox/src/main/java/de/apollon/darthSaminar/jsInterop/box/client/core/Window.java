/**
 *
 */
package de.apollon.darthSaminar.jsInterop.box.client.core;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author snitsche
 *
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="window")
public class Window
{

	public static native void requestAnimationFrame( AnimationFrameCallback Callback );


	@FunctionalInterface
	@JsFunction
	public static interface AnimationFrameCallback
	{
		public void execute();
	}
}
