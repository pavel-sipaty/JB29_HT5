package by.jb29.mod1.les07.task3;

public class Main {

	public static void main(String[] args) {

		Student[] group = new Student[10];

		group[0] = new Student("������ �.�.", 10, new int[] { 9, 9, 9, 9, 10 });
		group[1] = new Student("������ �.�.", 2, new int[] { 9, 9, 10, 9, 10 });
		group[2] = new Student("������ �.�.", 3, new int[] { 5, 6, 7, 9, 10 });
		group[3] = new Student("����� �.�.", 4, new int[] { 2, 6, 4, 8, 7 });
		group[4] = new Student("�������� �.�.", 5, new int[] { 9, 8, 8, 8, 8 });
		group[5] = new Student("��������� �.�.", 1, new int[] { 9, 9, 9, 9, 10 });
		group[6] = new Student("��������� �.�.", 6, new int[] { 4, 5, 9, 9, 10 });
		group[7] = new Student("�������� �.�.", 2, new int[] { 7, 6, 9, 5, 7 });
		group[8] = new Student("������ �.�.", 7, new int[] { 9, 5, 4, 9, 10 });
		group[9] = new Student("�������� �.�.", 1, new int[] { 10, 10, 10, 10, 10 });

		
		Student.marks(group);
		
	

	}

}
