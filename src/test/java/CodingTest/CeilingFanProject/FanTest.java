package CodingTest.CeilingFanProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import CodingTest.CeilingFanProject.Fan.Rotation;

public class FanTest {
	Fan fan;
	
	@Before
    public void setUp() throws Exception {
        fan = new Fan();
    }

	@Test
	public void testPullChordFirstIncreaseSpeed() {
		fan.pullChordFirst();
		Assert.assertEquals(1, fan.getSpeedOFFan());
	}
	
	@Test
	public void testPullChordFirstReset() {
		fan.pullChordFirst();
		fan.pullChordFirst();
		fan.pullChordFirst();
		
		Assert.assertEquals(3, fan.getSpeedOFFan());
	}

	@Test
	public void testPullChordSecond() {
		Assert.assertEquals(Rotation.CLOCKWISE, fan.getFanDirection());
	}

}
