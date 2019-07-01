package com.qualitype.RGBtoHexConverter;

import org.junit.Assert;
import org.junit.Test;

public class RGBHexConverterTest {

	RGBHexConverter classUnderTest = new RGBHexConverter();

	@Test
	public void testRGBToHex_white() {
		final RGB rgb = new RGB(255, 255, 255);
		final String white = classUnderTest.RGBToHex(rgb);
		Assert.assertEquals("FFFFFF", white);
	}

	@Test
	public void testRGBToHex_black() {
		final RGB rgb = new RGB(0, 0, 0);
		final String black = classUnderTest.RGBToHex(rgb);
		Assert.assertEquals("000000", black);
	}

	@Test
	public void testRGBToHex_red() {
		final RGB rgb = new RGB(255, 0, 0);
		final String red = classUnderTest.RGBToHex(rgb);
		Assert.assertEquals("FF0000", red);
	}

	@Test
	public void testRGBToHex_green() {
		final RGB rgb = new RGB(0, 255, 0);
		final String green = classUnderTest.RGBToHex(rgb);
		Assert.assertEquals("00FF00", green);
	}

	@Test
	public void testRGBToHex_blue() {
		final RGB rgb = new RGB(0, 0, 255);
		final String blue = classUnderTest.RGBToHex(rgb);
		Assert.assertEquals("0000FF", blue);
	}

	@Test
	public void testRGBToHex_grey() {
		final RGB rgb = new RGB(125, 125, 125);
		final String green = classUnderTest.RGBToHex(rgb);
		Assert.assertEquals("7D7D7D", green);
	}

	@Test
	public void testHexToRGB_black() {
		final RGB rgb = classUnderTest.HexToRGB("000000");
		Assert.assertEquals(new RGB(0, 0, 0), rgb);
	}

	@Test
	public void testHexToRGB_white() {
		final RGB rgb = classUnderTest.HexToRGB("FFFFFF");
		Assert.assertEquals(new RGB(255, 255, 255), rgb);
	}

	@Test
	public void testHexToRGB_red() {
		final RGB rgb = classUnderTest.HexToRGB("FF0000");
		Assert.assertEquals(new RGB(255, 0, 0), rgb);
	}

	@Test
	public void testHexToRGB_green() {
		final RGB rgb = classUnderTest.HexToRGB("00FF00");
		Assert.assertEquals(new RGB(0, 255, 0), rgb);
	}

	@Test
	public void testHexToRGB_blue() {
		final RGB rgb = classUnderTest.HexToRGB("0000FF");
		Assert.assertEquals(new RGB(0, 0, 255), rgb);
	}

	@Test
	public void testHexToRGB_grey() {
		final RGB rgb = classUnderTest.HexToRGB("7D7D7D");
		Assert.assertEquals(new RGB(125, 125, 125), rgb);
	}

}
