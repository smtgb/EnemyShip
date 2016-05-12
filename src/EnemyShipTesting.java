/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
import java.util.Scanner;
public class EnemyShipTesting {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        //EnemyShip ufoShip;
        //ufoShip = new UFOEnemyShip();
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        
        
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println("What type of ship?(U / R / B)");
        
        if(userInput.hasNextLine())
        {
            //enemyShipOption = userInput.nextLine();
            String typeofShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeofShip);
        }
        
        if(theEnemy != null)
        {
            doStuffEnemyShip(theEnemy);
        }
        
        if(enemyShipOption.equals("U"))
        {
            theEnemy = new UFOEnemyShip();
        }
        else
            if(enemyShipOption.equals("R"))
            {
                theEnemy = new RocketEnemyShip();
            }
            else 
            {
                System.out.println("Enter a U R or B next time");
            }
        
        //doStuffEnemyShip(ufoShip);
        
    }
     public static void doStuffEnemyShip(EnemyShip anEnemyShip)
    {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.displayShipShoots();
    }
    
    
    
    
}
