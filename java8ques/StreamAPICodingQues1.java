package java8CodingQues;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPICodingQues1 {

	public static void main(String[] args) {

		//Problem: Given a list of integers, return a list containing only even numbers.
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		List<Integer> even=numbers.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
		System.out.println(even);
		
		//Problem: Find the maximum value in a list of integers.
		Optional<Integer> max=numbers.stream().max(Integer::compare);
		System.out.println(max);
		
		//Problem: Calculate the sum of elements in a list of integers
		int sum=numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		//Problem: Convert all strings in a list to uppercase.
		
		List<String> names= Arrays.asList("Alice", "Bob", "charles");
		List<String> upperNames=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperNames);
		
		//Problem: Sort a list of integers in ascending order.
		List<Integer> nums=Arrays.asList(1,2,4,5,2,7,6);
		List<Integer> sortedNumbers=nums.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
		//Problem: Count the number of elements in a list that are greater than 5.
		
		long count=nums.stream().filter(n -> n > 5).count();
		System.out.println(count);
		
		//Problem: Get a list of distinct elements from a list of integers.
		
		List<Integer> distinctNumbers=nums.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNumbers);
		
		//Problem: Reduce a list of integers to their sum.
		
		int integersSum=nums.stream().reduce(0, Integer::sum);
		System.out.println(integersSum);
		
		//Problem: Return any element from a list of integers.
		
		Optional<Integer> findAny=nums.stream().findAny();
		System.out.println(findAny);
		
		//Problem: Extract first names from a list of full names.
		List<String> fullNames=Arrays.asList("venkata rami reddy", "Mari Selvam", "Mano Ranjan");
		List<String> firstNames=fullNames.stream().map(name -> name.split(" ")[0]).collect(Collectors.toList());
		System.out.println(firstNames);
		
		//Problem: Check if all numbers in a list are positive.
		boolean positive=nums.stream().allMatch(n -> n>0);
		System.out.println(positive);
		
		//Problem: Check if there are no negative numbers in a list.
		boolean negative=nums.stream().noneMatch(n -> n <0);
		System.out.println(negative);
		
		//Problem: Find the first element in a list of integers.
		Optional<Integer> first=nums.stream().findFirst();
		System.out.println(first);
		
		//Problem: Flatten a nested list structure.
		List<List<Integer>> nestedInteger=Arrays.asList(Arrays.asList(1,2), Arrays.asList(3, 4, 5));
		List<Integer> flattenList=nestedInteger.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flattenList);
		
		//Problem: Group users by age.
		
		List<User> usersAge=Arrays.asList(new User("Alice", 25),
	            new User("Bob", 30),
	            new User("Charlie", 25),
	            new User("David", 30),
	            new User("Eve", 35));
		Map<Integer, List<User>> groupUsers=usersAge.stream().collect(Collectors.groupingBy(User::getAge));
		
		groupUsers.forEach((age, userList) ->{
			System.out.println(" Age "+ age + " : userList" + userList);
		});
		
		
		//Problem: Print elements of a stream during processing without altering the stream.
		List<Integer> number=Arrays.asList(1,2,3,4,5,6);
		List<Integer> peeknums=number.stream().peek(System.out::println).collect(Collectors.toList());
		System.out.println(peeknums);
		
		//Problem: Limit the output to the first 3 elements of the list.
		
		List<Integer> limitNumber=number.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitNumber);
		
		//Problem: Skip the first 2 elements of a list and return the rest.
		
		List<Integer> skipElements=number.stream().skip(2).collect(Collectors.toList());
		System.out.println(skipElements);
		
		//Problem: Convert a list of integers to a set to remove duplicates.
		Set<Integer> listToSet=number.stream().collect(Collectors.toSet());
		System.out.println(listToSet);
		
		//Problem: Get summary statistics for a list of integers.
		IntSummaryStatistics stats=number.stream().mapToInt(Integer::intValue).summaryStatistics();
		System.out.println(stats);
	}

}
