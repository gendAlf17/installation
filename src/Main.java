import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        File dir1 = new File("C://Games2");
        dir1.mkdir();
        File dir2 = new File("C://Games2/src");
        dir2.mkdir();
        File dir3 = new File("C://Games2/res");
        dir3.mkdir();
        File dir4 = new File("C://Games2/savegames");
        dir4.mkdir();
        File dir5 = new File("C://Games2/temp");
        dir5.mkdir();
        File dir6 = new File("C://Games2/src/main");
        dir6.mkdir();
        File dir7 = new File("C://Games2/src/test");
        dir7.mkdir();
        File dir8 = new File("C://Games2/res/drawables");
        dir8.mkdir();
        File dir9 = new File("C://Games2/res/vectors");
        dir9.mkdir();
        File dir10 = new File("C://Games2/res/icons");
        dir10.mkdir();

        File file1 = new File(dir6, "Main.java");
        try {
            file1.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File file2 = new File(dir6, "Utils.java");
        try {
            file2.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File file3 = new File(dir5, "temp.txt");
        try {
            file3.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (File item : dir1.listFiles()) {
            sb.append("Каталог " + item.getName() + " создан;\n");
        }
        for (File item : dir2.listFiles()) {
            sb.append("Каталог " + item.getName() + " создан;\n");
        }
        for (File item : dir3.listFiles()) {
            sb.append("Каталог " + item.getName() + " создан;\n");
        }
        for (File item : dir6.listFiles()) {
            sb.append("Файл " + item.getName() + " создан;\n");
        }
        sb.append("Файл " + file3.getName() + " создан;\n");
        
        try (FileWriter writer = new FileWriter(file3, false)) {
            writer.write(sb.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
