import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.jivg.JunitMockitoCalc.JunitMockitoCalc;
import com.jivg.JunitMockitoCalc.iface.CalculatorService;


@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

	@InjectMocks
	JunitMockitoCalc mathApplication = new JunitMockitoCalc();
	
	@Mock
	CalculatorService calcService;
	
	@Test
	public void testAcc(){
		//comportamiento de CalculatorService para add dos doubles 
		when(calcService.add(10.0, 15.0)).thenReturn(25.0);
		
		//check funcionalidad add
		Assert.assertEquals(mathApplication.add(10.0, 15.0), 25.0);
		
	}
}
