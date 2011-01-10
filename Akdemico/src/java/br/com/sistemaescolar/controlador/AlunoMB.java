

package br.com.sistemaescolar.controlador;

import br.com.sistemaescolar.modelo.Aluno;
import br.com.sistemaescolar.service.AlunoService;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class AlunoMB {

    private Aluno aluno;
    private AlunoService servico;

    public void AlunoMB(){
         setAluno(new Aluno());
         servico = new AlunoService();
    }
    public String cadastrar() {
        servico.cadastrarAluno(getAluno());
        return "Sucesso";
    }


    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
