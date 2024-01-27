package com.mycompany.app.training;

public class EnumExample {
    //An enum type is a special data type that enables for a variable to be
    // a set of predefined constants.
    //The variable must be equal to one of the values that have been predefined for it.
    public enum UserRoles {
        ADMIN,
        USER,
        PROVIDER,
        MANAGER
    }
    public static void main(String[] args) {

        UserRoles roles = UserRoles.ADMIN;
        if(roles.name().equalsIgnoreCase("USER")){
            System.out.println("This is Admin role");
        }else{
            System.out.println("This is not admin role");
        }
    }
}
