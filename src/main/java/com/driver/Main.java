package com.driver;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        B obj = new B();
        System.out.println(obj.meth());
    }
    public static class A{

        public String meth(){
            return "Invoking Method from Class A";
        }
    }
    public static class B extends A{
        @Override
        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }
}

