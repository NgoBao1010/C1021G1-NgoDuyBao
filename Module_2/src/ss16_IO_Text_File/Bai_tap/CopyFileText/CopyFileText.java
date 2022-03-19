package ss16_IO_Text_File.Bai_tap.CopyFileText;

import java.io.*;

public class CopyFileText {

    public static final String FILE_SOURCE = "D:\\CodeGym\\bootcamp\\Module_2\\src\\ss16_IO_Text_File\\Bai_tap\\CopyFileText\\source_File.txt";
    public static final String FILE_TARGET = "D:\\CodeGym\\bootcamp\\Module_2\\src\\ss16_IO_Text_File\\Bai_tap\\CopyFileText\\target_File.txt";

    public static String readWriteFile(){
        String result = "";
        try {
            FileReader fileReader = new FileReader(FILE_SOURCE);
            FileWriter fileWriter = new FileWriter(FILE_TARGET);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while ((result = bufferedReader.readLine()) != null){
               bufferedWriter.write(result);
               bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file.");
        } catch (IOException e) {
            System.out.println("Err---------");
        }
        return result;
    }
//    public static void writeFile(String str){
//        try {
//            FileWriter fileWriter = new FileWriter(FILE_TARGET);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(str);
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

    public static void main(String[] args) {
        readWriteFile();
    }
}
