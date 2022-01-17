package innerclass;
class Car {
          String carName;
          String carType;

          // assign values using constructor
          public Car(String name, String type) {
              this.carName = name;
              this.carType = type;
          }

          // private method
          private String getCarName() {
              return this.carName;
          }
     void vehicle(){
      // inner class
          class Engine {
              String engineType;
              void setEngine() {
             

                 // Accessing the carType property of Car
                  if(carType.equals("4WD")){

                      // Invoking method getCarName() of Car
                      if(getCarName().equals("Crysler")) {
                          engineType = "Smaller";
                      } else {
                         engineType = "Bigger";
                      }

                  }else{
                      engineType = "Bigger";
                  }
              }
              
              String getEngineType(){
                  return engineType;
              }
          }
     
      
        Engine engine = new Engine();
            engine.setEngine();
            System.out.println("Engine Type for 8WD= " + engine.getEngineType());
           Engine c2engine = new Engine();
            c2engine.setEngine();
            System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
     }
     }

public class Method_innerclass {


    public static void main(String[] args) {
      
         
      
              Car car1 = new Car("Mazda", "8WD");
  car1.vehicle();
           
              Car car2 = new Car("Crysler", "4WD");
              car2.vehicle(); 
          }
      }