package day15;

public class Calculator implements ICalculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return (a-b);
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return (a*b);
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return (a/b);
	}

}
