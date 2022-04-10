package com.in28Minute.junitesting.unittesting.spike;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
	
	String actualResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";
	
	@Test
	public void jsonAssert_StrictTrue_ExactMatchExceptForSpace() throws JSONException {
		String expectResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";
		JSONAssert.assertEquals(expectResponse, actualResponse, true);
	}
	
	@Test
	public void jsonAssert_StrictFalse() throws JSONException {
		String expectResponse = "{\"id\":1,\"name\":\"Ball\"}";
		JSONAssert.assertEquals(expectResponse, actualResponse, false);
	}
	
	@Test
	public void jsonAssert_WithoutEsceptCharacters() throws JSONException {
		String expectResponse = "{id: 1, name: Ball, price: 10, quantity: 100}";
		JSONAssert.assertEquals(expectResponse, actualResponse, false);
	}

}
