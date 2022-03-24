package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    static int x = WIDTH/2;
    static int y = HEIGHT - 15;
//    static Car car;
//    static Car carro;
//    static Car coche;
    
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(0, 0, 0);
    	//green patch
    	fill(0, 100, 0);
    	rect(0, 0, WIDTH, HEIGHT/4);
    	rect(0, HEIGHT-(HEIGHT/4), WIDTH, HEIGHT/4);

    	
    	//yellow cross lines
    	int line = 0;
    	for(int i = 0; i<25; i++) {
    		//int line = 0;
    		fill(255, 255, 0);
        	//rect(line, HEIGHT*(2/3), 10, 5);
        	rect(line, HEIGHT/2, 10, 5);
        	line += 25;
    	}
    	
    	//frogger
    	fill(0, 255, 0);
    	ellipse(x, y, 20, 30);
    	ellipse(x-10, y-5, 5, 10);
    	ellipse(x-10, y+5, 5, 10);
    	ellipse(x+10, y-5, 5, 10);
    	ellipse(x+10, y+5, 5, 10);
    	//eyes
    	fill(0,0,0);
    	ellipse(x+2, y-5, 2, 2);
    	ellipse(x-2, y-5, 2, 2);
    	
    	inBounds();
    	int speed = 5;
    	speed+=5;
    	fill(255, 0, 0);
    	rect(WIDTH-speed, 150, 20, 10);
    	rect(0+speed, 150, 20, 10);
    	
    }
    
    public void keyPressed(){
        if(key == CODED){
        	System.out.println(keyCode);
            if(keyCode == UP)
            {
                y-=5;
            }
            else if(keyCode == DOWN)
            {
                y+=5;
            }
            else if(keyCode == RIGHT)
            {
                x+=5;
            }
            else if(keyCode == LEFT)
            {
                x-=5;
            }
        }
    }
    
    public void inBounds() {
    	if (x>WIDTH) {
    		x = WIDTH;
    	} else if (x<0) {
    		x = 0;
    	} else if (y>HEIGHT) {
    		y = HEIGHT;
    	} else if (y<0) {
    		y = 0;
    	}
    		
    }
	

    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
