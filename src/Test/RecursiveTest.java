package Test;

import java.awt.Color;

import org.junit.Test;

import Elements.AmbientLight;
import Elements.SpotLight;
import Geometries.Sphere;
import Geometries.Triangle;
import Primitives.Coordinate;
import Primitives.Material;
import Primitives.Point3D;
import Primitives.Vector;
import Renderer.ImageWriter;
import Renderer.Render;
import Scene.Scene;

public class RecursiveTest {

	@Test
	public void testRefractionRays() throws Exception{
		
		Scene scene = new Scene();
		scene.setAmbientLight(new AmbientLight(0,new Color(0,0,0)));
		scene.addGeometry(new Sphere(800, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -1000)),new Color(0, 0, 100),new Material(1,1,20,0,0.4)));
		scene.addGeometry(new Sphere(500, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -1000)),new Color(100, 0, 0),new Material(1,1,20,0,0)));
		
		scene.addLight(new SpotLight( new Point3D(new Coordinate(-200),new Coordinate(-200),new Coordinate( -100)), 0, 0.000001, 0.000005, 
				   new Vector(new Point3D(new Coordinate(2),new Coordinate( 2),new Coordinate( -3))),new Color(255, 100, 100)));
		
		ImageWriter imageWriter = new ImageWriter("SpotSRayTest", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}
	@Test
	public void testRefractionRays1() throws Exception
	{
		Scene scene = new Scene();
		scene.setDistanceViewPlane(200);
		Sphere c= new Sphere (500, new Point3D(0.0, 0.0, -1000),new Color(0, 0, 100),new Material(1,1,20,0,0.5));
		Sphere  c2= new Sphere (250, new Point3D(0.0, 0.0, -1000),new Color(100, 0, 0),new Material(1,1,20,0,0));
		scene.addGeometry(c);
		scene.addGeometry(c2);		

		scene.addLight(new SpotLight(new Point3D(-200, -200, -150), 0.1, 0.00001, 0.000005,
				new Vector(new Point3D(2, 2, -3)),new Color(255, 100, 100)));
		ImageWriter imageWriter = new ImageWriter("SpotSRayTest1", 500, 500, 500, 500);

		Render render = new Render(scene,imageWriter);

		render.renderImage();
		imageWriter.writeToimage();
	}

	@Test
	public void testReflectionAndRefraction2() throws Exception
	{
		Scene scene = new Scene();
		scene.setDistanceViewPlane(300);
		Sphere c= new Sphere(300, new Point3D(-550, -500, -1000),new Color(0, 0, 100),new Material(1,1,20,0,0.5));
		scene.addGeometry(c);
		Sphere c2= new Sphere(150, new Point3D(-550, -500, -1000),new Color(100, 20, 20),new Material(1,1,20,0,0));
		scene.addGeometry(c2);

		Triangle triangle = new Triangle(new Point3D(1500, -1500, -1500),
				new Point3D(-1500, 1500, -1500),
				new Point3D( 200,  200, -375),new Color (20, 20, 20),new Material(1,1,20,1,0));	
		scene.addGeometry(triangle);
		
		Triangle triangle1 = new Triangle(new Point3D(1500, -1500, -1500),
				new Point3D(-1500, 1500, -1500),
				new Point3D(-1500, -1500, -1500),new Color (20, 20, 20),new Material(1,1,20,0.5,0));
		scene.addGeometry(triangle1);
		
		
		
		scene.addLight(new SpotLight( new Point3D(200, 200, -150),0, 0.00001, 0.000005,
				new Vector(new Point3D(-2, -2, -3)),new Color(255, 100, 100)));
		
		ImageWriter imageWriter = new ImageWriter("test Reflection Refraction 2", 500, 500, 500, 500);
		Render render = new Render(scene,imageWriter);

		render.renderImage();
		imageWriter.writeToimage();
	}
	@Test
	public void testRefractionRays2() throws Exception{
		
		Scene scene = new Scene();
		scene.setAmbientLight(new AmbientLight(0.1,new Color(255,255,255)));
		scene.addGeometry(new Sphere(800, new Point3D(new Coordinate(500),new Coordinate(500),new Coordinate( -1000)),new Color(0, 0, 0),new Material(1,1,20,0,0.4)));
		scene.addGeometry(new Sphere(500, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -1000)),new Color(100, 50, 0),new Material(1,1,20,0,0)));
		
		scene.addLight(new SpotLight( new Point3D(new Coordinate(200),new Coordinate(200),new Coordinate(0)), 0, 0.000001, 0.000005, 
				   new Vector(new Point3D(new Coordinate(2),new Coordinate( 2),new Coordinate( -3))),new Color(0, 0, 0)));
		
		ImageWriter imageWriter = new ImageWriter("SpotSRayTest2", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}

}
