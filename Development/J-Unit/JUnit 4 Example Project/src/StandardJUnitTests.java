
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StandardJUnitTests {
  
  private MethodContainer methodContainer;
  
  public StandardJUnitTests()
  {
	  methodContainer = new MethodContainer();
  }
  
  @Test
  public void succeedingTest() {
	  assertEquals(methodContainer.performAddition(1, 2, 3),6);
  }
  
  @Test
  public void failingTest() {
	  assertEquals(methodContainer.performAddition(1, 2, 3),7);
  }
  
  @Test
  public void succeedingTestTwo() {
	  assertEquals(methodContainer.performMultiplication(1, 2, 3),6);
  }
  
  @Test
  public void failingTestTwo() {
	  assertEquals(methodContainer.performAddition(1, 2, 3),7);
  }
}
