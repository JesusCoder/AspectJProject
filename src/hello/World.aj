/**
 * 
 */
package hello;

/**
 * @author SteveSun
 *
 */
public aspect World {
pointcut greeting() : execution(* HelloWorld.sayHello(..));
before() : greeting() {
	System.out.println("This is a msg that gets printed out each time BEFORE HelloWorld.sayHello() is called.!");
}
after() returning : greeting() {
	System.out.println("This is a msg that gets printed out each time AFTER HelloWorld.sayHello() is called.!");
}
}
