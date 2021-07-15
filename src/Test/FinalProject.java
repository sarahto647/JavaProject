package Test;

import java.awt.Color;
import org.junit.Test;

import Elements.DirectionalLight;
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

public class FinalProject {

	@Test
	public void Final() throws Exception {
		Scene scene = new Scene();
		scene.setDistanceViewPlane(100);
		scene.setBackground(new Color(130,180,255));
		//Panda
		Triangle t1 = new Triangle(new Point3D(new Coordinate(-4), new Coordinate(33),new Coordinate( -80)),
				 new Point3D(new Coordinate(-17),new Coordinate( -20), new Coordinate(-80)),
				 new Point3D(new Coordinate(17),new Coordinate(-20),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		Triangle t2 = new Triangle(new Point3D(new Coordinate(-4), new Coordinate(33),new Coordinate( -80)),
				 new Point3D(new Coordinate(-17),new Coordinate( -20), new Coordinate(-80)),
				 new Point3D(new Coordinate(-46),new Coordinate(0),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t3 = new Triangle(new Point3D(new Coordinate(-4), new Coordinate(33),new Coordinate( -80)),
				 new Point3D(new Coordinate(-40),new Coordinate( 30), new Coordinate(-80)),
				 new Point3D(new Coordinate(-46),new Coordinate(0),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t4 = new Triangle(new Point3D(new Coordinate(-36), new Coordinate(-18),new Coordinate( -80)),
				 new Point3D(new Coordinate(-17),new Coordinate( -20), new Coordinate(-80)),
				 new Point3D(new Coordinate(-46),new Coordinate(0),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t5 = new Triangle(new Point3D(new Coordinate(-56), new Coordinate(3),new Coordinate( -80)),
				 new Point3D(new Coordinate(-40),new Coordinate( 30), new Coordinate(-80)),
				 new Point3D(new Coordinate(-46),new Coordinate(0),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t6 = new Triangle(new Point3D(new Coordinate(-56), new Coordinate(3),new Coordinate( -80)),
				 new Point3D(new Coordinate(-40),new Coordinate( 30), new Coordinate(-80)),
				 new Point3D(new Coordinate(-57),new Coordinate(15),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t7 = new Triangle(new Point3D(new Coordinate(-56), new Coordinate(3),new Coordinate( -80)),
				 new Point3D(new Coordinate(-65),new Coordinate(7), new Coordinate(-80)),
				 new Point3D(new Coordinate(-57),new Coordinate(15),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t8 = new Triangle(new Point3D(new Coordinate(-56), new Coordinate(3),new Coordinate( -80)),
				 new Point3D(new Coordinate(-65),new Coordinate(7), new Coordinate(-80)),
				 new Point3D(new Coordinate(-70),new Coordinate(-7),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t9 = new Triangle(new Point3D(new Coordinate(-4), new Coordinate(33),new Coordinate( -80)),
				 new Point3D(new Coordinate(23),new Coordinate(14), new Coordinate(-80)),
				 new Point3D(new Coordinate(12),new Coordinate(-9),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t10 = new Triangle(new Point3D(new Coordinate(17), new Coordinate(6),new Coordinate( -80)),
				 new Point3D(new Coordinate(24),new Coordinate(4), new Coordinate(-80)),
				 new Point3D(new Coordinate(12),new Coordinate(-9),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t11 = new Triangle(new Point3D(new Coordinate(24), new Coordinate(4),new Coordinate( -80)),
				 new Point3D(new Coordinate(18),new Coordinate(-29), new Coordinate(-80)),
				 new Point3D(new Coordinate(12),new Coordinate(-9),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t12 = new Triangle(new Point3D(new Coordinate(24), new Coordinate(4),new Coordinate( -80)),
				 new Point3D(new Coordinate(18),new Coordinate(-29), new Coordinate(-80)),
				 new Point3D(new Coordinate(34),new Coordinate(5),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t13 = new Triangle(new Point3D(new Coordinate(29), new Coordinate(-35),new Coordinate( -80)),
				 new Point3D(new Coordinate(18),new Coordinate(-29), new Coordinate(-80)),
				 new Point3D(new Coordinate(34),new Coordinate(5),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t14 = new Triangle(new Point3D(new Coordinate(29), new Coordinate(-35),new Coordinate( -80)),
				 new Point3D(new Coordinate(54),new Coordinate(8), new Coordinate(-80)),
				 new Point3D(new Coordinate(34),new Coordinate(5),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t15 = new Triangle(new Point3D(new Coordinate(39), new Coordinate(14),new Coordinate( -80)),
				 new Point3D(new Coordinate(54),new Coordinate(8), new Coordinate(-80)),
				 new Point3D(new Coordinate(34),new Coordinate(5),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t16 = new Triangle(new Point3D(new Coordinate(29), new Coordinate(-35),new Coordinate( -80)),
				 new Point3D(new Coordinate(54),new Coordinate(8), new Coordinate(-80)),
				 new Point3D(new Coordinate(64),new Coordinate(0),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t17 = new Triangle(new Point3D(new Coordinate(29), new Coordinate(-35),new Coordinate( -80)),
				 new Point3D(new Coordinate(37.5),new Coordinate(-52.5), new Coordinate(-80)),
				 new Point3D(new Coordinate(43),new Coordinate(-20),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t18 = new Triangle(new Point3D(new Coordinate(40), new Coordinate(-31),new Coordinate( -80)),
				 new Point3D(new Coordinate(37.5),new Coordinate(-52.5), new Coordinate(-80)),
				 new Point3D(new Coordinate(46),new Coordinate(-42),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t19 = new Triangle(new Point3D(new Coordinate(55.5), new Coordinate(-54.5),new Coordinate( -80)),
				 new Point3D(new Coordinate(37.5),new Coordinate(-52.5), new Coordinate(-80)),
				 new Point3D(new Coordinate(46),new Coordinate(-42),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t20 = new Triangle(new Point3D(new Coordinate(55.5), new Coordinate(-54.5),new Coordinate( -80)),
				 new Point3D(new Coordinate(65),new Coordinate(-40), new Coordinate(-80)),
				 new Point3D(new Coordinate(46),new Coordinate(-42),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t21 = new Triangle(new Point3D(new Coordinate(55.5), new Coordinate(-54.5),new Coordinate( -80)),
				 new Point3D(new Coordinate(65),new Coordinate(-40), new Coordinate(-80)),
				 new Point3D(new Coordinate(75),new Coordinate(-47),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t22 = new Triangle(new Point3D(new Coordinate(70), new Coordinate(-27),new Coordinate( -80)),
				 new Point3D(new Coordinate(65),new Coordinate(-40), new Coordinate(-80)),
				 new Point3D(new Coordinate(75),new Coordinate(-47),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t23 = new Triangle(new Point3D(new Coordinate(70), new Coordinate(-27),new Coordinate( -80)),
				 new Point3D(new Coordinate(80),new Coordinate(-41), new Coordinate(-80)),
				 new Point3D(new Coordinate(75),new Coordinate(-47),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t24 = new Triangle(new Point3D(new Coordinate(78), new Coordinate(-26),new Coordinate( -80)),
				 new Point3D(new Coordinate(80),new Coordinate(-41), new Coordinate(-80)),
				 new Point3D(new Coordinate(86),new Coordinate(-33),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t25 = new Triangle(new Point3D(new Coordinate(61), new Coordinate(-15),new Coordinate( -80)),
				 new Point3D(new Coordinate(80),new Coordinate(-41), new Coordinate(-80)),
				 new Point3D(new Coordinate(79),new Coordinate(-19),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
	
		Triangle t26 = new Triangle(new Point3D(new Coordinate(61), new Coordinate(-15),new Coordinate( -80)),
				 new Point3D(new Coordinate(70),new Coordinate(-4), new Coordinate(-80)),
				 new Point3D(new Coordinate(79),new Coordinate(-19),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
	
		Triangle t27 = new Triangle(new Point3D(new Coordinate(61), new Coordinate(-15),new Coordinate( -80)),
				 new Point3D(new Coordinate(70),new Coordinate(-4), new Coordinate(-80)),
				 new Point3D(new Coordinate(64),new Coordinate(0),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t28 = new Triangle(new Point3D(new Coordinate(61), new Coordinate(-15),new Coordinate( -80)),
				 new Point3D(new Coordinate(64),new Coordinate(0), new Coordinate(-80)),
				 new Point3D(new Coordinate(45),new Coordinate(-18),new Coordinate( -80)),
				 new Color (255, 255, 255),new Material(1,1,1));
		
		Triangle t29 = new Triangle(new Point3D(new Coordinate(61), new Coordinate(-15),new Coordinate( -80)),
				 new Point3D(new Coordinate(45),new Coordinate(-18), new Coordinate(-80)),
				 new Point3D(new Coordinate(70),new Coordinate(-27),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
	
		Triangle t30 = new Triangle(new Point3D(new Coordinate(70), new Coordinate(-27),new Coordinate( -80)),
				 new Point3D(new Coordinate(65),new Coordinate(-40), new Coordinate(-80)),
				 new Point3D(new Coordinate(45),new Coordinate(-18),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
	
		Triangle t31 = new Triangle(new Point3D(new Coordinate(46), new Coordinate(-42),new Coordinate( -80)),
				 new Point3D(new Coordinate(65),new Coordinate(-40), new Coordinate(-80)),
				 new Point3D(new Coordinate(45),new Coordinate(-18),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
	
		Triangle t32 = new Triangle(new Point3D(new Coordinate(40), new Coordinate(-31),new Coordinate( -80)),
				 new Point3D(new Coordinate(46),new Coordinate(-42), new Coordinate(-80)),
				 new Point3D(new Coordinate(45),new Coordinate(-18),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
	
		Triangle t33 = new Triangle(new Point3D(new Coordinate(29), new Coordinate(-35),new Coordinate( -80)),
				 new Point3D(new Coordinate(19),new Coordinate(-60), new Coordinate(-80)),
				 new Point3D(new Coordinate(39),new Coordinate(-60),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
	
		Triangle t34 = new Triangle(new Point3D(new Coordinate(29), new Coordinate(-35),new Coordinate( -80)),
				 new Point3D(new Coordinate(18),new Coordinate(-29), new Coordinate(-80)),
				 new Point3D(new Coordinate(19),new Coordinate(-60),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
	
		Triangle t35 = new Triangle(new Point3D(new Coordinate(18), new Coordinate(-29),new Coordinate( -80)),
				 new Point3D(new Coordinate(19),new Coordinate(-60), new Coordinate(-80)),
				 new Point3D(new Coordinate(-7),new Coordinate(-50),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
	
		Triangle t361 = new Triangle(new Point3D(new Coordinate(-7), new Coordinate(-50),new Coordinate( -80)),
				 new Point3D(new Coordinate(18),new Coordinate(-29), new Coordinate(-80)),
				 new Point3D(new Coordinate(-15),new Coordinate(-38),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		Triangle t362 = new Triangle(new Point3D(new Coordinate(17), new Coordinate(-19.5),new Coordinate( -80)),
				 new Point3D(new Coordinate(18),new Coordinate(-29), new Coordinate(-80)),
				 new Point3D(new Coordinate(-15),new Coordinate(-38),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		Triangle t37 = new Triangle(new Point3D(new Coordinate(-15), new Coordinate(-38),new Coordinate( -80)),
				 new Point3D(new Coordinate(-17),new Coordinate( -19.5), new Coordinate(-80)),
				 new Point3D(new Coordinate(17),new Coordinate(-19.5),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		
		Triangle t38 = new Triangle(new Point3D(new Coordinate(24), new Coordinate(4),new Coordinate( -80)),
				 new Point3D(new Coordinate(34),new Coordinate(5), new Coordinate(-80)),
				 new Point3D(new Coordinate(17),new Coordinate(6),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		Triangle t39 = new Triangle(new Point3D(new Coordinate(23), new Coordinate(14),new Coordinate( -80)),
				 new Point3D(new Coordinate(34),new Coordinate(5), new Coordinate(-80)),
				 new Point3D(new Coordinate(17),new Coordinate(6),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		Triangle t40 = new Triangle(new Point3D(new Coordinate(23), new Coordinate(14),new Coordinate( -80)),
				 new Point3D(new Coordinate(34),new Coordinate(5), new Coordinate(-80)),
				 new Point3D(new Coordinate(39),new Coordinate(14),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		Triangle t41 = new Triangle(new Point3D(new Coordinate(23), new Coordinate(14),new Coordinate( -80)),
				 new Point3D(new Coordinate(39),new Coordinate(14), new Coordinate(-80)),
				 new Point3D(new Coordinate(31),new Coordinate(20),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		Triangle t42 = new Triangle(new Point3D(new Coordinate(54), new Coordinate(8),new Coordinate( -80)),
				 new Point3D(new Coordinate(54),new Coordinate(17), new Coordinate(-80)),
				 new Point3D(new Coordinate(36),new Coordinate(17),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		Triangle t43 = new Triangle(new Point3D(new Coordinate(36), new Coordinate(17),new Coordinate( -80)),
				 new Point3D(new Coordinate(54),new Coordinate(17), new Coordinate(-80)),
				 new Point3D(new Coordinate(40),new Coordinate(23),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		Triangle t44 = new Triangle(new Point3D(new Coordinate(54), new Coordinate(17),new Coordinate( -80)),
				 new Point3D(new Coordinate(40),new Coordinate(23), new Coordinate(-80)),
				 new Point3D(new Coordinate(54),new Coordinate(20),new Coordinate( -80)),
				 new Color (0, 0, 0),new Material(1,1,1));
		
		Triangle tl46 = new Triangle(new Point3D(new Coordinate(-56), new Coordinate(3),new Coordinate( -80)),
				 new Point3D(new Coordinate(-71),new Coordinate(-25), new Coordinate(-80)),
				 new Point3D(new Coordinate(-70),new Coordinate(-7),new Coordinate( -80)),
				 new Color (0,0,0),new Material(1,1,1));
		
		Triangle tl47 = new Triangle(new Point3D(new Coordinate(-56), new Coordinate(3),new Coordinate( -80)),
				 new Point3D(new Coordinate(-71),new Coordinate(-25), new Coordinate(-80)),
				 new Point3D(new Coordinate(-46),new Coordinate(0),new Coordinate( -80)),
				 new Color (0,0,0),new Material(1,1,1));
		
		Triangle tl48 = new Triangle(new Point3D(new Coordinate(-36), new Coordinate(-18),new Coordinate( -80)),
				 new Point3D(new Coordinate(-71),new Coordinate( -25), new Coordinate(-80)),
				 new Point3D(new Coordinate(-46),new Coordinate(0.5),new Coordinate( -80)),
				 new Color (0,0,0),new Material(1,1,1));
		
		Triangle tl49 = new Triangle(new Point3D(new Coordinate(-45), new Coordinate(-18),new Coordinate( -80)),
				 new Point3D(new Coordinate(-71),new Coordinate( -25), new Coordinate(-80)),
				 new Point3D(new Coordinate(-63),new Coordinate(-49),new Coordinate( -80)),
				 new Color (0,0,0),new Material(1,1,1));
		
		Triangle tl50 = new Triangle(new Point3D(new Coordinate(-45), new Coordinate(-54),new Coordinate( -80)),
				 new Point3D(new Coordinate(-55),new Coordinate( -25), new Coordinate(-80)),
				 new Point3D(new Coordinate(-63),new Coordinate(-49),new Coordinate( -80)),
				 new Color (0,0,0),new Material(1,1,1));
		
		Triangle tl51 = new Triangle(new Point3D(new Coordinate(-45), new Coordinate(-54),new Coordinate( -80)),
				 new Point3D(new Coordinate(-55),new Coordinate( -25), new Coordinate(-80)),
				 new Point3D(new Coordinate(-45),new Coordinate(-20),new Coordinate( -80)),
				 new Color (255,255,255),new Material(1,1,1));
		
		Triangle tl52 = new Triangle(new Point3D(new Coordinate(-36), new Coordinate(-18),new Coordinate( -80)),
				 new Point3D(new Coordinate(-45),new Coordinate( -40), new Coordinate(-80)),
				 new Point3D(new Coordinate(-45),new Coordinate(-20),new Coordinate( -80)),
				 new Color (255,255,255),new Material(1,1,1));
		
		Triangle tl53 = new Triangle(new Point3D(new Coordinate(-36), new Coordinate(-18),new Coordinate( -80)),
				 new Point3D(new Coordinate(-45),new Coordinate( -40), new Coordinate(-80)),
				 new Point3D(new Coordinate(-24),new Coordinate(-19),new Coordinate( -80)),
				 new Color (255,255,255),new Material(1,1,1));
		
		Triangle tl54 = new Triangle(new Point3D(new Coordinate(-36), new Coordinate(-29),new Coordinate( -80)),
				 new Point3D(new Coordinate(-19),new Coordinate( -24), new Coordinate(-80)),
				 new Point3D(new Coordinate(-24),new Coordinate(-19),new Coordinate( -80)),
				 new Color (255,255,255),new Material(1,1,1));
		
		Triangle tl55 = new Triangle(new Point3D(new Coordinate(-25), new Coordinate(-25),new Coordinate( -80)),
				 new Point3D(new Coordinate(-19),new Coordinate( -24), new Coordinate(-80)),
				 new Point3D(new Coordinate(-18),new Coordinate(-33),new Coordinate( -80)),
				 new Color (255,255,255),new Material(1,1,1));
		
		Triangle tl56 = new Triangle(new Point3D(new Coordinate(-45), new Coordinate(-40),new Coordinate( -80)),
				 new Point3D(new Coordinate(-45),new Coordinate( -54), new Coordinate(-80)),
				 new Point3D(new Coordinate(-36),new Coordinate(-29),new Coordinate( -80)),
			 new Color (0,0,0),new Material(1,1,1));
		
		Triangle tl57 = new Triangle(new Point3D(new Coordinate(-36), new Coordinate(-29),new Coordinate( -80)),
				 new Point3D(new Coordinate(-25),new Coordinate( -25), new Coordinate(-80)),
				 new Point3D(new Coordinate(-45),new Coordinate(-54),new Coordinate( -80)),
			 new Color (0,0,0),new Material(1,1,1));
		
		Triangle tl58 = new Triangle(new Point3D(new Coordinate(-25), new Coordinate(-25),new Coordinate( -80)),
				 new Point3D(new Coordinate(-18),new Coordinate( -33), new Coordinate(-80)),
				 new Point3D(new Coordinate(-45),new Coordinate(-54),new Coordinate( -80)),
			 new Color (0,0,0),new Material(1,1,1));
		
		Triangle tl59 = new Triangle(new Point3D(new Coordinate(-23), new Coordinate(-45),new Coordinate( -80)),
				 new Point3D(new Coordinate(-18),new Coordinate( -33), new Coordinate(-80)),
				 new Point3D(new Coordinate(-45),new Coordinate(-54),new Coordinate( -80)),
			 new Color (0,0,0),new Material(1,1,1));
		
		Triangle tl60 = new Triangle(new Point3D(new Coordinate(-17), new Coordinate(-20),new Coordinate( -81)),
				 new Point3D(new Coordinate(-15),new Coordinate( -38), new Coordinate(-80)),
				 new Point3D(new Coordinate(-29),new Coordinate(-19),new Coordinate( -80)),
			 new Color (255,255,255),new Material(1,1,1));
		
		Triangle tl61 = new Triangle(new Point3D(new Coordinate(-45), new Coordinate(-50),new Coordinate( -81)),
				 new Point3D(new Coordinate(-16),new Coordinate( -35), new Coordinate(-80)),
				 new Point3D(new Coordinate(-7),new Coordinate(-50),new Coordinate( -80)),
			 new Color (255,255,255),new Material(1,1,1));
		
		scene.addGeometry(t1);
		scene.addGeometry(t2);
		scene.addGeometry(t3);
		scene.addGeometry(t4);
		scene.addGeometry(t5);
		scene.addGeometry(t6);
		scene.addGeometry(t7);
		scene.addGeometry(t8);
		scene.addGeometry(t9);
		scene.addGeometry(t10);
		scene.addGeometry(t11);
		scene.addGeometry(t12);
		scene.addGeometry(t13);
		scene.addGeometry(t14);
		scene.addGeometry(t15);
		scene.addGeometry(t16);
		scene.addGeometry(t17);
		scene.addGeometry(t18);
		scene.addGeometry(t19);
		scene.addGeometry(t20);
		scene.addGeometry(t21);
		scene.addGeometry(t22);
		scene.addGeometry(t23);
		scene.addGeometry(t24);
		scene.addGeometry(t25);
		scene.addGeometry(t26);
		scene.addGeometry(t27);
		scene.addGeometry(t28);
		scene.addGeometry(t29);
		scene.addGeometry(t30);
		scene.addGeometry(t31);
		scene.addGeometry(t32);
		scene.addGeometry(t33);
		scene.addGeometry(t34);
		scene.addGeometry(t35);
		scene.addGeometry(t361);
		scene.addGeometry(t362);
		scene.addGeometry(t37);
		scene.addGeometry(t38);
		scene.addGeometry(t39);
		scene.addGeometry(t40);
		scene.addGeometry(t41);
		scene.addGeometry(t42);
		scene.addGeometry(t43);
		scene.addGeometry(t44);
		scene.addGeometry(tl46);
		scene.addGeometry(tl47);
		scene.addGeometry(tl48);
		scene.addGeometry(tl49);
		scene.addGeometry(tl50);
		scene.addGeometry(tl51);
		scene.addGeometry(tl52);
		scene.addGeometry(tl53);
		scene.addGeometry(tl54);
		scene.addGeometry(tl55);
		scene.addGeometry(tl56);
		scene.addGeometry(tl57);
		scene.addGeometry(tl58);
		scene.addGeometry(tl59);
		scene.addGeometry(tl60);
		scene.addGeometry(tl61);

		
		//Shadow Panda
		Sphere shadowPanda = new Sphere(20, new Point3D(new Coordinate(-40), new Coordinate(0), new Coordinate(-101)), 
				new Color(0,0,0), new Material(1,1,1));
		scene.addGeometry(shadowPanda);

		//Tail
		Triangle queue_side_r = new Triangle(new Point3D(new Coordinate(-62.5), new Coordinate(20),new Coordinate( -80)),
				 new Point3D(new Coordinate(-65),new Coordinate(7), new Coordinate(-80)),
				 new Point3D(new Coordinate(-57),new Coordinate(15),new Coordinate( -80)),
				 new Color (0,0,0),new Material(1,1,1));
		Triangle queue_side_l = new Triangle(new Point3D(new Coordinate(-62.5), new Coordinate(20),new Coordinate( -80)),
				 new Point3D(new Coordinate(-65),new Coordinate(7), new Coordinate(-80)),
				 new Point3D(new Coordinate(-66.5),new Coordinate(20),new Coordinate( -80)),
				 new Color (0,0,0),new Material(1,1,1));
		Sphere queue_side_up = new Sphere(5.4, new Point3D(new Coordinate(-65), new Coordinate(14), new Coordinate(-80)), 
									new Color(0,0,0), new Material(1,1,1));
		scene.addGeometry(queue_side_r);
		scene.addGeometry(queue_side_up);
		scene.addGeometry(queue_side_l);
		
		//Nose
		Sphere nose = new Sphere(2.5, new Point3D(new Coordinate(83),new Coordinate(-32), new Coordinate(-80)), Color.black,new Material(1,1,1));
		scene.addGeometry(nose);
		
		//Grass
		Triangle grass = new Triangle(new Point3D(new Coordinate(-800), new Coordinate(-50),new Coordinate( -90)),
				 new Point3D(new Coordinate(800),new Coordinate(-50), new Coordinate(-90)),
				 new Point3D(new Coordinate(0),new Coordinate(-900),new Coordinate(800)),
				 new Color (0, 200, 0),new Material(1,1,1));
		scene.addGeometry(grass);
		
		Triangle grass2 = new Triangle(new Point3D(new Coordinate(-20), new Coordinate(0),new Coordinate( -90)),
				 new Point3D(new Coordinate(-15),new Coordinate(0), new Coordinate(-90)),
				 new Point3D(new Coordinate(-25),new Coordinate(0),new Coordinate(-90)),
				 new Color (0, 250, 0),new Material(1,1,1));
		Triangle grass3 = new Triangle(new Point3D(new Coordinate(-15), new Coordinate(-85),new Coordinate( -90)),
				 new Point3D(new Coordinate(-10),new Coordinate(-90), new Coordinate(-90)),
				 new Point3D(new Coordinate(-17),new Coordinate(-90),new Coordinate(-90)),
				 new Color (0, 250, 0),new Material(1,1,1));
		Triangle grass4 = new Triangle(new Point3D(new Coordinate(-29), new Coordinate(-84),new Coordinate( -90)),
				 new Point3D(new Coordinate(-33),new Coordinate(-89), new Coordinate(-90)),
				 new Point3D(new Coordinate(-26),new Coordinate(-89),new Coordinate(-90)),
				 new Color (0, 250, 0),new Material(1,1,1));
		Triangle grass5 = new Triangle(new Point3D(new Coordinate(-26), new Coordinate(-95),new Coordinate( -90)),
				 new Point3D(new Coordinate(-30),new Coordinate(-100), new Coordinate(-90)),
				 new Point3D(new Coordinate(-24),new Coordinate(-100),new Coordinate(-90)),
				 new Color (0, 250, 0),new Material(1,1,1));
		scene.addGeometry(grass2);
	scene.addGeometry(grass3);
			scene.addGeometry(grass4);
		scene.addGeometry(grass5);
		
		
		
		
		//Lake
		Triangle lake = new Triangle(new Point3D(new Coordinate(80), new Coordinate(-50),new Coordinate( -90)),
				 new Point3D(new Coordinate(800),new Coordinate(-50), new Coordinate(-90)),
				 new Point3D(new Coordinate(-800),new Coordinate(-100),new Coordinate(500)),
				 new Color (0,0,204),new Material(1,1,40,1,0.3));
		
			scene.addGeometry(lake);

		//eye
			
		Sphere eye = new Sphere(5.5, new Point3D(new Coordinate(55),new Coordinate(-29), new Coordinate(-80)), Color.white,new Material(1,1,40));
		Sphere eye2 = new Sphere(4, new Point3D(new Coordinate(55),new Coordinate(-29), new Coordinate(-78)), Color.black,new Material(1,1,100,0.5,0));
		//Sphere eye3 = new Sphere(2.5, new Point3D(new Coordinate(54),new Coordinate(-29), new Coordinate(-76)), Color.red,new Material(1,1,100,0.2,0));
		Vector p = new Vector(new Point3D(new Coordinate(54),new Coordinate(-29),new Coordinate(-76)));
		scene.addLight(new SpotLight( new Point3D(new Coordinate(54),new Coordinate(-29),new Coordinate(-76)), 0.0, 0.0001, 0.00005, 
							   new Vector(p),new Color(255, 255, 255)));
		scene.addGeometry(eye);
		scene.addGeometry(eye2);
		//scene.addGeometry(eye3);

		//bubbles
		Sphere bubbles1 = new Sphere(7, new Point3D(new Coordinate(125),new Coordinate(-40), new Coordinate(-85)), Color.red,new Material(1,1,400,1,0.5));
		Sphere bubbles2 = new Sphere(7, new Point3D(new Coordinate(90),new Coordinate(-10), new Coordinate(-75)), Color.blue,new Material(1,1,400,1,0.5));
		Sphere bubbles3 = new Sphere(7, new Point3D(new Coordinate(120),new Coordinate(20), new Coordinate(-80)), Color.magenta,new Material(1,1,400,1,0.5));
		Sphere bubbles4 = new Sphere(7, new Point3D(new Coordinate(80),new Coordinate(25), new Coordinate(-70)), Color.cyan,new Material(1,1,400,1,0.5));
		Sphere bubbles5 = new Sphere(7, new Point3D(new Coordinate(135),new Coordinate(15), new Coordinate(-80)), Color.yellow,new Material(1,1,400,1,0.5));

		scene.addGeometry(bubbles1);
		scene.addGeometry(bubbles2);
		scene.addGeometry(bubbles3);
		scene.addGeometry(bubbles4);
		scene.addGeometry(bubbles5);

		//Cloud
		//Color myGray=new Color(220, 220, 220);
		Sphere Cloud1 = new Sphere(17, new Point3D(new Coordinate(-65),new Coordinate(100), new Coordinate(-85)), Color.gray,new Material(1,1,40,0.5,0.9));
		Sphere Cloud2 = new Sphere(15, new Point3D(new Coordinate(-55),new Coordinate(115), new Coordinate(-80)), Color.gray,new Material(1,1,40,0.5,0.9));
		Sphere Cloud3 = new Sphere(15, new Point3D(new Coordinate(-85),new Coordinate(130), new Coordinate(-90)), Color.gray,new Material(1,1,40,0.5,0.9));
		Sphere Cloud4 = new Sphere(15, new Point3D(new Coordinate(-95),new Coordinate(120), new Coordinate(-95)), Color.gray,new Material(1,1,40,0.5,0.9));
		Sphere Cloud5 = new Sphere(15, new Point3D(new Coordinate(-113),new Coordinate(120), new Coordinate(-93)), Color.gray,new Material(1,1,40,0.5,0.9));
		Sphere Cloud6 = new Sphere(15, new Point3D(new Coordinate(-50),new Coordinate(115), new Coordinate(-90)), Color.gray,new Material(1,1,40,0.5,0.9));
		Sphere Cloud7 = new Sphere(15, new Point3D(new Coordinate(-30),new Coordinate(120), new Coordinate(-85)), Color.gray,new Material(1,1,40,0.5,0.9));
		Sphere Cloud8 = new Sphere(5, new Point3D(new Coordinate(-80),new Coordinate(115), new Coordinate(-87.5)), Color.gray,new Material(1,1,1,1,0));


		scene.addGeometry(Cloud1);
		scene.addGeometry(Cloud2);
		scene.addGeometry(Cloud3);
		scene.addGeometry(Cloud4);
		scene.addGeometry(Cloud5);
		scene.addGeometry(Cloud6);
		scene.addGeometry(Cloud7);
		scene.addGeometry(Cloud8);

		
		//Light
		scene.addLight(new DirectionalLight(new Vector (new Point3D(new Coordinate(-70000),new Coordinate(10000), new Coordinate(-1000))) ,
				   new Color(255, 255, 153)));

		scene.addLight(new PointLight( new Point3D(new Coordinate(1000),new Coordinate(1000),new Coordinate(-80)), 0, 0.0001, 0.00005, 
				   new Color(255, 255, 153)));

		//scene.addLight(new SpotLight( new Point3D(new Coordinate(1000),new Coordinate(1000),new Coordinate(50)), 0.0, 0.0001, 0.00005, 
	//			   new Vector(),new Color(255, 255, 153)));



		
		ImageWriter imageWriter = new ImageWriter("Final Project", 500, 500, 500, 500);
		
		Render render = new Render(scene, imageWriter);
		
		render.renderImage();

		imageWriter.writeToimage();
		
	}

}
