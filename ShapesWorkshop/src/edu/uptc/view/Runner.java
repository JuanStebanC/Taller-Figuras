package edu.uptc.view;
import edu.uptc.logic.Circle;
import edu.uptc.logic.Figure;
import edu.uptc.logic.Square;
import edu.uptc.logic.Triangle;

public class Runner {
    public static void main(String[] args) {

       Figure square = new Square();
       Figure triangle = new Triangle();
       Figure circle = new Circle();

       triangle.makeVisible();
       triangle.draw();

       square.makeVisible();
       square.draw();

       circle.makeVisible();
       circle.draw();
       
    }
   
}
