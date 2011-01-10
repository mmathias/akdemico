/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sistemaescolar.service;

import br.com.sistemaescolar.dao.AlunoDAO;
import br.com.sistemaescolar.modelo.Aluno;

/**
 *
 * @author leosilvarj
 */
public class AlunoService {
    private AlunoDAO alunoDao = new AlunoDAO();
    
    
    public void cadastrarAluno(Aluno aluno) {
         alunoDao.cadastrarAluno(aluno);
    }
}
