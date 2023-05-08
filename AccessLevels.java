package HW17;

import class18.A;

public class AccessLevels {
    String model;
    int memory;
    boolean isFalse;
    long price;
    private AccessLevels(String model){
        this.model=model;
        System.out.println("Private");
    }
    public AccessLevels(int memory){
        this.memory=memory;
        System.out.println("Public");
    }
    AccessLevels (boolean isFalse){
        this.isFalse=isFalse;
        System.out.println("default");
    }
    protected AccessLevels(long price){
        this.price=price;
        System.out.println("Protected");
    }

    public static void main(String[] args) {
        AccessLevels obj=new AccessLevels("I love Java so much!");
    }

}
