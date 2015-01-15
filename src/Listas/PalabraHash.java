package Listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 *
 * @author Javier Azcurra
 */
public class PalabraHash {
    
    private HashMap pal;
    private ArrayList<Palabra> lisPalabra;    
    
    public PalabraHash() {
        pal = new HashMap();        
        lisPalabra = new ArrayList<>();        
    }
    
    public void addPalabra(String p, int valueParam) {
        
        if(!p.matches(".*[A-Za-z].*")){
            return;
        }        
        
        if (pal.containsKey(p)) {
            int val = Integer.parseInt(pal.get(p).toString());
            val = val + valueParam;
            pal.put(p, val);
        } else {//else just add it
            pal.put(p, valueParam);
        }   
    
    
    }
    
    public void addPalabra(String p) {
        //agrega solo con 1
        addPalabra(p, 1);
    }
    
    public int getCantApa(String key) {
        int val = Integer.parseInt(pal.get(key).toString());
        return val;        
    }
    
    public ArrayList<Palabra> getArray() {
        
        Iterator it = pal.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            String k = pairs.getKey().toString();
            int val = Integer.parseInt(pairs.getValue().toString());
            it.remove(); // avoids a ConcurrentModificationException
            
            lisPalabra.add(new Palabra(k, val));
        }
        
        return lisPalabra;
    }
    
    public void clear(){
        pal.clear();
        lisPalabra.clear();       
    }
}
