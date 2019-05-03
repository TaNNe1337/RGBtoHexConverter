package com.qualitype.RGBtoHexConverter;
public class RGB {

        public int red;

        public int green;

        public int blue;

 

        public RGB(int red, int green, int blue) {

            this.red = red;

            this.green = green;

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

            if (this == obj)

                return true;

            if (obj == null)

                return false;

            if (getClass() != obj.getClass())

                return false;

            RGB that = (RGB) obj;

            if (blue != that.blue)

                return false;

            if (green != that.green)

                return false;

            if (red != that.red)

                return false;

            return true;

        }

}