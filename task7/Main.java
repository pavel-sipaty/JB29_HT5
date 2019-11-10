package by.jb29.mod1.les07.task7;

public class Main {

	public static void main(String[] args) {
		Triangle tri = new Triangle(0, 4, 2, 3, 8, 4);
		
		
		int x1 = tri.getX1();
		int x2 = tri.getX2();
		int x3 = tri.getX3();
		
		tri.coordX(x1, x2, x3);
		
		
		int y1 = tri.getY1();
		int y2 = tri.getY2();
		int y3 = tri.getY3();
		
		tri.coordY(y1, y2, y3);
		tri.printCoordMedian();
		
		
		Triangle tri2 = new Triangle(4, 5, 7);
		tri2.perim(tri.getSideA(), tri.getSideB(), tri.getSideC());
		tri2.perimPrint();
		
		tri2.square(tri.getSideA(), tri.getSideB(), tri.getSideC());
		tri2.squarePrint();

	}

}
