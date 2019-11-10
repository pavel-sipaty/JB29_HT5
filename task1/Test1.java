package by.jb29.mod1.les07.task1;


/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.*/


public class Test1 {
	
	public int a;
	public int b;
	
	
	
	public int sum(int a, int b) {
		
		int sum = a + b;
		return sum;
		
	}

/////////////////////////////////////////////////////////////
	
	public int max(int a, int b) {
		
		int max = a;
		
		if(a > b) {
			max = a;
		}else if(b > a) {
			max = b;
		}
		
		return max;
		
	}
	
///////////////////////////////////////////////////////////
	
	public void printSum(int sum) {
		
		System.out.println("Сумма равна " + sum);
		
	}
 
///////////////////////////////////////////////////////////
	
	public void printMax(int max) {
		
		System.out.println("Максимальное число - " + max);
		
	}
	
}