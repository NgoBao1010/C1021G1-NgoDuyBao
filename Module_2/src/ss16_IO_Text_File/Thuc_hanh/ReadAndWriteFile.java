package ss16_IO_Text_File.Thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {

    public static final String READ_FILE = "D:\\CodeGym\\bootcamp\\Module_2\\src\\ss16_IO_Text_File\\Thuc_hanh\\number.txt";
    public static final String WRITE_FILE = "D:\\CodeGym\\bootcamp\\Module_2\\src\\ss16_IO_Text_File\\Thuc_hanh\\result.txt";

    public List<Integer> readFile(String filePath){
        List<Integer> numberList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                numberList.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại");
        }catch (Exception e){
            System.err.println("Dữ liệu lỗi");
        }
        return numberList;
    }

    public void writeFile(String filePath,int max){
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Max là : " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> num){
        int max = num.get(0);
        for (int i = 0;i < num.size();i++){
            if (max < num.get(i)){
                max = num.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> num = readAndWriteFile.readFile(READ_FILE);
        int max = findMax(num);
        readAndWriteFile.writeFile(WRITE_FILE,max);
    }
}
