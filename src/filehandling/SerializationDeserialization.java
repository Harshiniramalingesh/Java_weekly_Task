package filehandling;
import java.io.*;
import java.io.Serializable;
class SerializationDeserialization implements Serializable{
    transient String name = "User";
    transient int password = 1234;
    public static void main(String[] args) throws IOException,ClassNotFoundException{
           SerializationDeserialization ob = new SerializationDeserialization();

           FileOutputStream fos = new FileOutputStream("text.ser");
           ObjectOutputStream obop = new ObjectOutputStream(fos);
           obop.writeObject(ob);

           FileInputStream fis = new FileInputStream("text.ser");
           ObjectInputStream obin = new ObjectInputStream(fis);
           SerializationDeserialization obj = (SerializationDeserialization) obin.readObject();

           System.out.println(obj.name);
           System.out.println(obj.password);

    }
}
