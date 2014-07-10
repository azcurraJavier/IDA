package Listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PalabraHash {
    
    private HashMap pal;
    private ArrayList<Palabra> lisPalabra;    
    
    public PalabraHash() {
        pal = new HashMap();        
        lisPalabra = new ArrayList<>();        
    }
    
    public void addPalabra(String p) {
        
        if(!p.matches(".*[A-Za-z].*")){
            return;
        }        
        
        if (pal.containsKey(p)) {
            int val = Integer.parseInt(pal.get(p).toString());
            val = val + 1;
            pal.put(p, val);
        } else {//else just add it
            pal.put(p, 1);
        }        
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
