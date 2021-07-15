 package Test;

import java.awt.Color;

import org.junit.Test;

import Geometries.*;
import Primitives.*;
import Renderer.ImageWriter;
import Renderer.Render;
import Scene.Scene;


public class RenderTest {
	@Test
	public void test1() throws Exception{//4 triangles and sphere
		//try{
		Scene scene = new Scene();
		scene.setDistanceViewPlane(150);
		Sphere s=new Sphere(50, new Point3D(new Coordinate(0.0), new Coordinate(0.0),new Coordinate( -150)));
		s.setEmission(Color.WHITE);
		scene.addGeometry(s);
		Triangle triangle = new Triangle(new Point3D( new Coordinate(100),new Coordinate(0),new Coordinate(-149)),
				 						 new Point3D( new Coordinate(0),new Coordinate (100),new Coordinate(-149)),
				 						 new Point3D(new Coordinate (100),new Coordinate (100),new Coordinate( -149)));
		
		Triangle triangle2 = new Triangle(new Point3D( new Coordinate(100),new Coordinate( 0),new Coordinate( -149)),
				 			 			  new Point3D( new Coordinate(0),new Coordinate(-100),new Coordinate (-149)),
				 			 			  new Point3D( new Coordinate(100),new Coordinate(-100),new Coordinate( -149)));
		
		Triangle triangle3 = new Triangle(new Point3D(new Coordinate(-100),new Coordinate( 0),new Coordinate(-149)),
				 						  new Point3D(new Coordinate( 0),new Coordinate( 100),new Coordinate( -149)),
				 						  new Point3D(new Coordinate(-100),new Coordinate( 100),new Coordinate( -149)));
		
		Triangle triangle4 = new Triangle(new Point3D(new Coordinate(-100),new Coordinate( 0),new Coordinate( -149)),
				 			 			  new Point3D( new Coordinate( 0),new Coordinate(-100),new Coordinate( -149)),
				 			 			  new Point3D(new Coordinate(-100),new Coordinate( -100),new Coordinate( -149)));
		
		triangle.setEmission(Color.WHITE);
		triangle2.setEmission(Color.WHITE);
		triangle3.setEmission(Color.WHITE);
		triangle4.setEmission(Color.WHITE);
		scene.addGeometry(triangle);
		scene.addGeometry(triangle2);
		scene.addGeometry(triangle3);
		scene.addGeometry(triangle4);

	
		ImageWriter imageWriter = new ImageWriter("test21", 500, 500, 500, 500);
		Render render = new Render(scene,imageWriter);
		
		render.renderImage();
		render.printGrid(50);
		render.getImageWriter().writeToimage();		
	}
	@Test
	public void test2() throws Exception 
	{
		Scene sc2 = new Scene();
		sc2.setDistanceViewPlane(150);

		Sphere s=new Sphere(50, new Point3D(new Coordinate(0.0), new Coordinate(0.0),new Coordinate( -150)));
		s.setEmission(Color.magenta);
		sc2.addGeometry(s);
		Triangle triangle = new Triangle(new Point3D( new Coordinate(100),new Coordinate(0),new Coordinate(-149)),
				 						 new Point3D( new Coordinate(0),new Coordinate (100),new Coordinate(-149)),
				 						 new Point3D(new Coordinate (100),new Coordinate (100),new Coordinate( -149)));
		
		Triangle triangle2 = new Triangle(new Point3D( new Coordinate(100),new Coordinate( 0),new Coordinate( -149)),
				 			 			  new Point3D( new Coordinate(0),new Coordinate(-100),new Coordinate (-149)),
				 			 			  new Point3D( new Coordinate(100),new Coordinate(-100),new Coordinate( -149)));
		
		Triangle triangle3 = new Triangle(new Point3D(new Coordinate(-100),new Coordinate( 0),new Coordinate(-149)),
				 						  new Point3D(new Coordinate( 0),new Coordinate( 100),new Coordinate( -149)),
				 						  new Point3D(new Coordinate(-100),new Coordinate( 100),new Coordinate( -149)));
		
		Triangle triangle4 = new Triangle(new Point3D(new Coordinate(-100),new Coordinate( 0),new Coordinate( -149)),
				 			 			  new Point3D( new Coordinate( 0),new Coordinate(-100),new Coordinate( -149)),
				 			 			  new Point3D(new Coordinate(-100),new Coordinate( -100),new Coordinate( -149)));
		
		triangle.setEmission(Color.blue);
		triangle2.setEmission(Color.red);
		triangle3.setEmission(Color.yellow);
		triangle4.setEmission(Color.green);
		sc2.addGeometry(triangle);
		sc2.addGeometry(triangle2);
		sc2.addGeometry(triangle3);
		sc2.addGeometry(triangle4);

	
		ImageWriter imageWriter = new ImageWriter("test22", 500, 500, 500, 500);
		Render render = new Render(sc2,imageWriter);
		render.renderImage();
		render.printGrid(50);
		render.getImageWriter().writeToimage();	
	}
	
	@Test
	public void test3() throws Exception 
	{
		
		Point3D p21=new Point3D(new Coordinate(0),new Coordinate(0),new Coordinate(-200));
		Point3D p22=new Point3D(new Coordinate(0),new Coordinate(0),new Coordinate(-36));
		Point3D p23=new Point3D(new Coordinate(0),new Coordinate(0),new Coordinate(-18));
		Sphere s21=new Sphere(100,p21);
		s21.setEmission(Color.red);
		Sphere s22=new Sphere(5,p22); 
		s22.setEmission(Color.black);
		Sphere s23= new Sphere( (float) 1.5,p23);
		s23.setEmission(Color.white);
		Scene sc2=new Scene();
		sc2.setDistanceViewPlane(200);
		sc2.setBackground(Color.black);
		sc2.addGeometry(s21);
		sc2.addGeometry(s22);
		sc2.addGeometry(s23);
		
		Point3D p25=new Point3D(new Coordinate(-62),new Coordinate(-8),new Coordinate(-101));
		Point3D p24=new Point3D(new Coordinate(60),new Coordinate(-8),new Coordinate(-101));
		Point3D p26=new Point3D(new Coordinate(60),new Coordinate(7),new Coordinate(-101));
		Triangle t21=new Triangle(p26,p25, p24);
		t21.setEmission(Color.black);
		sc2.addGeometry(t21);
		
		Point3D p27=new Point3D(new Coordinate(-60),new Coordinate(-8),new Coordinate(-101));
		Point3D p28=new Point3D(new Coordinate(-60),new Coordinate(7),new Coordinate(-101));
		Point3D p29=new Point3D(new Coordinate(62),new Coordinate(7),new Coordinate(-101));
		Triangle t22=new Triangle(p29,p27, p28);
		t22.setEmission(Color.black);
		sc2.addGeometry(t22);
		
		ImageWriter iw2=new ImageWriter("test23",500,500,500,500);
		Render r2=new Render(sc2, iw2);
		r2.printGrid(50);
		r2.renderImage();
		r2.getImageWriter().writeToimage();
	
		}		
		
}

