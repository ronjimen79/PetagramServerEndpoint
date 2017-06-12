package com.ronicode.petagramserverendpoint.fragments;

import com.ronicode.petagramserverendpoint.adaptadores.MascotasAdaptador;
import com.ronicode.petagramserverendpoint.pojo.Mascotas;

import java.util.ArrayList;

/**
 * Created by Roni on 10/06/2017.
 */

public interface IDetalleMascota {

    public void generarLinearLayoutVertical();
    public MascotasAdaptador crearAdaptador(ArrayList<Mascotas> detalles);
    public void inicializarMascotasAdaptadorRV (MascotasAdaptador mascotasAdaptador);


}
