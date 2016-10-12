package GUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


/*
    Denne klassen holder på variabler og inneholder get & set metoder

        
*/
public class Storage{
    
    
    
    static ArrayList<Student> studentList = new ArrayList<Student>();
    
    
    
    static ArrayList<String> målModul1 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul2 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul3 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul4 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul5 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul6 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul7 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul8 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul9 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul10 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul11 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul12 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul13 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    static ArrayList<String> målModul14 = new ArrayList<String>(
    Arrays.asList("Læringsmål 1", "Læringsmål 2", "Læringsmål 3", "Læringsmål 4")
    );
    
    
    
    
    
    public static String getLM(int modulNummer, int lmNummer) 
    {
        lmNummer = lmNummer - 1; 
        
        
        switch(modulNummer){
            case 1:
                return målModul1.get(lmNummer);
            case 2:
                return målModul2.get(lmNummer);
            case 3:
                return målModul3.get(lmNummer);
            case 4:
                return målModul4.get(lmNummer);
            case 5:
                return målModul5.get(lmNummer);
            case 6:
                return målModul6.get(lmNummer);
            case 7:
                return målModul7.get(lmNummer);
            case 8:
                return målModul8.get(lmNummer);
            case 9:
                return målModul9.get(lmNummer);
            case 10:
                return målModul10.get(lmNummer);
            case 11:
                return målModul11.get(lmNummer);
            case 12:
                return målModul12.get(lmNummer);
            case 13:
                return målModul13.get(lmNummer);
            case 14:
                return målModul14.get(lmNummer);
        }
        
        return "dummyString";
        
    }
    //Denne metoden endrer string verdien til et element i en av læringsmål arraylistene til string parameteret
    public static void setLM(int modulNummer, int lmNummer, String newLM)
    {
        lmNummer = lmNummer - 1;
        
        
        switch(modulNummer)
        {
            case 1:
                målModul1.set(lmNummer, newLM);
                break;
            case 2:
                målModul2.set(lmNummer, newLM);
                break;
            case 3:
                målModul3.set(lmNummer, newLM);
                break;
            case 4:
                målModul4.set(lmNummer, newLM);
                break;
            case 5:
                målModul5.set(lmNummer, newLM);
                break;
            case 6:
                målModul6.set(lmNummer, newLM);
                break;
            case 7:
                målModul7.set(lmNummer, newLM);
                break;
            case 8:
                målModul8.set(lmNummer, newLM);
                break;
            case 9:
                målModul9.set(lmNummer, newLM);
                break;
            case 10:
                målModul10.set(lmNummer, newLM);
                break;
            case 11:
                målModul11.set(lmNummer, newLM);
                break;
            case 12:
                målModul12.set(lmNummer, newLM);
                break;
            case 13:
                målModul13.set(lmNummer, newLM);
                break;
            case 14:
                målModul14.set(lmNummer, newLM);
                break;
                
        }
    }

    
    
    
    
    
    
}
