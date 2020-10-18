



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gen;

import java.util.ArrayList;


public class InitiateFuzzy_Classification {

    public ArrayList getClusters( ArrayList mas)
    {
       
       
      
       

            DecisionRules fz=new DecisionRules();
       ArrayList rule=fz.getFuzzyRules(mas);
       
        System.out.println("RULES ARE GENERATED ARE ");
        System.out.println(rule);

        DeicsionClustering fc = new DeicsionClustering();
        ArrayList c = fc.getFuzzyClusters(mas, rule);
     
       
       
       
return c;
    }
     
    
    



    }


