package ss17.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên tập tin nguồn:");
        String sourceFileName = scanner.nextLine();

        System.out.println("Nhập tên tập tin đích:");
        String targetFileName = scanner.nextLine();

        File sourceFile = new File(sourceFileName);
        File targetFile = new File(targetFileName);
        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
            return;
        }
        if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại. Vui lòng chọn tên khác.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(targetFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytesCopied = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytesCopied += bytesRead;
            }

            System.out.println("Sao chép hoàn tất.");
            System.out.println("Số byte đã sao chép: " + totalBytesCopied);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
