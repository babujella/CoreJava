package oopstask;

class Triangle extends Shape {
	public void area(float height, float breadth) {
		System.out.println("The area of the Triangle:" +((height+breadth)/2));
	}
	public void perimeter(int x,int y,int z) {
		System.out.println("The perimeter of the triangle:" +(x+y+z));
	}

}
