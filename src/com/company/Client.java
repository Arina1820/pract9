package com.company;

public class Client {
    String name;
    long inn;

    Client(){
        name = "";
        inn = 0;
    }
    Client(String n, long in){
        name = n;
        inn = in;
    }


    public long getINN(){
        return inn;
    }

    public void setINN(long in){
        this.inn = in;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }


    class BadINNException extends Exception {
            public BadINNException(String errorMessage) {
                super(errorMessage);
            }
        }


    public void Exception(){

        if ((inn< 100000000000l)||(inn>1000000000000l))
        {
            try {
                throw new BadINNException("Exception: bad INN");
            } catch (BadINNException e) {
                System.out.println(e.getMessage());

            }
        }
    }

}
