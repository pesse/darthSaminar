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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="document")
public class Document
{

	public static Body body;

}
