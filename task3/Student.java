package by.jb29.mod1.les07.task3;

/*�������� ����� � ������ Student, ���������� ����: ������� � ��������, ����� ������, ������������
(������ �� ���� ���������). �������� ������ �� ������ ��������� ������ ����. �������� ����������� ������
������� � ������� ����� ���������, ������� ������, ������ ������ 9 ��� 10.*/

public class Student {

	private String name;
	private int group;
	private int[] progress = new int[5];

	public Student() {

	}

	public Student(String _name, int _group, int[] _progress) {
		name = _name;
		group = _group;
		progress = _progress;
	}

	public void setName(String addName) {
		name = addName;
	}

	public void setGroup(int addGroup) {
		group = addGroup;
	}

	public void setProgress(int[] addProgress) {
		progress = addProgress;
	}

	public String getName() {
		return name;
	}

	public int getGroup() {
		return group;
	}

	public int[] getProgress() {
		return progress;
	}

////////////////////////////////

	public void marksCheck(Student[] group) {

		for (int i = 0; i < group.length; i++) {
			if (progress[i] >= 9) {
				System.out.println("����� ����������:");
				System.out.println(name + " " + group);
			}
		}

	}

////////////////////////////////////////////////////

	public static void marks(Student[] mas) {
		System.out.println("������� ���������:");
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			int count = 0;

			for (int j = 0; j < mas[i].getProgress().length; j++) {

				if (mas[i].getProgress()[j] >= 9) {

					count++;
					if (count == 5) {

						System.out.print(mas[i].getName() + ", ������ �" + mas[i].getGroup());
						System.out.println();
					}

				}

			}

		}
	}
}
