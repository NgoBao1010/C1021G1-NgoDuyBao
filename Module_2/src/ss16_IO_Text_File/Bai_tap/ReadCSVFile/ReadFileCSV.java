package ss16_IO_Text_File.Bai_tap.ReadCSVFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {

    public static final String CSV_FILE = "D:\\CodeGym\\bootcamp\\Module_2\\src\\ss16_IO_Text_File\\Bai_tap\\ReadCSVFile\\country.csv";

    public static List<Country> readCSV(){
        List<Country> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(CSV_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                Country country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);
                list.add(country);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file.");
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        List<Country> countryList = readCSV();
        for (Country country : countryList){
            System.out.println(country);
        }
    }
}
