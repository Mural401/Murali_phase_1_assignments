package accessmodifier.java;

public class TestM {
private int a = 20;        //private variable
long d = 45678L;            //default variable
protected float f = 34.56f;   //protected variable

public void methodpublic() {      //public method
methodprivate();
}

void methoddefault() {              //default method
methodprivate();
}

protected void methodprotected() {           //protected method
methodprivate();
}

private void methodprivate() {               //private method
System.out.println("Class TestM: methodprotected");
System.out.println("Value of private var a" + a);
System.out.println("Value of long d" + d);
System.out.println("Value of protected var f" + f);

}

}

