package com.qualitype.RGBtoHexConverter;

public class RGB {

	private int red;
	private int green;
	private int blue;

	/**
	 * @param red
	 * @param green
	 * @param blue
	 *
	 *              if one parameter is smaller than 0 or greater than 255 it will
	 *              be set to 0
	 */
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