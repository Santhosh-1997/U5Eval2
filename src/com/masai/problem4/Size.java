package com.masai.problem4;

public interface Size {

    public void getSize();
}

class Ten implements Size{

    @Override
    public void getSize() {
        System.out.println("size of ten");
    }
}

class Hundred implements Size{

    @Override
    public void getSize() {
        System.out.println("Size of hundred");
    }
}

class Thousand implements Size{

    @Override
    public void getSize() {
        System.out.println("size of thousand");
    }
}



