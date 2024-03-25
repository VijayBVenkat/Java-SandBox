package org.vijay.serialization;

import lombok.Getter;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
class Transfer implements Serializable {
    int val1;
    static int val2;
    transient int val3;
    final int val4 = 40;
    public Transfer(int val1, int val2, int val3 ) {
        this.val1 = val1;
        Transfer.val2 = val2;
        this.val3 = val3;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "int val1=" + val1 +
                ", static val2=" + val2 +
                ", transient val3=" + val3 +
                ", final val4=" + val4 +
                '}';
    }
}

public class SerializationDemo1 {

    public static void main(String[] args) throws Exception{
        String fileName = "serializable.txt";
        serialize(fileName);
        Transfer t1 = deserialize(fileName);
        if (t1 != null) {
            System.out.println("After deserialization");
            System.out.println(t1.toString());
        }
    }

    private static void serialize(String fileName) {
        Transfer transferObj = new Transfer(10, 20, 30);
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(transferObj);
            System.out.println("After serialization");
            System.out.println(transferObj.toString());
            transferObj.setVal1(11);
            transferObj.setVal3(33);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Transfer deserialize (String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Transfer t1 = (Transfer) ois.readObject();
            return t1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
