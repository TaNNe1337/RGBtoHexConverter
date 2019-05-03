package com.qualitype.RGBtoHexConverter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class RGBTest {

	@Test
	public void testRGB() {
		final RGB rgb = new RGB(0, 0, 0);
		Assert.assertNotNull(rgb);
	}

	@Test
	public void testRGB_Constructor_hex_toLong() {
		final RGB rgb = new RGB("FFFFFFFF");
		Assert.assertEquals("FFFFFF", rgb.hex);
	}

	@Test
	public void testRGB_Constructor_hex_toShort() {
		final RGB rgb = new RGB("FFFF");
		Assert.assertEquals("FFFF00", rgb.hex);
	}

	@Test
	public void testRGB_Constructor_hext() {
		final RGB rgb = new RGB("FFFFFF");
		Assert.assertEquals("FFFFFF", rgb.hex);
	}

	@Test
	public void testRGB_Constructor_rgb_red_zero_high() {
		final RGB rgb = new RGB(300, 0, 0);
		Assert.assertEquals(0, rgb.getRed());
		Assert.assertEquals(0, rgb.getGreen());
		Assert.assertEquals(0, rgb.getBlue());
	}

	@Test
	public void testRGB_Constructor_rgb_red_zero_low() {
		final RGB rgb = new RGB(-5, 0, 0);
		Assert.assertEquals(0, rgb.getRed());
		Assert.assertEquals(0, rgb.getGreen());
		Assert.assertEquals(0, rgb.getBlue());
	}

	@Test
	public void testRGB_Constructor_rgb_green_zero_high() {
		final RGB rgb = new RGB(0, 300, 0);
		Assert.assertEquals(0, rgb.getRed());
		Assert.assertEquals(0, rgb.getGreen());
		Assert.assertEquals(0, rgb.getBlue());
	}

	@Test
	public void testRGB_Constructor_rgb_green_zero_low() {
		final RGB rgb = new RGB(0, -5, 0);
		Assert.assertEquals(0, rgb.getRed());
		Assert.assertEquals(0, rgb.getGreen());
		Assert.assertEquals(0, rgb.getBlue());
	}

	@Test
	public void testRGB_Constructor_rgb_blue_zero_high() {
		final RGB rgb = new RGB(0, 0, 300);
		Assert.assertEquals(0, rgb.getRed());
		Assert.assertEquals(0, rgb.getGreen());
		Assert.assertEquals(0, rgb.getBlue());
	}

	@Test
	public void testRGB_Constructor_rgb_blue_zero_low() {
		final RGB rgb = new RGB(0, 0, -5);
		Assert.assertEquals(0, rgb.getRed());
		Assert.assertEquals(0, rgb.getGreen());
		Assert.assertEquals(0, rgb.getBlue());
	}

	@Test
	public void testRGB_Constructor_rgb() {
		final RGB rgb = new RGB(125, 125, 125);
		Assert.assertEquals(125, rgb.getRed());
		Assert.assertEquals(125, rgb.getGreen());
		Assert.assertEquals(125, rgb.getBlue());
	}

	@Test
	public void testRGBToHex_white() {
		final RGB rgb = new RGB(255, 255, 255);
		final String white = rgb.RGBToHex();
		Assert.assertEquals("FFFFFF", white);
	}

	@Test
	public void testRGBToHex_black() {
		final RGB rgb = new RGB(0, 0, 0);
		final String black = rgb.RGBToHex();
		Assert.assertEquals("000000", black);
	}

	@Test
	public void testRGBToHex_red() {
		final RGB rgb = new RGB(255, 0, 0);
		final String red = rgb.RGBToHex();
		Assert.assertEquals("FF0000", red);
	}

	@Test
	public void testRGBToHex_green() {
		final RGB rgb = new RGB(0, 255, 0);
		final String green = rgb.RGBToHex();
		Assert.assertEquals("00FF00", green);
	}

	@Test
	public void testRGBToHex_blue() {
		final RGB rgb = new RGB(0, 0, 255);
		final String blue = rgb.RGBToHex();
		Assert.assertEquals("0000FF", blue);
	}

	@Test
	public void testRGBToHex_grey() {
		final RGB rgb = new RGB(125, 125, 125);
		final String green = rgb.RGBToHex();
		Assert.assertEquals("7D7D7D", green);
	}

	public void testHexToRGB_black() {
		final RGB rgb = new RGB("000000").HexToRGB();
		Assert.assertEquals("RGB [red=" + 0 + ", green=" + 0 + ", blue=" + 0 + "]", rgb.toString());
	}

	@Test
	public void testHexToRGB_white() {
		final RGB rgb = new RGB("FFFFFF").HexToRGB();
		Assert.assertEquals("RGB [red=" + 255 + ", green=" + 255 + ", blue=" + 255 + "]", rgb.toString());
	}

	@Test
	public void testHexToRGB_red() {
		final RGB rgb = new RGB("FF0000").HexToRGB();
		Assert.assertEquals("RGB [red=" + 255 + ", green=" + 0 + ", blue=" + 0 + "]", rgb.toString());
	}

	@Test
	public void testHexToRGB_green() {
		final RGB rgb = new RGB("00FF00").HexToRGB();
		Assert.assertEquals("RGB [red=" + 0 + ", green=" + 255 + ", blue=" + 0 + "]", rgb.toString());
	}

	@Test
	public void testHexToRGB_blue() {
		final RGB rgb = new RGB("0000FF").HexToRGB();
		Assert.assertEquals("RGB [red=" + 0 + ", green=" + 0 + ", blue=" + 255 + "]", rgb.toString());
	}

	@Test
	public void testHexToRGB_grey() {
		final RGB rgb = new RGB("7D7D7D").HexToRGB();
		Assert.assertEquals("RGB [red=" + 125 + ", green=" + 125 + ", blue=" + 125 + "]", rgb.toString());
	}

}
