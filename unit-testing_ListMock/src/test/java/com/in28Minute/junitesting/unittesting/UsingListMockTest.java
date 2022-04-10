package com.in28Minute.junitesting.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class UsingListMockTest {
	
	List<String> mock = Mockito.mock(List.class);

	@Test
	public void size_basic() {
		when(mock.size()).thenReturn(5);
		assertEquals(5, mock.size());
	}
	
	@Test
	public void returnDifferentvalue() {
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, mock.size());
		assertEquals(10, mock.size());
	}
	
	@Test
	public void returnWithParameter() {
		when(mock.get(0)).thenReturn("in28Minite");
		assertEquals("in28Minite", mock.get(0));
		assertEquals(null, mock.get(1));
	}
	
	@Test
	public void returnWithGenericParameter() {
		when(mock.get(anyInt())).thenReturn("in28Minite");
		assertEquals("in28Minite", mock.get(0));
		assertEquals("in28Minite", mock.get(1));
	}
	
	@Test
	public void varificationBasics() {
		//SUT
		String value = mock.get(0);
		
		//verify
		verify(mock).get(0);
		verify(mock).get(anyInt());
		verify(mock,times(1)).get(anyInt());
	}
	
	@Test
	public void argumentCapture() {
		//SUT
		mock.add("SomeString");
		
		//verification
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock).add(captor.capture());
		
		assertEquals("SomeString", captor.getValue());
	}
	
	@Test
	public void multipleArgumentCapture() {
		//SUT
		mock.add("SomeString1");
		mock.add("SomeString2");
		
		//verification
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock, times(2)).add(captor.capture());
		
		List<String> allValues = captor.getAllValues();
		
		assertEquals("SomeString1", allValues.get(0));
		assertEquals("SomeString2", allValues.get(1));
	}
	
	@Test
	public void Mocks() {
		ArrayList arrayListMock = mock(ArrayList.class);
		arrayListMock.add("Test0");  //without it not throw error
		System.out.println(arrayListMock.get(0));
		System.out.println(arrayListMock.size());
		arrayListMock.add("Test1");
		arrayListMock.add("Test2");
		System.out.println(arrayListMock.size());
		when(arrayListMock.size()).thenReturn(5);
		System.out.println(arrayListMock.size());
	}
	
	@Test
	public void spying() {
		ArrayList arrayListSpy = spy(ArrayList.class);
		arrayListSpy.add("Test0");  //without it throw error
		System.out.println(arrayListSpy.get(0));
		System.out.println(arrayListSpy.size());
		arrayListSpy.add("Test1");
		arrayListSpy.add("Test2");
		System.out.println(arrayListSpy.size());
		when(arrayListSpy.size()).thenReturn(5);
		System.out.println(arrayListSpy.size());
		
		arrayListSpy.add("Test4"); 
		System.out.println(arrayListSpy.size());
		
		verify(arrayListSpy).add("Test4");
	}
	
	
	
	

}
