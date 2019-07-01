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

}
