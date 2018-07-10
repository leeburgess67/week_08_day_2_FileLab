import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;


public class runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("Documents");
        DBHelper.save(folder1);

        File musicFile = new File("tune", ".mp3", 15.5, folder1);
        DBHelper.save(musicFile);

        File wordFile = new File("Blog", ".doc", 0.5, folder1);
        DBHelper.save(wordFile);

        File excelFile = new File("sheet1", ".xls", 1.5, folder1);
        DBHelper.save(excelFile);

        File movieFile = new File("movie1", ".mp4", 1223.5, folder1);
        DBHelper.save(movieFile);

        List<File> files = DBHelper.getAll(File.class);

    }




}
