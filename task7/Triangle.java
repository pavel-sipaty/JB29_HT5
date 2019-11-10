package by.jb29.mod1.les07.task7;



/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/

public class Triangle {
	
	private double sideA;
	private double sideB;
	private double sideC;
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	
	
	public Triangle() {
		sideA = 1;
		sideB = 1;
		sideC = 1;
	}
	
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	public void setX1(int x1) {
		this.x1 = x1;
	}
	
	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	public void setX2(int x2) {
		this.x2 = x2;
	}
	
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void setX3(int x3) {
		this.x3 = x3;
	}
	
	public void setY3(int y3) {
		this.y3 = y3;
	}
	
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public int getX1() {
		return x1;
	}
	
	public int getY1() {
		return y1;
	}
	
	public int getX2() {
		return x2;
	}
	
	public int getY2() {
		return y2;
	}
	
	public int getX3() {
		return x3;
	}
	
	public int getY3() {
		return y3;
	}
	
	public double getSideA() {
		return sideA;
	}
	
	public double getSideB() {
		return sideB;
	}
	
	public double getSideC() {
		return sideC;
	}
	
	
	//периметр	
	public double perim(double sideA, double sideB, double sideC) {
		double p;
		p = sideA + sideB + sideC;
		return p;
	}
	
	public void perimPrint() {
		System.out.println("Периметр треугольника равен " + perim(getSideA(), getSideB(), getSideC()));
	}
	
	//площадь
	public double square(double sideA, double sideB, double sideC) {
		double square;
		double polper;
		polper = (sideA + sideB + sideC) / 2;
		square = Math.sqrt(polper * (polper - sideA) * (polper - sideB) * (polper - sideC));
		
		return square;
	}
	
	public void squarePrint() {
		System.out.println("Площадь треугольника равна " + square(getSideA(), getSideB(), getSideC()));
	}
	
	//нахождение медианы
	public double coordX(int x1, int x2, int x3) {
		double x;
		x = (double)(x1 + x2 + x3) / 3;
		return x;
	}
	
	public double coordY(int y1, int y2, int y3) {
		double y;
		y = (double)(y1 + y2 + y3) / 3;
		return y;
	}
	
	public void printCoordMedian() {
		System.out.println("Координаты точки пересечения медиан треугольник: [" + coordX(getX1(), getX2(), getX3()) + ", " + coordY(getY1(), getY2(), getY3()) + "].");
	}
	
	
	
	
	
	
	
	
	
	
	
}
