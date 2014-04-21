package SplitID;

/**
 *
 * @author javier
 */
public class GreedyPaper {
    
    
    //   public static void main(String args[]) {
//       
//       String salida = prefijo("mesapuertasofa","");
//       System.out.println(salida);
//       
//       
//       salida = sufijo("mesapuertasofa","");
//       System.out.println(salida); 
//          
//         
//    }
   
    private static String prefijo(String s1, String s2){        
              
        if(s1.length() == 0){
            return s2;
	}        
  
        
        String conj[] = {"puerta","mesa","sofa"};

	if(conj[0].equals(s1) || conj[1].equals(s1) || conj[2].equals(s1)){            
                        
            String res = prefijo(s2,"");
            
            if(res.isEmpty()){
               return s1;
            }
            
            return s1 + " " + res;           
            
	}
        
        s2 = s1.substring(s1.length() - 1) + s2;
        
        s1 = s1.substring(0,s1.length() - 1);        
        
        return prefijo(s1,s2);   
        
    }
    
    //------------------------------------------------
    
    
    private static String sufijo(String s1, String s2){       
        
        if(s1.length() == 0){
            return s2;
	}        
  
        
        String conj[] = {"puerta","mesa","sofa"};

	if(conj[0].equals(s1) || conj[1].equals(s1) || conj[2].equals(s1)){            
                        
            String res = sufijo(s2,"");
            
            if(res.isEmpty()){
               return s1;
            }
            
            return res + " " + s1;           
            
	}
        
        s2 = s2 + s1.charAt(0);
        
        s1 = s1.substring(1,s1.length());        
        
        return sufijo(s1,s2);   
        
    }
    
}
