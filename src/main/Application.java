package main;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompanyArmy ���� = new CompanyArmy();
		Command command = new ConcreteCommand(����);
		
		SpyCompanyArmy ����� = new SpyCompanyArmy();
		Command command2 = new ConcreteCommandSpy(�����);
		
		ArmySuperior ָ�ӹ� = new ArmySuperior();
		
		
		ָ�ӹ�.setCommand(command);
		ָ�ӹ�.startExecuteCommand();
		
		
		
		

		ָ�ӹ�.setCommand(command2);
		ָ�ӹ�.startExecuteCommand();
		
		
//		
//		ArmySuperior2 ָ�ӹ�2 = new ArmySuperior2();
//		ָ�ӹ�2.setCommand(command);
//		ָ�ӹ�2.startExecuteCommand();
		
		

	}

}
