package estudoJavaFuncionalStreams.programa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 15, 7, 18, 22);
		
		Stream<Integer> st1 = list.stream().map(p -> p *10);
		System.out.println(Arrays.toString(st1.toArray()));
		System.out.println();
		
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		System.out.println();
		
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(15).toArray()));
		System.out.println();
		
		//fibonacci
		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		System.out.println();
		
		List<Integer> novaLista = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(novaLista.toArray()));

	}

}
