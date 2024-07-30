package bai_tap.student_management.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFileCSVToListString(String pathFile){
        List<String> stringList = new ArrayList<String>();
        File file = new File(pathFile);
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = "";
            while((line = bufferedReader.readLine())!=null){
                stringList.add(line);
            }

        }
        catch (FileNotFoundException e) {
            // Xử lý lỗi khi file không được tìm thấy
            throw new RuntimeException("File not found: " + pathFile, e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
//        finally {
//            try {
//                bufferedReader.close();
//                fileReader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        return stringList;
    }
    public static void writeStringListToFile(String pathFile,List<String> stringList,boolean append){
        File file = new File(pathFile);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
        try(FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){

            for (String s: stringList){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        finally {
//            try {
//                bufferedWriter.close();
//                fileWriter.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
