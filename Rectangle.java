import java.lang.Math;

public class Rectangle {
        public double height;
        public double width;

        public double Area(){
                return this.height * this.width;
        }

        public double Perimeter(){
                return (this.height * 2) + (this.width * 2);
        }

        public double Diagonal() {
                double d = (this.height * this.height)+(this.width * this.width);
                return Math.sqrt(d);
        }
}
