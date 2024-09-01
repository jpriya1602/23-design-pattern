package Structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{
    String name;
    List<FileSystemComponent> directories = new ArrayList<>();
    Directory(String name){
        this.name = name;
    }

    @Override
    public void add(FileSystemComponent file){
        directories.add(file);
    }

    @Override
    public void remove(FileSystemComponent fileSystemComponent){
        directories.remove(fileSystemComponent);
    }
    @Override
    public void display() {
        System.out.println("Directory name: "+ name);
        for(FileSystemComponent fileSystemComponent: directories){
            fileSystemComponent.display();
        }
    }
}
