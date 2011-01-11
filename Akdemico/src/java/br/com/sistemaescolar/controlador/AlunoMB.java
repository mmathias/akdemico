

package br.com.sistemaescolar.controlador;

import br.com.sistemaescolar.modelo.Aluno;
import br.com.sistemaescolar.service.AlunoService;

public class AlunoMB {

    private Aluno aluno = new Aluno();
    private AlunoService servico = new AlunoService();

    public String cadastrar() {
        servico.cadastrarAluno(getAluno());
        return "sucesso";
    }


    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
