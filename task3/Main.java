package by.jb29.mod1.les07.task3;

public class Main {

	public static void main(String[] args) {

		Student[] group = new Student[10];

		group[0] = new Student("Пупкин П.П.", 10, new int[] { 9, 9, 9, 9, 10 });
		group[1] = new Student("Гуриев П.П.", 2, new int[] { 9, 9, 10, 9, 10 });
		group[2] = new Student("Степин П.П.", 3, new int[] { 5, 6, 7, 9, 10 });
		group[3] = new Student("Разин П.П.", 4, new int[] { 2, 6, 4, 8, 7 });
		group[4] = new Student("Владыкин С.К.", 5, new int[] { 9, 8, 8, 8, 8 });
		group[5] = new Student("Румянцева Т.П.", 1, new int[] { 9, 9, 9, 9, 10 });
		group[6] = new Student("Деревянко Р.У.", 6, new int[] { 4, 5, 9, 9, 10 });
		group[7] = new Student("Кириллик Е.В.", 2, new int[] { 7, 6, 9, 5, 7 });
		group[8] = new Student("Ватчев В.Г.", 7, new int[] { 9, 5, 4, 9, 10 });
		group[9] = new Student("Медикова А.Н.", 1, new int[] { 10, 10, 10, 10, 10 });

		
		Student.marks(group);
		
	

	}

}
