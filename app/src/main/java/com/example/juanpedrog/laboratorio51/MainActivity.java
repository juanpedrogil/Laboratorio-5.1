package com.example.juanpedrog.laboratorio51;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SensorManager sensorManager;
    RecyclerView listaR;
    List<Item> datos=new ArrayList<Item>();
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaR=findViewById(R.id.lista);
        sensorManager = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> lista = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder data = new StringBuilder();
        for(int i=1; i<lista.size(); i++){
            datos.add(new Item("Nombre :"+lista.get(i).getName(),"Fabricante:"+lista.get(i).getVendor(),"Version :"+lista.get(i).getVersion()));
        }
        Adapter adapter=new Adapter(datos);
        layoutManager=new LinearLayoutManager(this);
        listaR.setLayoutManager(layoutManager);
        listaR.setHasFixedSize(true);
        listaR.setAdapter(adapter);
    }
}
