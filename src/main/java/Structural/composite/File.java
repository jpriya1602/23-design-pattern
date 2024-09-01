package Structural.composite;

public class File implements FileSystemComponent {
    String name;
    String type;

    File(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("File Name: " + name);
    }

    @Override
    public void add(FileSystemComponent fileSystemComponent) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void remove(FileSystemComponent fileSystemComponent) {
        throw new UnsupportedOperationException();
    }
}
