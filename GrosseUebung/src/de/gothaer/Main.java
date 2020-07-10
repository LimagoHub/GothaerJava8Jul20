package de.gothaer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		new Main().run();

	}

	private void run() {
//		String fileName = "blindtext.txt";
//
//		//read file into stream, try-with-resources
//		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
//
//			String myFile = stream.collect(Collectors.joining("\n"));
//			
//			Map<Object, Long> ergebnismap = myFile
//			.chars()
//			.mapToObj(c->Character.valueOf((char) c))
//			.collect(Collectors.groupingBy( Function.identity(), Collectors.counting()));
//			
//			ergebnismap.forEach((k,v)->System.out.println(String.format("Anzahl des Zeichens '%s' ist %s.", k,v)));
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		IntStream is = IntStream.of(10,20,30);
//		
//		int max = is.max().orElseThrow(()->new ArrayIndexOutOfBoundsException());
//		
		
		IntStream is = IntStream.rangeClosed(1, 1000);
		long anzahl = is.filter(i -> i % 11 == 0).filter(i-> i % 3 == 0).sum();
		System.out.println(anzahl);
	}
	
	

}
