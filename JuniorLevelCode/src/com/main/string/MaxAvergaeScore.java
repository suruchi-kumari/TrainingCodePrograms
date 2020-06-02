package com.main.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxAvergaeScore {

	public static void main(String[] args) {


		String scores[][] = {{"Ram","155"}, 
				{"Shyam","145"},
				{"Ram","156"},
				{"Balram","159"},
				{"Balram","150"},
				{"Ram","135"},
				{"Mira","156"},
				{"Mira","152"},
				{"Shyam","155"}};


		Map<Object, Double> scoreMap = Arrays.stream(scores)
				.collect(
						Collectors.groupingBy(i -> i[0], 
								Collectors.averagingInt(i -> Integer.parseInt(i[1])
										)));

		String winnerName = scoreMap.entrySet().stream()
				.max(Comparator.comparingDouble(e -> e.getValue()))
				.get().getKey().toString();
		
		String winnerValue = scoreMap.entrySet().stream()
				.max(Comparator.comparingDouble(e -> e.getValue()))
				.get().getValue().toString();
		
		System.out.println(winnerName+" has highest maximum :"+winnerValue);

	}
}
