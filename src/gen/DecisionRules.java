/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gen;

import java.util.ArrayList;

/**
 *
 * @author A57
 */
public class DecisionRules {

    public ArrayList getFuzzyRules(ArrayList mas)
    {
        
//        ArrayList rule=new ArrayList();
      
          ArrayList col=new ArrayList();
         
            for(int j=0;j<mas.size();j++)
            {
                ArrayList row1=(ArrayList)mas.get(j);
                String v=(String)row1.get(1);
                double v1=Double.parseDouble(v);
                col.add(v1);
            }
              ArrayList r=new Range().getMinMax(col);
              
           
        
     
     return r;
    }

}
