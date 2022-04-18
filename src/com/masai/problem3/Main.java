package com.masai.problem3;

public class Main {

    public static void main(String[] args) {

        /*In this question, Interface Seggregation principle in SOLID IS violated.
        It states that classes should not include the behaviours or methods
        it does not use.*/

    }

}

interface ReadDataManager{
    public void read();
}

interface WriteDataManager{
    public void write();
}

class DiskRealmManager implements ReadDataManager, WriteDataManager{

    @Override
    public void read() {
        System.out.println("Reading DiskRealManager");
    }

    @Override
    public void write() {
        System.out.println("saving into Realm");
    }
}

class DiskCoreDataManager implements ReadDataManager, WriteDataManager{

    @Override
    public void read() {
        System.out.println("Reading DiskCoreDataManager");
    }

    @Override
    public void write() {
        System.out.println("Saving into Realm");
    }
}

class InMemoryRealmManager implements ReadDataManager{

    @Override
    public void read() {
        System.out.println("Reading InMemoryRealManager");
    }
}