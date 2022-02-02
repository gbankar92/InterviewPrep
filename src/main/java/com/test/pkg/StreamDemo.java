package com.test.pkg;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {
		IntStream.of(1, 2, 3).forEach(x -> System.out.println("x" + x));
		OptionalDouble average = IntStream.iterate(1, x->x+1).limit(5).average();
		if(average.isPresent()) {
			System.out.println("Avg="+average.getAsDouble());
		}
		
		Employee e1=new Employee("a",25, 30000, "Pune");
		Employee e2=new Employee("b",30, 50000, "Mumbai");
		Employee e3=new Employee("c",33, 80000, "Banglore");
		
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(e1);emplist.add(e2);emplist.add(e3);
		
		double asDouble = emplist.stream().mapToDouble(Employee::getSal).average().getAsDouble();
		System.out.println("avg sal="+asDouble);
		
		double sum = emplist.stream().mapToDouble(Employee::getSal).sum();
		System.out.println("sum="+sum);
	}

}
