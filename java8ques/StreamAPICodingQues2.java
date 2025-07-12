package java8CodingQues;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPICodingQues2 {

	public static void main(String[] args) {

		/*
		 * 1) Given a list of integers, find out all the even numbers that exist in the
		 * list using Stream functions?
		 */
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		List<Integer> evenNumbers=numbers.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		/*
		 * 2) Given a list of integers, find out all the numbers starting with 1 using
		 * Stream functions?
		 */		
		
		List<Integer> myList=Arrays.asList(10,15,8,49,25,98,32);
		myList.stream().map(s ->s+"").filter(s ->s.startsWith("1")).forEach(System.out::println);
		
		/*
		 * 3) How to find duplicate elements in a given integers list in java using
		 * Stream functions?
		 */
		
		List<Integer> input=Arrays.asList(1,2, 3, 4,2, 3, 6);
		Set<Integer> set=new HashSet<>();
		input.stream().filter(s ->!set.add(s)).forEach(System.out::println);
		
		System.out.println(" ");
		//Or you can also use below
		
		Set<Integer> set1=new HashSet<>(input);
		
		List<Integer> uniqueElements=set1.stream().collect(Collectors.toList());
		uniqueElements.forEach(System.out::println);
		
		//Or you can also use below
		
		int[] ipt= {1,2,4,2,5,6,6};
		List<Integer> unique=Arrays.stream(ipt).boxed().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		//4) Given the list of integers, find the first element of the list using Stream functions?
		
		List<Integer> findFirst = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		findFirst.stream().findFirst().ifPresent(System.out::println);
		
		/*
		 * 5) Given a list of integers, find the total number of elements present in the
		 * list using Stream functions?
		 */
		
		List<Integer> findTotalElements=Arrays.asList(10, 20, 30, 4, 5, 6);
		long count=findTotalElements.stream().count();
		System.out.println(count);
		
		/*
		 * 6) Given a list of integers, find the maximum value element present in it
		 * using Stream functions?
		 */
		
		List<Integer> findMax=Arrays.asList(10, 20, 30, 4, 5, 6);
		long max=findMax.stream().max(Integer::compare).get();
		System.out.println(max);
		
		/*
		 * 7) Given a String, find the first non-repeated character in it using Stream
		 * functions
		 */
		
		String inp = "Java articles are Awesome";
		char ch1=inp.chars().mapToObj(c -> (char) c).filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().orElse(null);
		System.out.println(ch1);
		
		//8) Given a String, find the first repeated character in it using Stream functions?
		
		String inp1 = "Java articles are Awesome";
		Set<Character> seenCharacters=new HashSet<>();
		
		char first=inp1.chars().mapToObj(c ->(char) c).filter(c ->!seenCharacters.add(c)).findFirst().orElse(null);
		System.out.println(first);
		
		
		/*
		 * 9) Given a list of integers, sort all the values present in it using Stream
		 * functions
		 */
		
		List<Integer> sort=Arrays.asList(9,8,7,5,4,3,1);
		sort.stream().sorted().forEach(System.out::println);
		List<Integer> sorted=sort.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		/*
		 * 10) Given a list of integers, sort all the values present in it in descending
		 * order using Stream functions?
		 */
		
		List<Integer> descending=Arrays.asList(1,2,4,5,7,4,0);
		descending.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		List<Integer> desc=descending.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(desc);
		
		/*
		 * 11) Given an integer array nums, return true if any value appears at least
		 * twice in the array, and return false if every element is distinct.
		 */
		
		
		int[] nums= {1, 2, 4, 5 , 6, 6, 7};
		
		List<Integer> integer=Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		Set<Integer> distinctSet=new HashSet<>(integer);
		if(distinctSet.size() == integer.size()) {
			System.out.println("false");
		} else{
			System.out.println("true");
		}
		
		
		//12) How will you get the current date and time using Java 8 Date and Time API?
		
		System.out.println("current Local Date: "+ java.time.LocalDate.now());
		System.out.println("Current Local time: "+ java.time.LocalTime.now());
		System.out.println("Current Local Date time: " + java.time.LocalDateTime.now());
		
		//13) Write a Java 8 program to concatenate two Streams?
		
		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");
		 
		Stream<String> concatenate=Stream.concat(list1.stream(), list2.stream());
		concatenate.forEach(str ->System.out.println(str+ " "));
		
		
		//14) Java 8 program to perform cube on list elements and filter numbers greater than 50.
		
		List<Integer> integerList=Arrays.asList(4,5,6,7,1,2,3);
		
		integerList.stream().map(i -> i*i*i).filter(i -> i>50).forEach(System.out::println);
		
		//15) Write a Java 8 program to sort an array and then convert the sorted array into Stream?
		
		int arr[] = { 99, 55, 203, 99, 4, 91 };
		Arrays.stream(arr).sorted().forEach(System.out::println);
		
		//16) How to use map to convert object into Uppercase in Java 8?
		
		List<String> lowercase=Arrays.asList("aa", "bb", "cc");
		List<String> upperCase=lowercase.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCase);
		
		//18) How to count each element/word from the String ArrayList in Java8?
		
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> wordCount=words.stream().collect(Collectors.groupingBy(word ->word, Collectors.counting()));
        
        wordCount.forEach((word, counts) ->
        		System.out.println("word: " + word + " counts: "+counts));

		
        //19) How to find only duplicate elements with its count from the String ArrayList in Java8?
        
        List<String> Duplicate = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        
        Map<String, Long> counts=Duplicate.stream().filter(x ->Collections.frequency(Duplicate, x)>1)
        						.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        
        System.out.println(counts);

        
        //21) Write a Program to find the Maximum element in an array?
        
        int[] arr2= {1,2,3,4,5,6};
        int max2=Arrays.stream(arr2).max().getAsInt();
        System.out.println(max2);
        
        List<Integer> elements=Arrays.asList(1,2,34,5,6,7);
        Optional<Integer> MaxElement=elements.stream().sorted(Collections.reverseOrder()).findFirst();
        System.out.println(MaxElement);
        
        
	}

}
