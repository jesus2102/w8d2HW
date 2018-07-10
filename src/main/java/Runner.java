import DB.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] arg) {

        Folder folder = new Folder("E22");
        DBHelper.save(folder);


        File file1 = new File("Students", ".docx", 2.46);
        DBHelper.save(file1);

        File file2 = new File("Instructors", ".docx", 1.23);
        DBHelper.save(file2);

        File file3 = new File("Program", ".txt", 10.46);
        DBHelper.save(file3);

        List<File> files = DBHelper.getAll(File.class);
    }
}
