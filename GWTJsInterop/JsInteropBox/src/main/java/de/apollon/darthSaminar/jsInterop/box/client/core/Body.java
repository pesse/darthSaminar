/**
 *
 */
package de.apollon.darthSaminar.jsInterop.box.client.core;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author snitsche
 *
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Body
{

	public native void appendChild( Object element );

}
