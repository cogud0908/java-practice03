package prob6.refactoring;

import java.util.Scanner;

abstract class Calc // 추상클래스
{
	protected int a;
	protected int b;
	
	public void setValue(int a, int b)
	{
		this.a = a; this.b = b;
	}

	public abstract int calculate(); // 추상메소드
}

class Add extends Calc
{
	@Override
	public int calculate() // 오버라이딩
	{
		return a+b;
	}
}

class Sub extends Calc
{
	@Override
	public int calculate() // 오버라이딩
	{
		return a-b;
	}
}

class Mul extends Calc
{
	@Override
	public int calculate() // 오버라이딩
	{
		return a*b;
	}
}

class Div extends Calc
{
	@Override
	public int calculate() // 오버라이딩
	{
		return a/b;
	}
}


public class CalcApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("사칙연산을 입력하세요 : ex) 3 + 4 (문자 사이에 띄워쓰세요!)");
		String []str = new String[3];
		String buffer = sc.nextLine();
		
		str = buffer.split(" ");
		
		if(str[1].equals("+"))
		{
			Add add = new Add();
			add.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
			System.out.println(add.calculate());
		}
		else if(str[1].equals("-"))
		{
			Sub sub = new Sub();
			sub.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
			System.out.println(sub.calculate());
		}
		else if(str[1].equals("*"))
		{
			Mul mul = new Mul();
			mul.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
			System.out.println(mul.calculate());
		}
		else if(str[1].equals("/"))
		{
			Div div = new Div();
			div.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
			System.out.println(div.calculate());
		}
		else
			System.out.println("알수없는 연산 입니다.");
	}

}
