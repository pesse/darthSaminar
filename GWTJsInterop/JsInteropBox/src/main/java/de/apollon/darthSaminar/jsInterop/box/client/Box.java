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
import de.pesse.gwt.jsinterop.threeJs.cameras.PerspectiveCamera;
import de.pesse.gwt.jsinterop.threeJs.core.Geometry;
import de.pesse.gwt.jsinterop.threeJs.geometries.BoxBufferGeometry;
import de.pesse.gwt.jsinterop.threeJs.loaders.TextureLoader;
import de.pesse.gwt.jsinterop.threeJs.materials.Material;
import de.pesse.gwt.jsinterop.threeJs.materials.MeshBasicMaterial;
import de.pesse.gwt.jsinterop.threeJs.materials.MeshBasicMaterialParameters;
import de.pesse.gwt.jsinterop.threeJs.objects.Mesh;
import de.pesse.gwt.jsinterop.threeJs.renderers.WebGLRenderer;
import de.pesse.gwt.jsinterop.threeJs.scenes.Scene;
import de.pesse.gwt.jsinterop.threeJs.textures.Texture;

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
	private Mesh mesh;

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
		camera.position.z = 400;


		scene = new Scene();

		Texture texture = new TextureLoader().load("textures/crate.gif");
		Geometry geometry = new BoxBufferGeometry(200, 200, 200);
		Material material = new MeshBasicMaterial( new MeshBasicMaterialParameters.Builder()
				.map(texture)
				.build() );

		mesh = new Mesh(geometry, material);

		scene.add(mesh);

		renderer = new WebGLRenderer();
		renderer.setSize(Window.getClientWidth(), Window.getClientHeight());

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

		mesh.rotation.x += 0.005;
		mesh.rotation.y += 0.01;

		renderer.render(scene, camera);
	}
}
