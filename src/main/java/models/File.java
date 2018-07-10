package models;

import javax.persistence.*;


@Entity
@Table(name="files")
public class File {
    private int id;
    private String name;
    private String extension;
    private double size;
    private Folder folder;

    public File() {

    }

    public File(String name, String extension, double size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "file_name")
    public String getName() {
        return name;
    }

    @Column(name = "file_size")
    public double getSize() {
        return size;
    }
    @ManyToOne
    @JoinColumn(name = "folder", nullable = false)
    public Folder getFolder() {
        return folder;
    }

    @Column(name = "Extension")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }

}