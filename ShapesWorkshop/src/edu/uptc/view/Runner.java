package edu.uptc.view;
import java.util.Scanner;

import edu.uptc.logic.Circle;
import edu.uptc.logic.Figure;
import edu.uptc.logic.Square;
import edu.uptc.logic.Triangle;

public class Runner {
    public static void main(String[] args) {

        Figure square = new Square();
        Figure triangle = new Triangle();
        Figure circle = new Circle();

        Scanner sc = new Scanner(System.in);

        String menuFigure = "------ Enter a figure ------\n"
            + "1. Circle\n"
            + "2. Square\n"
            + "3. Triangle\n"
            + "4. Figure4\n"
            + "5. Exit";

        int option = 0;
        System.out.println(menuFigure);
        option = sc.nextInt();

        while (option != 5) {
            
            try {
                
                switch (option) {
                    case 1 -> menu(circle);             
                    case 2 -> menu(square);             
                    case 3 -> menu(triangle);             
                    case 4 -> menu(circle);                     
                    
                }

            } catch (Exception e) {
                // TODO: handle exception
            }
            
            
        }  
    }

    public static String menuAction(){

        return "------ What do you want to do? ------\n"
            + "1. Make Visible\n"
            + "2. Make Invisible\n"
            + "3. Move Right\n"
            + "4. Move Left\n"
            + "5. Move Up\n"
            + "6. Move Down\n"
            + "7. Move Horizontal\n"
            + "8. Move Vertical\n"
            + "9. Slow Move Horizontal\n"
            + "10. Slow Move Vertical\n"
            + "11. Change Color\n"
            + "12. Erase\n"
            + "13. Draw\n"
            + "14. Change Size\n"
            + "15. Exit";
    }

    public static String menuColor(){

        return "------ Select a color ------\n"
            + "1. Red\n"
            + "2. Yellow\n"
            + "3. Blue\n"
            + "4. Green\n"
            + "5. Magenta\n"
            + "6. Black";
    }

    public static void menu (Figure figure){

        Scanner sc = new Scanner(System.in);
        int option, distance, optionColor = 0;
        String color = "";

        do {

            System.out.println(menuAction());
            option = sc.nextInt();

             try {

                switch (option) {

                    case 1 -> makeVisible(figure); 
                    case 2 -> makeInvisible(figure);  
                    case 3 -> moveRight(figure);                         
                    case 4 -> moveLeft(figure);                         
                    case 5 -> moveUp(figure);
                    case 6 -> moveDown(figure);                        
                    case 7 -> {
                        System.out.println("Enter a distance");
                        distance = sc.nextInt();
                        moveHorizontal(figure, distance);
                    }    
                    case 8 -> {
                        System.out.println("Enter a distance");
                        distance = sc.nextInt();
                        moveVertical(figure, distance);
                    }    
                    case 9 -> {
                        System.out.println("Enter a distance");
                        distance = sc.nextInt();
                        slowMoveHorizontal(figure, distance);
                    } 
                    case 10 -> {
                        System.out.println("Enter a distance");
                        distance = sc.nextInt();
                        slowMoveVertical(figure, distance);
                    } 
                    case 11 -> {
                        System.out.println(menuColor());
                        optionColor = sc.nextInt();

                        switch (optionColor) {
                            case 1 -> color = "red";
                            case 2 -> color = "yellow";
                            case 3 -> color = "blue";
                            case 4 -> color = "green";
                            case 5 -> color = "magenta";
                            case 6 -> color = "black";
                        
                        }
                        changeColor(figure, color);
                    } 
                    case 12 -> erase(figure);
                    case 13 -> draw(figure);
                      
                        
                }               
                

            } catch (Exception e) {
                // TODO: handle exception
            }
            
        } while (option != 15);

        
    }

    public static void makeVisible(Figure figure){
        figure.makeVisible();
    }
    public static void makeInvisible(Figure figure){
        figure.makeInvisible();
    }
    public static void moveRight(Figure figure){
        figure.makeVisible();
        figure.moveRight();
    }
    public static void moveLeft(Figure figure){
        figure.makeVisible();
        figure.moveLeft();
    }
    public static void moveUp(Figure figure){
        figure.makeVisible();
        figure.moveUp();
    }
    public static void moveDown(Figure figure){
        figure.makeVisible();
        figure.moveDown();
    }
    public static void moveHorizontal(Figure figure, int distance){
        figure.makeVisible();
        figure.moveHorizontal(distance);
    }
    public static void moveVertical(Figure figure, int distance){
        figure.makeVisible();
        figure.moveVertical(distance);
    }
    public static void slowMoveHorizontal(Figure figure, int distance){
        figure.makeVisible();
        figure.slowMoveHorizontal(distance);
    }
    public static void slowMoveVertical(Figure figure, int distance){
        figure.makeVisible();
        figure.slowMoveVertical(distance);
    }
    public static void changeColor(Figure figure, String color){
        figure.makeVisible();
        figure.changeColor(color);
    }
    public static void erase(Figure figure){
        figure.makeVisible();
        figure.erase();
    }
    public static void draw(Figure figure){
        figure.makeVisible();
        figure.draw();
    }
      
}
