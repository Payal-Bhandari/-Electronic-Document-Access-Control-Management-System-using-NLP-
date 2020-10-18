/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dms01;

import java.io.FileInputStream;


public class TextFielReader
{


    public String readTempFile(String inputpath)
    {
        

StringBuffer st1=new StringBuffer();

     try
     {

      
       FileInputStream f1=new FileInputStream(inputpath);

           int x=0;
       char c=' ';
        do
        {  x=f1.read();

           if( x!=-1)

                c=(char)x;
                    st1.append(c);

        }while(x!=-1 );

       f1.close();
     
     }
      catch(Exception e)

       {
       }


String fcont=st1.toString();
String dd=fcont.substring(0, fcont.length()-1);
dd=dd.trim();
return dd;
    }
}
