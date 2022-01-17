package accessmodifier.java;

import accessmodifier.java.TestM;
import accessmodifier.java.TestN;

public class TestZ extends TestM {

public static void main(String[] args) {
new TestM().methodpublic();
System.out.println("Variable of TestM Class");
System.out.println("\n");

System.out.println("\n");
new TestN().methodpublic();
System.out.println("Variable of TestN Class");
System.out.println("\n");

System.out.println("\n");
System.out.println("Variable of TestX Class");
System.out.println("Variable of b:" +new TestX().b);
System.out.println("Variable of p:" +new TestX().p);
System.out.println("Variable of c:" +new TestX().c);



}

}
