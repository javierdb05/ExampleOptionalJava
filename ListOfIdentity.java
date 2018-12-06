package OptionalExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListOfIdentity {
	
	static List<String> list = new ArrayList<String>();
    static {
         
    	list.add(new String("1022417310"));
    	list.add(new String("103067946"));
    	list.add(new String("79784313"));
    }
          
    public Optional<String> SearchForIdentification(String nombre) {
         
         for (String p:list) {
              
             if (p.equals(nombre)) {
                 return Optional.of(p);
             }
         }
          
         return Optional.empty();
    }

}
