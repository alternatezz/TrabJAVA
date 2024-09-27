/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetojava;

/**
 *
 * @author MEUCOMPUTADOR
 */

import java.util.Date;

public class ProjetoJAVA {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Tropinha", "12345678");

        // Criando equipamentos
        Equipamento equipamento1 = new Equipamento(1, "monitor");
        Equipamento equipamento2 = new Equipamento(2, "teclado");

        // Criando funcionários
        Funcionario funcionario1 = new Funcionario("F1", "Ferrari");

        // Criando chamados
        Chamado chamado1 = new Chamado(1, "Problema com a tela", equipamento1, funcionario1, new Date());
        Chamado chamado2 = new Chamado(2, "Equipamento não liga", equipamento2, funcionario1, new Date());

        // Fechando um chamado
        chamado1.fecharChamado(new Date());

        // Mostrando informações
        System.out.println(cliente1);
        System.out.println(equipamento1);
        System.out.println(funcionario1);
        System.out.println(chamado1);
        System.out.println(chamado2);
    }
}
