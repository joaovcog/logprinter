package br.com.factorymethod;

import br.com.factorymethod.impl.logger.ConsoleLogCreator;
import br.com.factorymethod.logger.Logger;

public class LogEntry {

	public static void main(String[] args) {
		Logger logger = new ConsoleLogCreator();
		
		logger.log("Teste");
		logger.log("Factory Method");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		logger.log("Design Patterns");
	}

}
