interface Area {

	float area();
}

class Triangle implements Area {

	int l,h;
	
	Triangle(int x, int y) {
		l=x;
		h=y;
	}

	public float area() {
		return (l*h/2);
	}
}

class Square implements Area {

	int l;
	
	Square(int x) {
		l=x;
	}
	
	public float area() {
		return (l*l);
	}
}
 
public class S6Assignment1 {

	 public static void main(String[] args) 
          { 
                Triangle t = new Triangle(5,6);
				System.out.println("Area of Triable is - " + t.area()); 

				Square s = new Square(5);
				System.out.println("Area of Sqaure is - " + s.area());
          }
}