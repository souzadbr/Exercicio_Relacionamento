package br.com.zup.Relacionamentos.turma;

import br.com.zup.Relacionamentos.turma.dtos.CadastrarTumaDTO;
import br.com.zup.Relacionamentos.turma.dtos.MatriculaDTO;
import br.com.zup.Relacionamentos.turma.dtos.TurmaEntradaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
    @Autowired
    TurmaService turmaService;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Turma cadastrarNovaTurma(@RequestBody TurmaEntradaDTO turmaEntradaDTO){
        Turma turma = modelMapper.map(turmaEntradaDTO, Turma.class);
        return turmaService.salvarTurma(turma);
    }

    @PutMapping
    public CadastrarTumaDTO matricularAluno(@RequestBody MatriculaDTO matricula){
       Turma turma = turmaService.vincularAlunoNaTurma(matricula.getAlunoId(), matricula.getTurmaId());
        return modelMapper.map(turma, CadastrarTumaDTO.class);
    }
}
