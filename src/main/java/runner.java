import db.DBHelper;
import models.File;
import models.Folder;
import models.Owner;

import java.util.ArrayList;
import java.util.List;


public class runner {

    public static void main(String[] args) {

        Owner john = new Owner("John", "johnno111");


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
        musicFile.setName("Tunes");
        DBHelper.save(musicFile);

        List<File> filesForFolder = new ArrayList<File>();
        filesForFolder.add(musicFile);
        folder1.setFiles(filesForFolder);
        folder1.getFiles();

        List<Folder> foldersForOwner = new ArrayList<Folder>();
        foldersForOwner.add(folder1);
        john.setFolders(foldersForOwner);
        john.getFolders();


    }




}
