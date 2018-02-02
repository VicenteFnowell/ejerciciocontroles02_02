package com.example.ejerciciocontroles02_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp_test;
    RadioGroup rgRespuesta;
    CheckBox cbValidar;
    Button btnEnviarRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificamos las vistas

        sp_test=(Spinner)findViewById(R.id.sptipotest);
        rgRespuesta=(RadioGroup) findViewById(R.id.rgrespuestas);
        cbValidar=(CheckBox) findViewById(R.id.cbvalidar);
        btnEnviarRespuesta=(Button) findViewById(R.id.botonenviar);

        //Rellenar el Spinner
        String[] tipostest={"Selecciona","Seguridad","Velocidad","Mecánica","Vial"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,tipostest);
        sp_test.setAdapter(adaptador);







    }//Fin OnCreate


    public void clicktipotest (View view){
        //Recoger el item seleccionado de un Spinner
        String tipoSeleccionado = sp_test.getSelectedItem().toString();

        /*Validación: Si el tipo seleccionado es igual a "Selecciona" avisaremos al usuario de que tiene que seleccionar algún tipo,
         si no, lo mostraremos en un toast
          */

        if (tipoSeleccionado.equals("Selecciona")){
            Toast.makeText(this, "Debes de seleccionar un tipo de test", Toast.LENGTH_LONG).show();
        }else{
            // Toast.makeText(this,"Test seleccionado: "+tipoSeleccionado,Toast.LENGTH_LONG).show();
            btnEnviarRespuesta.setEnabled(true);

    }}

    public void clickEnviarRespuesta (View view){


    }









}//Fin Activity
