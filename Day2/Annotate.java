package com.sonata;

 class Annotate {

    public void justaMethod() {
        System.out.println("Parent class method");
    }
}


 class Over extends Annotate {

    @Override
    public void justaMethod() {
        System.out.println("Child class method");
    }
}


