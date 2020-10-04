/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.variables;

/**
 *
 * @author Tsvetelinka
 */
public class Physics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int lightSpeed = 299792458;      
        System.out.printf("The speed of light is %s m/s\n", lightSpeed);
        
        float earthGravity = 9.8f;
        System.out.printf("The gravity of the Earth is %.6f m/s2\n", earthGravity);
        
        long milkyWayStarsCount = 300_000_000_000l;
        System.out.printf("There are %d stars in the Milky Way Galaxy\n", milkyWayStarsCount);
        
        short earthRadius = 6378;
        System.out.printf("The radius of the Earth is %d km\n", earthRadius);
        
        byte planetCount = 8;
        System.out.printf("There are %d planets in the Solar System.\n", planetCount);
        
        String largestPlanet = "Jupiter";
        System.out.printf("The largest planet in the Solar System is %s.\n", largestPlanet);
        
        float gravityOfJupiter = 24.790001f;
        System.out.printf("The gravity of Jupiter is %f m/s2\n", gravityOfJupiter);
        
        boolean jupiterGravityStronerThanEarths = true;
        System.out.printf("Is Jupiter gravity stronger than Earth's: %b\n", jupiterGravityStronerThanEarths);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
