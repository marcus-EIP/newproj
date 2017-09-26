package proj_1;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest2 {

	@Test
	public void testIsBlank(){
		Assert.assertTrue(StringUtils.isBlank(null));
	}
}
