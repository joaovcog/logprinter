package br.com.factorymethod.logger;

import br.com.factorymethod.logprinter.LogPrinter;

public abstract class Logger {
	
	protected abstract LogPrinter createLogPrinter();
	
	public void log(String message) {
		LogPrinter logPrinter = createLogPrinter();
		
		logPrinter.print(message);
	}
	
}
