package home._5;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestSuiteExample {

	    public static Test suite() {  
	        TestSuite suite = new TestSuite(Test1.class);
	        suite.addTestSuite(Test2.class);
	        return suite; 
	}

	public static void main(String[] args) {
		TestRunner.run(suite());
	}

}
