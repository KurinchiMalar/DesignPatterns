package corePatterns.creational.singleton;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       DateUtilLazyInit ob1 =  DateUtilLazyInit.getInstance();
        DateUtilLazyInit ob2 =  DateUtilLazyInit.getInstance();

        System.out.println(ob1 == ob2);

        DateUtilSerialization serob1 = DateUtilSerialization.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("singletonSerialize.txt")));
        oos.writeObject(serob1);

        DateUtilSerialization serob2 = null;//DateUtilSerialization.getInstance();
        ObjectInputStream ois = new ObjectInputStream((new FileInputStream(new File("singletonSerialize.txt"))));
        serob2 = (DateUtilSerialization)ois.readObject();
        System.out.println("Serialize objects equal ?- "+ (serob1 == serob2));
        // Serialize objects equal ?- false  -->
        //          Solution : ObjectInputStream internally invokes readResolve() which should be overriden in our DateUtil class to have the same singleton behavior.

        oos.close();
        ois.close();


    }
}
