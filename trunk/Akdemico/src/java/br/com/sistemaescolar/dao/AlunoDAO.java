/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sistemaescolar.dao;

import br.com.sistemaescolar.modelo.Aluno;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author leosilvarj
 */
public class AlunoDAO {
     SessionFactory factory = HibernateUtil.getSessionFactory();

     public void cadastrarAluno(Aluno aluno) {
        Session sessao = factory.openSession();
        sessao.beginTransaction();
        sessao.persist(aluno);
        sessao.getTransaction().commit();
        sessao.close();
    }
}
