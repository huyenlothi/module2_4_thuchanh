import java.util.Scanner;

public class Rectangle {

        double width, height;

        public Rectangle() {
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle(double width){
            this.width = width;
            this.height = 1;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Rectangle {" + "width=" + width + "height =" + height + "}";
        }
    }

    class Ex14_1 {
        public static void main(String[] args) {
            Rectangle hc1 = new Rectangle(2.1);
            Rectangle hcn2 = new Rectangle();

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the width: ");
            double width = scanner.nextDouble();
            System.out.println("enter the height : ");
            double height = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("your rectangle \n" + rectangle.display());
            System.out.println("perimeter of the rectangle: " + rectangle.getPerimeter());
            System.out.println("area of the rectangle: " + rectangle.getArea());
        }
    }

