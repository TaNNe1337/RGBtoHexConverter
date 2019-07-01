package com.qualitype.RGBtoHexConverter;

public class RGBHexConverter {

	public String RGBToHex(RGB rgb) {
		final String formatString = "%02X";
		final String redHex = String.format(formatString, rgb.getRed());
		final String greenHex = String.format(formatString, rgb.getGreen());
		final String blueHex = String.format(formatString, rgb.getBlue());
		return redHex + greenHex + blueHex;

	}

	public RGB HexToRGB(String hex) {
		final String redString = hex.substring(0, 2);
		final String greenString = hex.substring(2, 4);
		final String blueString = hex.substring(4, 6);
		final int red = Integer.parseInt(redString.toLowerCase(), 16);
		final int green = Integer.parseInt(greenString.toLowerCase(), 16);
		final int blue = Integer.parseInt(blueString.toLowerCase(), 16);
		return new RGB(red, green, blue);

	}
}
