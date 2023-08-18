
import org.junit.runner.JUnitCore;
import org.junit.internal.TextListener;

public class Project_Main {
	
	public static void main(String[] args) {
		
		System.out.println("Executing JUnit4 Tests");
		
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(StandardJUnitTests.class);
		
		System.out.println("Tests ran successfully");

	}

}
