package unit_test;

import org.junit.Assert;

import org.junit.Test;

public class CheckifArm {

	@Test
	public void test() {
		CheckArmstrong obj=new CheckArmstrong();
		boolean flag=obj.checkArm(153);
		Assert.assertTrue(flag);
	}

}
