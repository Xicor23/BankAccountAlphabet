package com.company;

import java.util.Comparator;

/**
 * Created by Will YE on 2/15/2017.
 */
public class BA_Comparator implements Comparator {
    public int compare(Object fobject, Object secObject){
        BankAccount ba1 = (BankAccount)fobject;
        BankAccount ba2 = (BankAccount)secObject;
        int retvalue;
        if(ba1.balance<ba2.balance)
            retvalue=-1;
        else if(ba1.balance>ba2.balance)
            retvalue=1;
        else{
            retvalue = 0;
        }
        return retvalue;
    }
}
