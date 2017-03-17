/**
 *
 */
package de.apollon.darthSaminar.jsInterop.box.client;

import com.google.gwt.user.client.Window;

import de.apollon.darthSaminar.jsInterop.box.client.core.Document;
import de.apollon.darthSaminar.jsInterop.box.client.core.Window.AnimationFrameCallback;
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
import jsinterop.annotations.JsType;

/**
 * @author snitsche
 *
 */
@JsType(namespace="Example")
public class Box
{

	private WebGLRenderer renderer;
	private PerspectiveCamera camera;
	private Scene scene;
	private Mesh mesh;
	private AnimationFrameCallback callback;

	/**
	 *
	 */
	public Box()
	{
		init();
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

		renderer.render(scene, camera);

		 callback = new AnimationFrameCallback()
		{

			@Override
			public void execute()
			{
				de.apollon.darthSaminar.jsInterop.box.client.core.Window.requestAnimationFrame(callback);

				mesh.rotation.x += 0.005;
				mesh.rotation.y += 0.01;

				renderer.render(scene, camera);
			}
		};

		de.apollon.darthSaminar.jsInterop.box.client.core.Window.requestAnimationFrame(callback);

	}
}
