package java8CodingQues;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeJava8 {

	public static void main(String[] args) {

		//1. Find even numbers from a list of integers
		List<Integer> even=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> op=even.stream().filter(n->n%2 ==0 ).collect(Collectors.toList());
		System.out.println(op);
		
		
		//2. Find all distinct elements in a list
		List<Integer> list=Arrays.asList(9, 1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 3);
		List<Integer> distinct=list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		//3. Get the first non-repeated character in a string
		String string="Java is awesome";
		Character ch=string.chars().mapToObj(c ->(char) c)
					.filter(c -> string.indexOf(c) ==string.lastIndexOf(c)).findFirst().orElse(null);
		
		System.out.println(ch);
		
		//other Method
		
		Character ch1=string.chars()
						.mapToObj(c -> (char) c)
						.collect(Collectors.groupingBy(
						c ->c, LinkedHashMap::new, Collectors.counting()))
						.entrySet().stream()
						.filter(e ->e.getValue()==1)
						.map(Map.Entry::getKey)
						.findFirst().orElse(null);
		System.out.println(ch1);
		
		
		//5. Find the maximum number in a list
		List<Integer> max=Arrays.asList(1, 2, 3, 4);
		int maximum=max.stream().max(Integer::compareTo).orElseThrow();
		System.out.println(maximum);
		
		//6. Find the minimum number in a list
		List<Integer> min=Arrays.asList(1, 2, 3, 4);
		int minimum=min.stream().min(Integer::compareTo).orElseThrow();
		System.out.println(minimum);
		
		//7.Sum all numbers in a list
		List<Integer> sum=Arrays.asList(1, 2, 3, 5, 6);
		int sums=sum.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sums);
		
		//8. Convert a list of strings to uppercase
		List<String> str=Arrays.asList("hello", "world");
		List<String> upper=str.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upper);
		
		//9. Get all numbers starting with digit '1'
		List<Integer> numbers=Arrays.asList(1, 2, 3, 5, 11, 17);
		List<String> result=numbers.stream().map(String::valueOf)
											.filter(s ->s.startsWith("1"))
											.collect(Collectors.toList()); 
		System.out.println(result);
		
		//Sort a list of strings alphabetically
		List<String> sort=Arrays.asList("venkat","hello", "world");
		List<String> sortOutput=sort.stream().sorted().collect(Collectors.toList());
		System.out.println(sortOutput);
		
		//11. Sort a list of integers in descending order
		List<Integer> desc=Arrays.asList(1, 2, 3, 5, 11, 17);
		List<Integer> descOutput=desc.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descOutput);
		
		//12. Find duplicate elements in a list
		List<Integer> duplicate=Arrays.asList(1, 2, 3, 5, 11, 17, 11, 5, 17);
		Set<Integer> set=new HashSet<>();
		List<Integer> duplicateOutput=duplicate.stream().filter(d -> !set.add(d)).collect(Collectors.toList());
		System.out.println(duplicateOutput);
		
		//13. Find common elements between two lists
		List<Integer> list1=Arrays.asList(1, 2, 3, 5, 11, 17, 654, 345, 87);
		List<Integer> list2=Arrays.asList(1, 2, 3, 5, 11, 17, 67, 54, 34);
		
		List<Integer> common=list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(common);
		
		//14. Group a list of strings by their length
		
	}

}
