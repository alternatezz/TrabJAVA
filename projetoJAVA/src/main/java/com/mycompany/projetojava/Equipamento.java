/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author MEUCOMPUTADOR
 */
public class Equipamento {
 private int id;
    private String numeroSerie;

    public Equipamento(int id, String numeroSerie) {
        this.id = id;
        this.numeroSerie = numeroSerie;
    }

    public int getId() {
        return id;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "id=" + id +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}