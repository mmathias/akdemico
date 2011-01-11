
package br.com.sistemaescolar.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

@Entity
@SequenceGenerator(name="sequencia", sequenceName="seq_usuario")
public class Aluno implements Serializable{

    @Id
    @GeneratedValue(generator="sequencia", strategy=GenerationType.AUTO)
    private Long id;
    private String matricula;
    private String nome;
    private String sexo;
    private String estadoCivil;
    private String nacionalidade;
    private String naturalidade;
    private String endereco;
    private String cep;
    private String bairro;
    private String cidade;
    private String telefone;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nascimento;
    private String email;
    private String responsavelFinanceiro;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    
    public String getMatricula() {
        return matricula;
    }

    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

   
    public String getSexo() {
        return sexo;
    }

    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    public String getEstadoCivil() {
        return estadoCivil;
    }

    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    
    public String getNacionalidade() {
        return nacionalidade;
    }

    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

  
    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

  
    public String getCep() {
        return cep;
    }

   
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    public String getBairro() {
        return bairro;
    }

  
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

  
    public String getCidade() {
        return cidade;
    }

 
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

  
    public String getResponsavelFinanceiro() {
        return responsavelFinanceiro;
    }

    
    public void setResponsavelFinanceiro(String responsavelFinanceiro) {
        this.responsavelFinanceiro = responsavelFinanceiro;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }


}
