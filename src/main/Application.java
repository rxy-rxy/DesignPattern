package main;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompanyArmy 三连 = new CompanyArmy();
		Command command = new ConcreteCommand(三连);
		
		SpyCompanyArmy 侦察连 = new SpyCompanyArmy();
		Command command2 = new ConcreteCommandSpy(侦察连);
		
		ArmySuperior 指挥官 = new ArmySuperior();
		
		
		指挥官.setCommand(command);
		指挥官.startExecuteCommand();
		
		
		
		

		指挥官.setCommand(command2);
		指挥官.startExecuteCommand();
		
		
//		
//		ArmySuperior2 指挥官2 = new ArmySuperior2();
//		指挥官2.setCommand(command);
//		指挥官2.startExecuteCommand();
		
		

	}

}
