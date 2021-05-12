package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * @author woonji.kim
 */
public class CompareTheTriplets {
	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<>();
		int aSum = 0;
		int bSum = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				aSum++;
			}

			if (b.get(i) > a.get(i)) {
				bSum++;
			}
		}

		result.add(aSum);
		result.add(bSum);
		return result;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(compareTriplets(List.of(17, 28, 30), List.of(99, 16, 8)));
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//								.map(Integer::parseInt)
//								.collect(toList());
//
//		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//								.map(Integer::parseInt)
//								.collect(toList());
//
//		List<Integer> result = compareTriplets(a, b);
//
//		bufferedWriter.write(
//			result.stream()
//				  .map(Object::toString)
//				  .collect(joining(" "))
//				+ "\n"
//		);
//
//		bufferedReader.close();
//		bufferedWriter.close();
	}
}
