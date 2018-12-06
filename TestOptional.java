package optionalExample;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

import OptionalExample.ListOfIdentity;
import OptionalExample.pruebaOptional;
import junit.framework.Assert;

public class TestOptional {

	@Test
	public void test() {
		
		ListOfIdentity listIdentity= new ListOfIdentity();
		Optional<String> op=listIdentity.SearchForIdentification("1022417310");
		
			if (op.isPresent()) {
				System.out.println("La identificacion del usuario es: "+op.get());
			}else { 
				System.out.println("El usuario no se encuentra en la lista");
			}
			
		
		Assert.assertEquals(op, op);
		
	
		
	}


}
