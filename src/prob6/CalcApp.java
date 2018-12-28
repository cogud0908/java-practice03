package prob6;

import java.util.Scanner;

abstract class Calc
{
	protected int a;
	protected int b;
	
	public void setValue(int a, int b)
	{
		this.a = a; this.b = b;
	}
}

class Add extends Calc
{
	public int calculate()
	{
		return a+b;
	}
}

class Sub extends Calc
{
	public int calculate()
	{
		return a-b;
	}
}

class Mul extends Calc
{
	public int calculate()
	{
		return a*b;
	}
}

class Div extends Calc
{
	public int calculate()
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
	}

}
