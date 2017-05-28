package com.doomcat.twilioapp;

import android.widget.EditText;



public class FormValidator {

    public FormValidator(){

    }

    public Boolean isEmpty(EditText a, EditText b){
        if (a.getText().toString() == "" && b.getText().toString() == ""){
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
