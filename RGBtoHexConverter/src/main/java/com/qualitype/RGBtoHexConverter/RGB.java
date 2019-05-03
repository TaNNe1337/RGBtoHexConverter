package com.qualitype.RGBtoHexConverter;

public class RGB {

	public int red;
	public int green;
	public int blue;
	public String hex;

	public RGB(String hex) {
		this.hex = hex;
		final int length = this.hex.length();
		if (length < 6) {
			for (int i = length; i < 6; i++) {
				this.hex += "0";
			}
		} else if (length > 6) {
			this.hex = this.hex.substring(0, 6);
		}

	}

	public RGB(int red, int green, int blue) {
		if (red <= 255 && red >= 0) {
			this.red = red;
		} else {
			this.red = 0;
		}
		if (green <= 255 && green >= 0) {
			this.green = green;
		} else {
			green = 0;
		}
		if (blue <= 255 && blue >= 0) {
			this.blue = blue;
		} else {
			blue = 0;
		}

	}

	public String RGBToHex() {
		final String formatString = "%02X";
		final String redHex = String.format(formatString, red);
		final String greenHex = String.format(formatString, green);
		final String blueHex = String.format(formatString, blue);
		return redHex + greenHex + blueHex;

	}

	public RGB HexToRGB() {
		final String redString = hex.substring(0, 2);
		final String greenString = hex.substring(2, 4);
		final String blueString = hex.substring(4, 6);
		red = Integer.parseInt(redString.toLowerCase(), 16);
		green = Integer.parseInt(greenString.toLowerCase(), 16);
		blue = Integer.parseInt(blueString.toLowerCase(), 16);
		return this;

	}

	public int getRed() {
		return red;
	}

	public RGB red(int newRed) {
		setRed(newRed);
		return this;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public RGB green(int newGreen) {
		setGreen(newGreen);
		return this;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public RGB blue(int newBlue) {
		setBlue(newBlue);
		return this;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	@Override

	public String toString() {
		return "RGB [red=" + red + ", green=" + green + ", blue=" + blue + "]";

	}

	@Override

	public int hashCode() {

		return 13 * red + 7 * green + 3 * red;

	}

	@Override

	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		final RGB that = (RGB) obj;

		if (blue != that.blue) {
			return false;
		}

		if (green != that.green) {
			return false;
		}

		if (red != that.red) {
			return false;
		}

		return true;

	}

}