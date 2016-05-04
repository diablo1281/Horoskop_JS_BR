package pl.edu.pwr.pp;

import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class HoroskopTest {	
	
	@Test
	public void healthFor12ShouldReturn0() {
		String name = "Czy bedzie 0";
		Przepowiednie przepowiednia = new Przepowiednie(name);
		
		assertThat(0, is(equalTo(przepowiednia.healthIndex())));
	}
	
	@Test
	public void healthFor10ShouldReturn10() {
		String name = "Czybedzi10";
		Przepowiednie przepowiednia = new Przepowiednie(name);
		
		assertThat(10, is(equalTo(przepowiednia.healthIndex())));
	}
	
	@Test
	public void loveTodayShouldReturn3() {
		Przepowiednie przepowiednia = new Przepowiednie("");
		
		assertThat(3, is(equalTo(przepowiednia.loveIndex())));
	}
	
	@Test
	public void workShouldReturn0To11() {
		Przepowiednie przepowiednia = new Przepowiednie("");
		
		assertTrue("Index: " + przepowiednia.workIndex(),(0 <= przepowiednia.workIndex()) && (przepowiednia.workIndex() < 12));
	}
}
