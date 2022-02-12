package com.example.noteapp.Models;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.example.noteapp.MainActivity;
import com.example.noteapp.R;

public class AlertDialogShowing extends MainActivity{
    private  Context context;
    public  AlertDialogShowing(Context context){
        this.context = context;
    }

    public void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("Alert");
        alertDialogBuilder.setMessage("Do you sure want to exit");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
