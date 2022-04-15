package br.com.factorymethod.impl.logprinter;

import java.time.LocalDateTime;

import br.com.factorymethod.logprinter.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {

	@Override
	public void print(String message) {
		System.out.println(LocalDateTime.now() + ": " + message);
	}

}
