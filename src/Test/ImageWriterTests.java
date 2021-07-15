package Test;

import java.awt.Color;

import org.junit.Test;

import Renderer.ImageWriter;

public class ImageWriterTests {

	@Test
	public void ImageWriterTest1() {
		ImageWriter image=new ImageWriter("test11", 500, 500, 500, 500);
		for(int j=0;j<500;j++)
			for(int i=0;i<500;i++)
				if(i%50==0||j%50==0||i==499||j==499)
					image.writePixel(j, i, Color.white);
				else
					image.writePixel(j, i, Color.black);
		image.writeToimage();
		//test2
		ImageWriter image2=new ImageWriter("test12", 500, 500, 500, 500);
		for(int j=0;j<500;j++)
			for(int i=0;i<500;i++)
			{
				if(i%50==0||j%50==0||i==499||j==499)
					image2.writePixel(j, i, Color.white);
				else
					image2.writePixel(j, i, Color.black);
				if(j>201&&j<299)
					if(i>201&&i<299)
						image2.writePixel(j, i, 255,0,255);
			}
				
		image2.writeToimage();
		//test3
		ImageWriter image3=new ImageWriter("test13", 500, 500, 500, 500);
		for(int j=0;j<500;j++)
			for(int i=0;i<500;i++)
			{
				//background
				image3.writePixel(j, i, 100,180,255);
			}
		for(int i=450;i<500;i++)
			for(int j=0;j<500;j++)
				//grass
				image3.writePixel(j, i, 0, 255, 0);
		for (int j=270;j<300;j++)
			for(int i=170;i<200;i++)
				//chimney
				image3.writePixel(j, i, 153,0,0);

			for (int j=150,size=350,i=250;j<=size&& i>100;i--,j++, size--)
			{
				for (int y=j;y<size;y++)
				{
					//roof
					image3.writePixel(y, i, 255,0,0);
				}
			}

		for (int j=150;j<350;j++)
			for(int i=250;i<450;i++)
				//house
				image3.writePixel(j, i, 255,255,204);
		for (int j=215;j<285;j++)
			for(int i=365;i<450;i++)
				//door
				image3.writePixel(j, i, 102,51,0);
		
		for(int j=350;j<500;j++)
			for(int i=0;i<j-350;i++)
				//sun
				image3.writePixel(j, i, 255,255,0);

		
		image3.writeToimage();
	}

}
