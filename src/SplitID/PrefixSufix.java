package SplitID;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrefixSufix {

    Set<String> sufijos = new HashSet();
    Set<String> prefijos = new HashSet();
    BufferedReader br = null;

    public PrefixSufix() {


        try {
            
            br = new BufferedReader(new FileReader("Prefijos.txt"));

            String line;
            try {
                while ((line = br.readLine()) != null) {
                    prefijos.add(line);

                }
            } catch (IOException ex) {
                Logger.getLogger(PrefixSufix.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            br = new BufferedReader(new FileReader("Sufijos.txt"));
            try {
                while ((line = br.readLine()) != null) {
                    sufijos.add(line);
                }
            } catch (IOException ex) {
                Logger.getLogger(PrefixSufix.class.getName()).log(Level.SEVERE, null, ex);
            }




        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrefixSufix.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(PrefixSufix.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public boolean isPrefix(String s) {
        return prefijos.contains(s.toLowerCase());        
    }

    public boolean isSuffix(String s) {
        return sufijos.contains(s.toLowerCase());
    }
}
