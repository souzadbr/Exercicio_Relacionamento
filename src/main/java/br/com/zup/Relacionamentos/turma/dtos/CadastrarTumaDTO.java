package br.com.zup.Relacionamentos.turma.dtos;

import br.com.zup.Relacionamentos.cadastro.Cadastro;
import br.com.zup.Relacionamentos.cadastro.dtos.CadastroEntradaDTO;
import br.com.zup.Relacionamentos.curso.dtos.CursoDTO;
import br.com.zup.Relacionamentos.turma.enuns.Periodo;

import java.util.List;

public class CadastrarTumaDTO {
    private Periodo periodo;
    private CursoDTO curso;
   private List<CadastroEntradaDTO> alunos;

    public CadastrarTumaDTO() {
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public CursoDTO getCurso() {
        return curso;
    }

    public void setCurso(CursoDTO curso) {
        this.curso = curso;
    }

    public List<CadastroEntradaDTO> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<CadastroEntradaDTO> alunos) {
        this.alunos = alunos;
    }
}
