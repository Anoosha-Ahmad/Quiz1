/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author ahmaa1808
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();

        // create a robot
        Robot karel = new Robot(kw, 4, 0, Direction.EAST);

        // create a staircase (walls)
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);

        // create lights (things)
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);

        // move robot up the staircase while picking up the lights (things)
        // move forawrd
        karel.move();
        //pick up light
        karel.pickThing();
        // move up one staircase
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        // pick up light
        karel.pickThing();
        // move up one staircase
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        // pick up light
        karel.pickThing();
        // move up one staircase
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        // pick up light
        karel.pickThing();
        // move down (descend) the staircase while putting the lights down
        //move forward
        karel.move();
        // put light down
        karel.putThing();
        //move down one staircase
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        // put light down
        karel.putThing();
        //move down one staircase
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        // put light down
        karel.putThing();
        //move down one staircase
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        // put light down
        karel.putThing();
        // move to face in the east direction
        karel.turnLeft();
        karel.move();
        
    }
}
