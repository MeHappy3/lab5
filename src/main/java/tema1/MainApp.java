package tema1;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws IOException {
        List<PerecheNumere> lista = citire();
        for(PerecheNumere p: lista){
            System.out.println(p.isFibb() + "\n"+p.cmmc()+" \n"+p.equalSumDigits()+"\n"+p.equalEvenDigits());
        }

    }
    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/persoane.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static List<PerecheNumere> citire(){
        List<PerecheNumere> lista = new ArrayList<PerecheNumere>();
        try {
            File file = new File("src/main/resources/NumerePereche.json");
            ObjectMapper mapper = new ObjectMapper();
            lista= mapper.readValue(file, new TypeReference<List<PerecheNumere>>() {});
        } catch (StreamReadException e) {
             e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }


}
