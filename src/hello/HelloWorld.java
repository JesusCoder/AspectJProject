package hello;

public class HelloWorld extends Welcome implements Greeter{
	
	public static void main(String[] args) {
		new HelloWorld().sayHello();
		new HelloWorld().greet();
		new HelloWorld().sayGoodbye();
		System.out.println("The end!");
	}
	
	private int msgNumber;
	
	public void sayHello(){
		System.out.println("Hello World!");
	}

	@Override
	public void greet() {
		System.out.println("This is a msg from greet() method in HelloWorld.java class!");
	}

	@Override
	public void sayGoodbye() {
		System.out.println("This is a msg from sayGoodbye() method in HelloWorld.java class!");
	}

	public int getMsgNumber() {
		return msgNumber;
	}

	public void setMsgNumber(int msgNumber) {
		this.msgNumber = msgNumber;
	}

}
