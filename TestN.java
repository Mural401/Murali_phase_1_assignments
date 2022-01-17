package accessmodifier.java;

public class TestN {
     protected long k = 2345L;
     public int b = 30;
     double s = 34.568;
     
     protected void methodprotected() {
    methodprivate();
     }
     
     public void methodpublic() {
    methodprivate();
     }
     
     void methoddefault() {
    methodprivate();
     }
     
     private void methodprivate() {
    System.out.println("Class TestN:Methodprotected");
    System.out.println("Value of protected var k" + k);
    System.out.println("Value of public var b" + b);
    System.out.println("Value of double s" + s);
     }
     
     
}
