package accessmodifier.java;

import accessmodifier.java.TestM;
import accessmodifier.java.TestN;

public class TestP {

public static void main(String[] args) {

new TestM().methodpublic();
new TestM().methoddefault();
new TestM().methodprotected();
System.out.println("Variables of TestM class");


new TestN().methodpublic();
new TestN().methodprotected();
new TestN().methoddefault();
System.out.println("Variables of TestN class");
     

}

public void methodpublic() {
System.out.println("Class TestP:MethodPublic");
}

protected void methodprotected() {
System.out.println("Class TestP:MethodProtected");

}

void methodefault() {
System.out.println("Class TestP:MethodDefault");
}

private void methodprivate() {
System.out.println("Class TestP:MethodPrivate");
}
}
