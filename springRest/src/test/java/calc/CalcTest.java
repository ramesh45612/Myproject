package calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalcTest {

	@InjectMocks
	Calc calc;

	@Mock
	CalService calService;

	@Mock
	MathService mathService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAdd() {
		Mockito.when(calService.add(Mockito.anyInt(), Mockito.anyInt())).thenReturn(100);
		int result = calc.add(10, 20); //100
		System.out.println("test result\t" + result);
		// will go to Calc -->doesn't go to CalService --> above mocked add method will call
		// Here no need to bother about CallService only focus on our Calc
		// CalService might be third party
		Assert.assertEquals(100, result);
	}

	@Test
	public void testSub() {
		Mockito.when(calService.sub(Mockito.anyInt(), Mockito.anyInt())).thenReturn(50);
		int result = calc.sub(25, 20);
		Assert.assertEquals(50, result);
	}

	@Test
	public void testSquare() {
		Mockito.when(mathService.square(Mockito.anyInt())).thenReturn(50);
		int result = calc.square(10);
		Assert.assertEquals(50, result);
	}

	@Test
	public void testCube() {
		Mockito.when(mathService.cube(Mockito.anyInt())).thenReturn(50);
		int result = calc.cube(10);
		Assert.assertEquals(50, result);
	}

	@Test
	public void withoutMockAdd() {
		Calc calTest = new Calc();
		int result = calTest.add(10, 20);
		// will go to Calc --> CalService --> actual result
		Assert.assertEquals(30, result);
	}
}
