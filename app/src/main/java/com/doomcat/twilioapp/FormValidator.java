package com.doomcat.twilioapp;

import android.widget.EditText;



public class FormValidator {

    public FormValidator(){

    }

    public Boolean isEmpty(EditText a, EditText b, EditText c){
        if (a.getText().toString().length() == 0 || b.getText().toString().length() == 0 || c.getText().toString().length() == 0){
            return true;
        }else{
            return false;
        }
    }

    //for Testing
    public String spitText(){
        return "Spitted";
    }
}
