package ie.tudublin;

import java.util.ArrayList;

import com.sun.xml.internal.ws.wsdl.writer.document.OpenAtts;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}
	ArrayList colours[] =  new Arraylist Colour();
	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void loadColours()
	{
		String k = Read("data\colours.csv"); 
		for(int i = 0,i < len(k), i++)
		{
			colours[i] = Read("data\colours.csv",1); 
		}
	}

	public void printColours()
	{
		for (String colo : colours[]) {
			System.out.println("Colour:" + colo);
		}
	}

	public void setup() 
	{
	}
	
	//     ************
	//  **** $ $ $    *****  %%%
	//     ************	

	public void draw()
	{			
		
	}
}
