package InnerClass;

//Top level class definition
class MyOuterClassDemo {
 private int myVar= 1;

 // inner class definition
 class MyInnerClassDemo {
    public void seeOuter () {
       System.out.println("Value of myVar is :" + myVar);
    }
  } // close inner class definition
} // close Top level class definition
