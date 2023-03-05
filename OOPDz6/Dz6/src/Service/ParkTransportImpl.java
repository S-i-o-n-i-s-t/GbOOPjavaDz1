package Service;

import Model.Transport;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class ParkTransportImpl implements ParkTransport{
    Logger logger = Logger.getAnonymousLogger();
    @Override
    public void saveTransport(Transport transport) {
        try (FileWriter fileWriter = new FileWriter("transport.txt")) {
            fileWriter.write(transport.toString());
        }catch (Exception e){
            logger.warning("Что-то пошло не так!");

        }
    }
    @Override
    public void getTransport() {
        try(FileReader fileReader = new FileReader("transport.txt")){
            int c;
            while((c=fileReader.read())!=-1){
                System.out.print((char)c);
            }
        }catch (Exception e){
            logger.warning("Что-то пошло не так!");

        }
    }
}
