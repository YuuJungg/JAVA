/*
 * Shape�� draw() �޼ҵ带 LIne, Circle, Rect Ŭ�������� ������ �°� �������̵�
 */

class Shape {
	public Shape next;
	public Shape() {
		next = null;
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Star extends Shape {
	public void draw() {
		System.out.println("Star");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��. �������ε�
	}
	public static void main(String[] args) {
		Line line = new Line();
		
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Star());
	}

}
