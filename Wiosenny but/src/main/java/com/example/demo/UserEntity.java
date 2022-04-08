package com.example.demo;

public class UserEntity {
    private String _name;
    private  Integer _age;

    public  UserEntity(String name,Integer age){
        _name =  name;
        _age = age;
    }
    @Override
    public String toString() {
        return "name: " + _name + " age: "+ _age;
    }
}
