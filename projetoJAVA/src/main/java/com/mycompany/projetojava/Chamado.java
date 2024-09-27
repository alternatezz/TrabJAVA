/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author MEUCOMPUTADOR
 */
import java.util.Date;

public class Chamado {
    private int id;
    private String descricao;
    private Equipamento equipamento;
    private Funcionario funcionario;
    private Date dataAbertura;
    private Date dataFechamento;

    public Chamado(int id, String descricao, Equipamento equipamento, Funcionario funcionario, Date dataAbertura) {
        this.id = id;
        this.descricao = descricao;
        this.equipamento = equipamento;
        this.funcionario = funcionario;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = null;  // Assume que o chamado está em aberto inicialmente
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void fecharChamado(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    @Override
    public String toString() {
        return "Chamado{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", equipamento=" + equipamento +
                ", funcionario=" + funcionario +
                ", dataAbertura=" + dataAbertura +
                ", dataFechamento=" + dataFechamento +
                '}';
    }
}