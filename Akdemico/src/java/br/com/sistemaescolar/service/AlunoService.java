/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sistemaescolar.service;

import br.com.sistemaescolar.modelo.Aluno;

/**
 *
 * @author leosilvarj
 */
public class AlunoService {

     public boolean cadastrarAluno(Aluno aluno) {
         Aluno umaluno = new Aluno();
         umaluno.setNome("Leandro");
         return true;
    }
}
