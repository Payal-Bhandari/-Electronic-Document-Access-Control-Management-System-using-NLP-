/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dms01;


import gen.InitiateFuzzy_Classification;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1450
 */
public class ClassificationProcess
{
    public void initProcess(ArrayList mas)
    {
        ArrayList classlist= new ProcessInit().getClassificationList(mas);
        
        System.out.println("CORRELATION LIST IS "+classlist);
       ArrayList clssified=new  InitiateFuzzy_Classification().getClusters(classlist);
        
        System.out.println("clssified "+clssified);
         
        ArrayList ctype=new ArrayList();
        ctype.add("VERY LOW");
        ctype.add("LOW");
        ctype.add("MEDIUM");
        ctype.add("HIGH");
        ctype.add("VERY HIGH");

        for(int i=0;i<clssified.size();i++)
        {
            ArrayList Single=(ArrayList)clssified.get(i);
           System.out.println("CLASSIFIED FOR "+ctype.get(i));
         //  ArrayList emailMatter=new EmailReplyContent().getEmailContent(i);
            for(int j=0;j<Single.size();j++)
            {
                ArrayList c2=(ArrayList)Single.get(j);
                String filename=(String)c2.get(0);
                
                              
                System.out.println("File name  is :"+filename);
              
             
        
          //  System.out.println("\n===============================\n");
       
                
               //System.out.println("\n +++++++++++++++++++++++++++++++++++++++++++++++\n");
            }
            System.out.println("\n-------------------------------------------------------\n");
        }
        
        
        JOptionPane.showMessageDialog(null, "All Files are classified ");
    }
}
