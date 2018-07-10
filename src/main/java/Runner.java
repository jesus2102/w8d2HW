import DB.DBFolder;
import DB.DBHelper;
import DB.DBOwner;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] arg) {

        Owner owner1 = new Owner("Jesus", "j2102");
        DBHelper.save(owner1);

        Folder folder1 = new Folder("E22", owner1);
        DBHelper.save(folder1);

        Folder folder2 = new Folder("E24", owner1);
        DBHelper.save(folder2);


        File file1 = new File("Students", ".docx", 2.46, folder1);
        DBHelper.save(file1);

        File file2 = new File("Instructors", ".docx", 1.23, folder2);
        DBHelper.save(file2);

        File file3 = new File("Program", ".txt", 10.46, folder1);
        DBHelper.save(file3);

        List<File> files = DBHelper.getAll(File.class);

        List<File> filesInFolder = DBFolder.getFilesInFolder(folder1);

        List<Folder> ownerFolders = DBOwner.getFoldersOfOwner(owner1);
    }
}
