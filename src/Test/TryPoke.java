package Test;

import java.awt.Color;

import org.junit.Test;

import Elements.PointLight;
import Scene.Scene;
import Geometries.Sphere;
import Geometries.Triangle;
import Primitives.Coordinate;
import Primitives.Material;
import Primitives.Point3D;
import Renderer.ImageWriter;
import Renderer.Render;

public class TryPoke {

	@Test
	public void test() throws Exception 
	{
		
	Point3D p21=new Point3D(new Coordinate(0),new Coordinate(0),new Coordinate(-200));
	Point3D p22=new Point3D(new Coordinate(0),new Coordinate(0),new Coordinate(-36));
	Point3D p23=new Point3D(new Coordinate(0),new Coordinate(0),new Coordinate(-18));
	//	//	Sphere Cloud1 = new Sphere(500, new Point3D(new Coordinate(0),new Coordinate(0), new Coordinate(-1000)), Color.red,new Material(1,1,20,0,0));

	Sphere s21=new Sphere(100,p21,Color.red,new Material(1,1,30,0,0)); 
	Sphere s22=new Sphere(5,p22,Color.BLACK,new Material(1,1,40,0,0)); 
	Sphere s23= new Sphere((float)1.5,p23,Color.white, new Material(1,1,10,0,0));
	Scene sc2=new Scene();
	
	sc2.setBackground(Color.GRAY);
	sc2.setDistanceViewPlane(150);
	sc2.addGeometry(s21);
	sc2.addGeometry(s22);
	sc2.addGeometry(s23);
	
	Point3D p25=new Point3D(new Coordinate(-62),new Coordinate(-8),new Coordinate(-101));
	Point3D p24=new Point3D(new Coordinate(60),new Coordinate(-8),new Coordinate(-101));
	Point3D p26=new Point3D(new Coordinate(60),new Coordinate(7),new Coordinate(-101));
	Triangle t21=new Triangle(p26,p25, p24, Color.black, new Material(1,1,10,0,0));
	sc2.addGeometry(t21);
	
	Point3D p27=new Point3D(new Coordinate(-60),new Coordinate(-8),new Coordinate(-101));
	Point3D p28=new Point3D(new Coordinate(-60),new Coordinate(7),new Coordinate(-101));
	Point3D p29=new Point3D(new Coordinate(62),new Coordinate(7),new Coordinate(-101));
	Triangle t22=new Triangle(p29,p27, p28, Color.black, new Material(1,1,10,0,0));
	sc2.addGeometry(t22);

	sc2.addLight(new PointLight( new Point3D(new Coordinate(900),new Coordinate(900),new Coordinate(-700)), 0, 0.00000001, 0.0000005, 
			   new Color(255, 255 ,255)));
	
	sc2.addLight(new PointLight( new Point3D(new Coordinate(0),new Coordinate(-900),new Coordinate(-10)), 0, 0.0000001, 0.00000005, 
			new Color(255, 255, 255)));
	sc2.addLight(new PointLight( new Point3D(new Coordinate(900),new Coordinate(-900),new Coordinate(-10)), 0, 0.00000001, 0.0000005, 
			new Color(255, 255, 255)));
	sc2.addLight(new PointLight( new Point3D(new Coordinate(-900),new Coordinate(-900),new Coordinate(-10)), 0, 0.00000001, 0.0000005, 
			new Color(255, 255, 255)));
	ImageWriter iw2=new ImageWriter("Poke",500,500,500,500);
	Render r2=new Render(sc2, iw2);
	//r2.PrintGrid(50);
	r2.renderImage();
	iw2.writeToimage();
	}

}

