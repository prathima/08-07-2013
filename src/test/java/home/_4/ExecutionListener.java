package home._4;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class ExecutionListener extends RunListener {
	public void testRunStarted(Description description)
			throws java.lang.Exception {
		System.out.println("Number of testcases to execute :"
				+ description.testCount());
	}

	public void testRunFinished(Result result) throws java.lang.Exception {
		System.out.println("Number of testcases to executed :"
				+ result.getRunCount());

	}

	public void testStarted(Description description) throws java.lang.Exception {
		System.out.println("Starting execution of test case :"
				+ description.getMethodName());

	}

	public void testFinished(Description description)
			throws java.lang.Exception {
		System.out.println("Finished execution of test case :"
				+ description.getMethodName());

	}

	public void testFailure(Failure failure) throws java.lang.Exception {
		System.out.println("Execution of test case failed :"
				+ failure.getMessage());

	}

	public void testIgnored(Description description) throws java.lang.Exception {
		System.out.println("Execution of test case ignored :"
				+ description.getMethodName());

	}
}
