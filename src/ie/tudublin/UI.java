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
		Resistor re = new Resistor(value,ones, tens, hundreds);
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
	public Colour findColor(int value)
	{
		return colours[value];
	}

	//     ************
	//  **** $ $ $    *****  %%%
	//     ************	
	public void render()
	{
		int no = 4;
		int x = width / 3;
		int y = height / 5;
		int squareL = width /5;
		int fbL = squareL / 2;
		for(int i = 1, i < no +1,i++){
			stroke(255);
			line(x, y, x + fbL, y);
			line(x + squareL, y, x + squareL + fbL, y);
			line(x + fbL, y - 1/2 * squareL,x + squareL + fbL, y - 1/2 * squareL);
			line(x + fbL, y - 1/2 * squareL,x + fbL, y + 1/2 * squareL);
			line(x + fbL, y + 1/2 * squareL,x + squareL+ fbL, y + 1/2 * squareL);
			line(x + squareL + fbL, y - 1/2 * squareL,x + squareL+ fbL, y + 1/2 * squareL);
			stroke(colours[1]);
			line( x + fbL + squareL / 10 *1, y - 1/2 * squareL,x + fbL + squareL / 10 *1, y + 1/2 * squareL );
			stroke(colours[2]);
			line( x + fbL + squareL / 10 *3, y - 1/2 * squareL,x + fbL + squareL / 10 *1, y + 1/2 * squareL );
			stroke(colours[3]);
			line( x + fbL + squareL / 10 *5, y - 1/2 * squareL,x + fbL + squareL / 10 *1, y + 1/2 * squareL );
			text(resistor[i], width * 9 / 10 , y);
			y++;
		}
		
	}
	public void setup() 
	{
	}
	


	public void draw()
	{			
		render();
	}
}
