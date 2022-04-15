package br.com.factorymethod.impl.logger;

import br.com.factorymethod.impl.logprinter.ConsoleLogPrinter;
import br.com.factorymethod.logger.Logger;
import br.com.factorymethod.logprinter.LogPrinter;

public class ConsoleLogCreator extends Logger {

	@Override
	public LogPrinter createLogPrinter() {
		return new ConsoleLogPrinter();
	}

}
