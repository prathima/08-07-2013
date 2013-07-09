package home._4;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestFeatureTwo {
	@Test
	public void testSecondFeature() {
		Assert.assertTrue(true);
	}

	@Test
	@Ignore
	public void testSecondFeatureIgnored() {
		Assert.assertTrue(true);

	}
}
