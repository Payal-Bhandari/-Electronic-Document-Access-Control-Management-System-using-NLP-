
package dms01;


import features.CorreationHelper;
import features.PNListIdentifier;
import features.TermWeightCalculator;
import gen.DeicisonUtil;
import gen.TermWeightNueron;
import java.util.ArrayList;
import preprocessing.Preprocessor;
import tf_idf.IDFInitiator_FIN;
import tf_idf.TF_Evaluator_FIN;


public class ProcessInit
{
    
    public ArrayList getClassificationList(ArrayList  mas)
    {
        ArrayList fincorr=new ArrayList();
        
            System.out.println("\n\n CLASSIFICATION PROCESS BEGINS\n\n");
        
        for(int i=0;i<mas.size();i++)
        {
            System.out.println("CLASSIFICATION OF EMAIL NO  "+(i+1));
          
            
             ArrayList temp=(ArrayList)mas.get(i);
             String emailid=(String)temp.get(0);
             String cont=(String)temp.get(1);
             cont=cont.toLowerCase();
             cont=cont.trim();
               System.out.println("EMAIL ID IS : "+emailid);
             System.out.println("EMAIL CONTENTS IS : "+cont);
             String pre=new Preprocessor().textProcessing(cont);
             System.out.println("PREPROCESSED EMAIL CONTENTS IS : "+pre);
             
            ArrayList pn = new PNListIdentifier().getPNList(pre);
            ArrayList pos = (ArrayList) pn.get(0);
            ArrayList neg = (ArrayList) pn.get(1);

            System.out.println("Positive Words : " + pos);
            System.out.println("Negative Words : " + neg);

            ArrayList term = new TermWeightCalculator().termWeightEstimator(pre);
            System.out.println("FREQUENCY OF WORDS ARE  : " + term);

            ArrayList pos1 = new TermWeightNueron().EnhancedTermweight(term, pos);
            ArrayList neg1 = new TermWeightNueron().EnhancedTermweight(term, neg);
               
                System.out.println("Enhanced Positive Neurons Through Term Weight : " + pos1);
                System.out.println("Enhanced Negative Neurons Through Term Weight: " + neg1);
                                   
               

                 ArrayList tflist= new TF_Evaluator_FIN().getTF(pre);
                 ArrayList tfidflist= new IDFInitiator_FIN().getIDF(tflist, mas);
                System.out.println("TF IDF OF EMAIL IS  : "+tfidflist);
                 
                ArrayList list=new DeicisonUtil().getEnhancedList(tflist, pos1, neg1);
                ArrayList pos2=(ArrayList)list.get(0);
                ArrayList neg2=(ArrayList)list.get(1);
                
                System.out.println("Final Enhanced Positive Neurons Through  : " + pos2);
                System.out.println("Final Enhanced Negative Neurons : " + neg2);
                
                int p=pos2.size();
                int n=neg2.size();
               double corr=new CorreationHelper().getCorrelation(p,n);
               System.out.println("CORRELATION IS "+corr);
               
               String str=Double.toString(corr);
               ArrayList tt=new ArrayList();
               tt.add(emailid);
               tt.add(str);
               fincorr.add(tt);
             
             System.out.println("\n\n =================================================");
        }
       
        
        
        return fincorr;
        
    }
}
