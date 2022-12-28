package com.divergentsl.predefined.consumer;

import java.util.function.Consumer;

public class HowToUseConsumer {

	public static void main(String[] args) {
		Consumer<String> print= str->System.out.println(str);
		print.accept("Divergent Software Labs");
	}

}
