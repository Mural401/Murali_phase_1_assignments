package accessmodifier.java;

public class TestX {
private int x = 35;
long b = 245678L;
protected float p = 23.5f;
public char c = 'D';

public void methodpublic() {
methodprivate();
}

void methoddefault() {
methodprivate();
}

protected void methodprotected() {
methodprivate();
}

private void methodprivate() {
System.out.println("Class TestM:MethodProtected");
System.out.println("Value of private x" + x);
System.out.println("Value of default b" + b);
System.out.println("Value of protected p" + p);
   System.out.println("Value of public c" + c);
}



}

