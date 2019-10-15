import org.junit.Test;
import static org.junit.Assert.*;

public class Testapproxmation {
	
	public static void Testapproxmation() {
	
		pi myUnit = new pi();
	
		double result = pi.appr(1e7);
	
		assertEquals(result, 3.141592654, .001);
	
}
}
