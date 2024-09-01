package Structural.composite;

public class Client {

    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1","jpg");
        FileSystemComponent file2 = new File("file2","jpeg");
        FileSystemComponent file3 = new File("file3","png");
        FileSystemComponent subFolder = new Directory("Temp-folder");
        subFolder.add(file1);
        subFolder.add(file2);
        subFolder.add(file3);

        FileSystemComponent parentFolder = new Directory("Parent-folder");
        parentFolder.add(subFolder);
        FileSystemComponent file4 = new File("file4","png");

        parentFolder.add(file4);

        parentFolder.display();

    }

}
