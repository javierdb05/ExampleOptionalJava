package OptionalExample;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class pruebaOptional {
	
public static void main(String args[]) {
	
	ListOfIdentity listIdentity= new ListOfIdentity();
	Optional<String> op=listIdentity.SearchForIdentification("102241731");
	
		if (op.isPresent()) {
			System.out.println("La identificacion del usuario es: "+op.get());
		}else { 
			System.out.println("El usuario no se encuentra en la lista");
		}

 }
/*
private static void prueba1() {
	try {
		
		String prueba = null;
		Optional<String> op = Optional.ofNullable(prueba); 
		if(op.isPresent()) {
			System.out.println(op.get());
		}else {
			System.out.println("El valor");
		}
		
	
	}catch(Exception e) {
		System.out.println("El valor es nulo");
	}
	
	
}
private static void prueba2() {
	ArrayList<String> list = new ArrayList<String>();
	
	list.add(new String("pedro"));
    list.add(new String("angel"));
    list.add(new String("ana"));
    
    public String buscar(String nombre) {
        
        for (String p:list) {
             
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
         
        return null;
   }
    
 
    
  
}*/
}