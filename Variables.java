/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

/**
 *
 * @author tsvetelinka
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        byte personAge = 21;
        System.out.println("Age: " + personAge);

        byte grade = 6, temperature = -5;
        System.out.printf("My grade is %d.The temperature is %d.\n\n", grade, temperature);
        
        short distanceBetweenSofiaAndBerlin;     
        distanceBetweenSofiaAndBerlin = 1634;      
        System.out.println("The distance is: " + distanceBetweenSofiaAndBerlin + "km");
        
        int studentCount= 50000;       
        System.out.printf("%d students have graduated\n", studentCount); 
        
        long numberOfCells;
        numberOfCells = 37_200_000_000_000l;   
        System.out.println("Number of cells: " + numberOfCells);
        
        float water = 1.85f;    
        System.out.println("We have " + water+ " liters of water");
        
        double sunTemperature = 15000000.1212;
        System.out.println("Sun temperature is: " + sunTemperature);
        
        double cash = 3.50;
        System.out.printf("I have %.2f leva.\n", cash);
        
        boolean agreed = true;
        agreed = false;
        System.out.println("Agreed: "+ agreed);
        
        boolean buyBeer = personAge >= 18;
        System.out.println("Can buy beer: " + buyBeer);
        
        char gender = 'M';
        
        String myName = "Tsvetelina Yordanova";
        System.out.println("My name is: " + myName);
        
        String job;
        job = "Sofware developer";
        System.out.printf("I work as %s \n", job);  

    }

}
