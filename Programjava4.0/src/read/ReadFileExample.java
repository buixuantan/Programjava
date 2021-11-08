package readfiletext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {

    public static void main(String[] args) throws FileNotFoundException {


        ReadFileExample readfile = new ReadFileExample();
        readfile.readFileText("src\\dictionary.txt");
//        System.out.println("Nhập đường dẫn file: ");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
//
//        ReadFileExample readfile = new ReadFileExample();
//        readfile.readFileExample(path);
    }


    public void readFileText(String filePath) throws FileNotFoundException {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
//            line = br.readLine();
//            line = line.replace("\ufeff", "");
//            String firstCharacter = line.substring(0,1);
//            if (firstCharacter.equals("@")) {
//                System.out.println(line);
//            }
            while ((line = br.readLine()) != null) {

                // thay thế bảng mã hoá vă bản cũ UTF-8 with BOM bằng bảng mã hoá văn bảng "".
                line = line.replace("\ufeff", "");
                String firstCharacter1 = line.substring(0, 1);
                if (firstCharacter1.equals("@")) {
                    System.out.println(line);
                }

            }

            br.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }
}
