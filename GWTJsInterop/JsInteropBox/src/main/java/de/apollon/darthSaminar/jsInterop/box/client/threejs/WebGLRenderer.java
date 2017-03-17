/**
 *
 */
package de.apollon.darthSaminar.jsInterop.box.client.threejs;

import jsinterop.annotations.JsType;

/**
 * @author snitsche
 *
 */

@JsType(isNative=true, namespace="THREE")
public class WebGLRenderer
{

	public Object domElement;

	public native void render( Object scene, Object camera );

	public native void setSize( int width, int height);

}
