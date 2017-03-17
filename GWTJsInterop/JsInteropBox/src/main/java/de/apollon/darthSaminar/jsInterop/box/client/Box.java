/**
 *
 */
package de.apollon.darthSaminar.jsInterop.box.client;

import com.google.gwt.animation.client.AnimationScheduler;
import com.google.gwt.animation.client.AnimationScheduler.AnimationCallback;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;

import de.apollon.darthSaminar.jsInterop.box.client.core.Document;
import de.apollon.darthSaminar.jsInterop.box.client.threejs.PerspectiveCamera;
import de.apollon.darthSaminar.jsInterop.box.client.threejs.Scene;
import de.apollon.darthSaminar.jsInterop.box.client.threejs.WebGLRenderer;

/**
 * @author snitsche
 *
 */
public class Box extends Composite implements AnimationCallback
{

	private WebGLRenderer renderer;
	private Canvas canvas;
	private PerspectiveCamera camera;
	private Scene scene;

	/**
	 *
	 */
	public Box()
	{
		canvas = Canvas.createIfSupported();

		initWidget(canvas);
	}

	private void init()
	{

		camera = new PerspectiveCamera(70, (double)Window.getClientWidth()/(double)Window.getClientHeight(), 1, 1000);

		scene = new Scene();

		renderer = new WebGLRenderer();
		renderer.setSize(Window.getClientWidth(), Window.getClientHeight());
		//renderer.domElement = canvas.getCanvasElement();

		// camera = new THREE.PerspectiveCamera( 70, window.innerWidth / window.innerHeight, 1, 1000 );
		// camera.position.z = 400;
		// scene = new THREE.Scene();
		// var texture = new THREE.TextureLoader().load( 'textures/crate.gif' );
		// var geometry = new THREE.BoxBufferGeometry( 200, 200, 200 );
		// var material = new THREE.MeshBasicMaterial( { map: texture } );
		// mesh = new THREE.Mesh( geometry, material );
		// scene.add( mesh );
		// renderer = new THREE.WebGLRenderer();
		// renderer.setPixelRatio( window.devicePixelRatio );
		// renderer.setSize( window.innerWidth, window.innerHeight );
		// document.body.appendChild( renderer.domElement );

		Document.body.appendChild(renderer.domElement);

	}

	@Override
	protected void onLoad()
	{
		// TODO Auto-generated method stub
		super.onLoad();

		init();

		canvas.setVisible(false);


		AnimationScheduler.get().requestAnimationFrame(this);
	}

	/* (non-Javadoc)
	 * @see com.google.gwt.animation.client.AnimationScheduler.AnimationCallback#execute(double)
	 */
	@Override
	public void execute(double timestamp)
	{

		AnimationScheduler.get().requestAnimationFrame(this);


		renderer.render(scene, camera);
	}
}
