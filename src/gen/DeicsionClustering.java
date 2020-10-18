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
public class DeicsionClustering {

   
    public ArrayList getFuzzyClusters(ArrayList mas,ArrayList rule)
    {
        
          ArrayList fincluster=new ArrayList();   // cluster for one cloumn//
        for(int i=0;i<rule.size();i++)
        {
          
          
            ArrayList trule=(ArrayList)rule.get(i); // get all rule for one column//
              
         
               ArrayList cluster=new ArrayList();// T Hold Cluster of One Type//
     
               double r1=Double.parseDouble(trule.get(0).toString());
               double r2=Double.parseDouble(trule.get(1).toString());
               //System.out.println("R1 "+r1+" -- "+"R2 "+r2);
              
                for(int j=0;j<mas.size();j++)
                {
                ArrayList row=(ArrayList)mas.get(j);
                double rv=Double.parseDouble(row.get(1).toString());
                  //  System.out.println("RVVVVVVVVVVVV "+rv);
                if(rv>=r1&&rv<=r2)
                {
                    
                    cluster.add(row);
                }

                }
               // System.out.println("cluster size is ++++++++++++++ "+cluster.size());
                if(cluster.size()>0)
               fincluster.add(cluster);

      
          
        
        }

 //System.out.println(fclusters);

return fincluster;

    }
}
