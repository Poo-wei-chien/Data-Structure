package L02_generics.Question1;

public class MyGeneric <E>{
    //Declare a variable called e for the type parameter
    private E e;

    //Create a no-arg constructor
    public MyGeneric(){};

    //Create a constructor that accepts one generic parameter.
    public MyGeneric(E e){
        this.e = e;
    }

    //Create a setter and getter method for the generic type.
    public void set(E e){
        this.e = e;
    }

    public E get(){
        return e;
    }

    public static void main(String[] args) {
        //Create a test program that creates two instances of generic class
        //type String called strObj and of type Integer called intObj.
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();

        //Set a value for each of these objects.
        strObj.set("Java");
        intObj.set(123);

        //Display these values using the getter method.
        System.out.println(strObj.get());
        System.out.println(intObj.get());

    }
}
