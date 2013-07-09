package home._3;

import org.junit.Test;

public class TimeOutTest {
	@Test(timeout = 5000)
	public void testInfiniteTametakingLoop() throws InterruptedException {
		while (true) {
			Thread.currentThread().sleep(1000);
		}
	}

}
