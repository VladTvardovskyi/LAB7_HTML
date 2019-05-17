package ua.lviv.iot.sortHTML;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Pattern;
import java.lang.String;
import org.hamcrest.MatcherAssert;




import ua.lviv.iot.SortHTML;


public class SortHTML_TEST {
	
	SortHTML sortHTML = new SortHTML();
	public String st = "<span> id=ghghkgkg</span>";
	
	
	@Test
	void matcherTest()throws IOException {
		MatcherAssert.assertThat(st, matchesPattern("(<span>.+</span>)|(<table>.+</table>)|(<strong>.+</strong>)"));
	}
	
	@Test 
	 void sortByAlphabeticOrderTest() {
		List<String> superText = new ArrayList<>();
		String obj1 = "patric";
		String obj2 = "gdoron";
		superText.add(obj1);
		superText.add(obj2);
		assertEquals(sortHTML.sortByAlphabeticOrder(), superText);
	}
	@Test
	void scannerTest() {
	st = SortHTML.readInputText();
	assertEquals("THIS IS SPARTA", st);
	}
}
