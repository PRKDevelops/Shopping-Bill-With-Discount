import java.util.*;
public class TestClass {
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		float Pen = sc.nextFloat();
		float Scale = sc.nextFloat();
		float Pencil = sc.nextFloat();
		float Notebook = sc.nextFloat();
		float Total = Pen + Scale + Pencil + Notebook;
		System.out.println("Total Bill :-"+Total);
		float NewTotal = Total +(-0.10f * Total);
		System.out.println("Total Bill with 10% Discount :-"+NewTotal);
	}
}