package Test;

import java.awt.Color;

import org.junit.Test;

import Elements.AmbientLight;
import Elements.PointLight;
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

public class LightingTest {

	@Test 
	public void emmissionTest() throws Exception{
		
		Scene scene = new Scene();
		scene.setDistanceViewPlane(150);
		scene.addGeometry(new Sphere(50, new Point3D(new Coordinate(0.0),new Coordinate( 0.0), new Coordinate(-149)), Color.black,new Material(1,1,1)));
		
		Triangle triangle = new Triangle(new Point3D( new Coordinate(100),new Coordinate( 0),new Coordinate( -149)),
				 						 new Point3D( new Coordinate( 0),new Coordinate( 100),new Coordinate(-149)),
				 						 new Point3D( new Coordinate(100),new Coordinate( 100),new Coordinate(-149)),
				 						 Color.yellow,
				 						 new Material(1,1,1)
				 						 );
		
		Triangle triangle2 = new Triangle(new Point3D( new Coordinate(100),new Coordinate( 0),new Coordinate( -149)),
				 			 			  new Point3D(  new Coordinate(0), new Coordinate(-100),new Coordinate( -149)),
				 			 			  new Point3D( new Coordinate(100),new Coordinate(-100),new Coordinate( -149)),
				 			 			  Color.green,					 						
				 			 			  new Material(1,1,1));
		
		Triangle triangle3 = new Triangle(new Point3D(new Coordinate(-100),new Coordinate( 0),new Coordinate( -149)),
				 						  new Point3D( new Coordinate( 0), new Coordinate(100), new Coordinate(-149)),
				 						  new Point3D(new Coordinate(-100),new Coordinate( 100),new Coordinate( -149)),
				 						  Color.black,
				 						 new Material(1,1,1));
		
		Triangle triangle4 = new Triangle(new Point3D(new Coordinate(-100),new Coordinate( 0),new Coordinate( -149)),
				 			 			  new Point3D( new Coordinate( 0), new Coordinate( -100),new Coordinate( -149)),
				 			 			  new Point3D(new Coordinate(-100), new Coordinate(-100),new Coordinate( -149)),
					 						Color.blue,
					 						new Material(1,1,1));
		
		scene.addGeometry(triangle);
		scene.addGeometry(triangle2);
		scene.addGeometry(triangle3);
		scene.addGeometry(triangle4);
		AmbientLight al=new AmbientLight();
		al.setKa(0.2);
		scene.setAmbientLight(al);
		ImageWriter imageWriter = new ImageWriter("Emmition test", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();
		render.printGrid(50);
		imageWriter.writeToimage();
	}
	
	
	@Test
	public void spotLightTest2() throws Exception{//sphere with triangle and light-check shadow
		
		Scene scene = new Scene();
		//scene.setBackground(Color.pink);
		scene.setDistanceViewPlane(200);
		Material m=new Material(1,1,1);
		m.setN(20);
		Sphere sphere = new Sphere(500, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -1000)),new Color(0, 0, 100),new Material(1,1,1));
		sphere.setMaterial(m);
		scene.addGeometry(sphere);
		
		
		Triangle triangle = new Triangle(new Point3D(new Coordinate(-125), new Coordinate(-225),new Coordinate( -260)),
										 new Point3D(new Coordinate(-225),new Coordinate( -125), new Coordinate(-260)),
										 new Point3D(new Coordinate(-225),new Coordinate( -225),new Coordinate( -270)),
										 new Color (0, 0, 100),new Material(1,1,1));
		Material m1=new Material(1,1,1);
		m1.setN(4);
		triangle.setMaterial(m);
		scene.addGeometry(triangle);
		
		scene.addLight(new SpotLight( new Point3D(new Coordinate(-200),new Coordinate( -200),new Coordinate( -150)),0.1, 0.00001, 0.000005, 
					   new Vector(new Point3D(new Coordinate(2),new Coordinate( 2),new Coordinate( -3))),new Color(255, 100, 100)));
	
		ImageWriter imageWriter = new ImageWriter("Spot test 2", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}
	
	@Test
	public void spotLightTest() throws Exception{//a sphere with spot light
		
		Scene scene = new Scene();
		//scene.setBackground(Color.pink);
		Sphere sphere = new Sphere(800, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -1000)),new Color(0, 0, 100),new Material(1,1,1));
		Material m=new Material(1,1,1);
		m.setN(20);
		sphere.setMaterial(m);
		scene.addGeometry(sphere);
		scene.addLight(new SpotLight( new Point3D(new Coordinate(-200),new Coordinate( -200),new Coordinate( -100)), 0, 0.00001, 0.000005, 
					   new Vector(new Point3D(new Coordinate(2),new Coordinate( 2),new Coordinate( -3))),new Color(255, 100, 100)));
	
		ImageWriter imageWriter = new ImageWriter("Spot test", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}

	 
	@Test
	public void pointLightTest() throws Exception{//a sphere with point light
		
		Scene scene = new Scene();
		Sphere sphere = new Sphere (800, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -1000)),new Color(0, 0, 100),new Material(1,1,1));
		Material m=new Material(1,1,1);
		m.setN(20);
		sphere.setMaterial(m);
		scene.addGeometry(sphere);
		scene.addLight(new PointLight( new Point3D(new Coordinate(-200),new Coordinate( -200),new Coordinate( -100)), 
					   0, 0.00001, 0.000005,new Color(255,100,100)));
	
		ImageWriter imageWriter = new ImageWriter("Point test", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
		
	}
	
	@Test
	public void spotLightTest3() throws Exception{//2 triangles with spot light
		
		Scene scene = new Scene();
		Triangle triangle = new Triangle(new Point3D(new Coordinate(  3500),new Coordinate(  3500), new Coordinate(-2000)),
				 						 new Point3D(new Coordinate( -3500),new Coordinate( -3500),new Coordinate( -1000)),
				 						 new Point3D(  new Coordinate(3500),new Coordinate( -3500),new Coordinate( -2000)),
				 						 new Color(0,0,0),
				 						 new Material(1,1,1));

		Triangle triangle2 = new Triangle(new Point3D( new Coordinate( 3500),new Coordinate(  3500),new Coordinate( -2000)),
				  						  new Point3D(new Coordinate( -3500),new Coordinate(  3500), new Coordinate(-1000)),
				  						  new Point3D( new Coordinate(-3500), new Coordinate(-3500), new Coordinate(-1000)),
					 						 new Color(0,0,0),
					 						 new Material(1,1,1));
		
		scene.addGeometry(triangle);
		scene.addGeometry(triangle2);
		
		scene.addLight(new SpotLight( new Point3D(new Coordinate(200),new Coordinate( 200),new Coordinate( -100)), 0, 0.000001, 0.0000005, 
					   new Vector(new Point3D(new Coordinate(-2),new Coordinate( -2),new Coordinate( -3))),new Color(255, 100, 100)));
	
		
		ImageWriter imageWriter = new ImageWriter("Spot test 3", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}
	
	@Test
	public void pointLightTest2() throws Exception{//2 triangles with point light
		
		Scene scene = new Scene();
		
		Triangle triangle = new Triangle(new Point3D(  new Coordinate(3500),  new Coordinate(3500), new Coordinate(-2000)),
				 						 new Point3D( new Coordinate(-3500), new Coordinate(-3500), new Coordinate(-1000)),
				 						 new Point3D(  new Coordinate(3500),new Coordinate( -3500), new Coordinate(-2000)),
				 						 new Color(0,0,0),
				 						 new Material(1,1,1));

		Triangle triangle2 = new Triangle(new Point3D( new Coordinate( 3500),  new Coordinate(3500), new Coordinate(-2000)),
				  						  new Point3D( new Coordinate(-3500), new Coordinate( 3500), new Coordinate(-1000)),
				  						  new Point3D( new Coordinate(-3500), new Coordinate(-3500), new Coordinate(-1000)),
					 						 new Color(0,0,0),
					 						 new Material(1,1,1));
		
		scene.addGeometry(triangle);
		scene.addGeometry(triangle2);
		scene.addLight(new PointLight( new Point3D(new Coordinate(200),new Coordinate( 200), new Coordinate(-100)), 
					   0, 0.000001, 0.0000005,new Color(255, 100, 100)));
		
		ImageWriter imageWriter = new ImageWriter("Point test 2", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}
	@Test
	public void spotLightShadow() throws Exception{//sphere, triangle and spot light with shadow
		
		Scene scene = new Scene();
		scene.setDistanceViewPlane(200);
		Material m=new Material(1,1,1);
		m.setN(20);
		Sphere sphere = new Sphere(500, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -1000)),new Color(0, 0, 100),new Material(1,1,1));
		sphere.setMaterial(m);
		scene.addGeometry(sphere);
		
		
		Triangle triangle = new Triangle(new Point3D(new Coordinate(-125), new Coordinate(-225),new Coordinate( -260)),
										 new Point3D(new Coordinate(-225),new Coordinate( -125), new Coordinate(-260)),
										 new Point3D(new Coordinate(-225),new Coordinate( -225),new Coordinate( -270)),
										 new Color (0, 0, 100),new Material(1,1,1));
		Material m1=new Material(1,1,1);
		m1.setN(4);
		triangle.setMaterial(m);
		scene.addGeometry(triangle);
		
		scene.addLight(new SpotLight( new Point3D(new Coordinate(-200),new Coordinate( -150),new Coordinate( -150)),0.1, 0.00001, 0.000005, 
					   new Vector(new Point3D(new Coordinate(2),new Coordinate( 2),new Coordinate( -3))),new Color(255, 100, 100)));
	
		ImageWriter imageWriter = new ImageWriter("Shadow 2", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}
	@Test
	public void spotLightShadow1() throws Exception{//sphere, triangle and spot light with shadow
		
		Scene scene = new Scene();
		scene.setDistanceViewPlane(200);
		Material m=new Material(1,1,1);
		m.setN(20);
		Sphere sphere = new Sphere(500, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -1000)),new Color(0, 0, 100),new Material(1,1,1));
		sphere.setMaterial(m);
		scene.addGeometry(sphere);
		
		
		Triangle triangle = new Triangle(new Point3D(new Coordinate(-125), new Coordinate(-225),new Coordinate( -260)),
										 new Point3D(new Coordinate(-225),new Coordinate( -125), new Coordinate(-260)),
										 new Point3D(new Coordinate(-225),new Coordinate( -225),new Coordinate( -270)),
										 new Color (0, 0, 100),new Material(1,1,1));
		Material m1=new Material(1,1,1);
		m1.setN(4);
		triangle.setMaterial(m);
		scene.addGeometry(triangle);
		
		scene.addLight(new SpotLight( new Point3D(new Coordinate(-180),new Coordinate( -180),new Coordinate( 0)),0.1, 0.00001, 0.000005, 
					   new Vector(new Point3D(new Coordinate(2),new Coordinate( 2),new Coordinate( -3))),new Color(255, 100, 100)));
	
		ImageWriter imageWriter = new ImageWriter("Shadow 3", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}
	@Test
	public void spotLightShadow2() throws Exception{//sphere, triangle and spot light check shadow
		
		Scene scene = new Scene();
		scene.setDistanceViewPlane(200);
		Material m=new Material(1,1,1);
		m.setN(20);
		Sphere sphere = new Sphere(500, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -1000)),new Color(0, 0, 100),new Material(1,1,1));
		sphere.setMaterial(m);
		scene.addGeometry(sphere);
		
		
		Triangle triangle = new Triangle(new Point3D(new Coordinate(-125), new Coordinate(-225),new Coordinate( -260)),
										 new Point3D(new Coordinate(-225),new Coordinate( -125), new Coordinate(-260)),
										 new Point3D(new Coordinate(-225),new Coordinate( -225),new Coordinate( -270)),
										 new Color (0, 0, 100),new Material(1,1,1));
		Material m1=new Material(1,1,1);
		m1.setN(4);
		triangle.setMaterial(m);
		scene.addGeometry(triangle);
		
		scene.addLight(new SpotLight( new Point3D(new Coordinate(-100),new Coordinate( -100),new Coordinate( 0)),0.1, 0.00001, 0.000005, 
					   new Vector(new Point3D(new Coordinate(2),new Coordinate( 2),new Coordinate( -3))),new Color(255, 100, 100)));
	
		ImageWriter imageWriter = new ImageWriter("Shadow 4", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}
	
	@Test
	public void pointLightTest3() throws Exception{//2 triangle, sphere and point light with shadow
		
		Scene scene = new Scene();
		Material m=new Material(1,1,1);
		m.setN(20);
		Sphere sphere = new Sphere(100, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -200)),new Color(0, 0, 100),new Material(1,1,1));
		sphere.setMaterial(m);
		
		
		Triangle triangle = new Triangle(new Point3D(  new Coordinate(3500),  new Coordinate(3500), new Coordinate(-2000)),
				 						 new Point3D( new Coordinate(-3500), new Coordinate(-3500), new Coordinate(-1000)),
				 						 new Point3D(  new Coordinate(-3500),new Coordinate(3500), new Coordinate(-2000)),
				 						 new Color(0,0,0),
				 						 new Material(1,1,1));

		Triangle triangle2 = new Triangle(new Point3D( new Coordinate( 3500),  new Coordinate(3500), new Coordinate(-2000)),
				  						  new Point3D( new Coordinate(3500), new Coordinate( -3500), new Coordinate(-1000)),
				  						  new Point3D( new Coordinate(-3500), new Coordinate(-3500), new Coordinate(-1000)),
					 						 new Color(0,0,0),
					 						 new Material(1,1,1));
		scene.addGeometry(sphere);
		scene.addGeometry(triangle);
		scene.addGeometry(triangle2);
		
		scene.addLight(new PointLight( new Point3D(new Coordinate(50),new Coordinate(50), new Coordinate(0)), 
					   0, 0.000001, 0.0000005,new Color(255, 100, 100)));
		
		ImageWriter imageWriter = new ImageWriter("PointShadowTest", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}
@Test
	public void spotLightTest4() throws Exception{//2 triangle, sphere and spot light with shadow
		
		Scene scene = new Scene();
		scene.setDistanceViewPlane(100);
		Material m=new Material(1,1,1);
		m.setN(20);
		Sphere sphere = new Sphere(100, new Point3D(new Coordinate(0.0),new Coordinate( 0.0),new Coordinate( -200)),new Color(0, 0, 100),new Material(1,1,1));
		sphere.setMaterial(m);
		scene.addGeometry(sphere);
		Triangle triangle = new Triangle(new Point3D(new Coordinate(  3500),new Coordinate(  3500), new Coordinate(-2000)),
				 						 new Point3D(new Coordinate( -3500),new Coordinate( -3500),new Coordinate( -1000)),
				 						 new Point3D(  new Coordinate(-3500),new Coordinate( 3500),new Coordinate( -2000)),
				 						 new Color(0,0,0),
				 						 new Material(1,1,1));

		Triangle triangle2 = new Triangle(new Point3D( new Coordinate( 3500),new Coordinate(  3500),new Coordinate( -2000)),
				  						  new Point3D(new Coordinate( 3500),new Coordinate(  -3500), new Coordinate(-1000)),
				  						  new Point3D( new Coordinate(-3500), new Coordinate(-3500), new Coordinate(-1000)),
					 						 new Color(0,0,0),
					 						 new Material(1,1,1));
		
		scene.addGeometry(triangle);
		scene.addGeometry(triangle2);
		
		scene.addLight(new SpotLight( new Point3D(new Coordinate(50),new Coordinate(50),new Coordinate(0)), 0, 0.000001, 0.0000005, 
					   new Vector(new Point3D(new Coordinate(-2),new Coordinate( -2),new Coordinate( -3))),new Color(255, 100, 100)));
	
		
		ImageWriter imageWriter = new ImageWriter("SpotShadowTest", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}


}
