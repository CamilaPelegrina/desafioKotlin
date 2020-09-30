package br.com.digitalhouse.desafio

import java.time.LocalDate

class DigitalHouseManager() {
    var listaAlunos = mutableMapOf<Int, Aluno>()
    var listaProfessores = mutableMapOf<Int, Professor>()
    var listaCursos = mutableMapOf<Int, Curso>()
    var listaMatriculas = mutableMapOf<Int, Matricula>()

    fun registrarCurso(nome: String, codigoCur: Int, quantidadeMaximaDeAlunos: Int) {

        val curso = Curso(nome, codigoCur, quantidadeMaximaDeAlunos)
        listaCursos.put(codigoCur, curso)

    }

    fun excluirCurso(codigoCurso: Int) {

        listaCursos.remove(codigoCurso)

    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras:Int) {

        val profAdjunto = Adjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras)
        listaProfessores.put(codigoProfessor, profAdjunto)

    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {

        val profTitular = Titular(nome, sobrenome, codigoProfessor, especialidade)
        listaProfessores.put(codigoProfessor, profTitular)

    }

    fun excluirProfessor(codigoProfessor: Int) {

        listaProfessores.remove(codigoProfessor)

    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {

        val aluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.put(codigoAluno, aluno)

    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {

        val aluno = listaAlunos[codigoAluno]
        val curso = listaCursos[codigoCurso]
        var matricula = Matricula(aluno, curso)
        var verificar = curso?.adicionarUmAluno()
        when {
            verificar!! -> {
                listaMatriculas.put(codigoAluno, matricula)
                if (aluno != null) {
                    curso?.listaAlunos?.add(aluno)
                }
                println ("Matrícula realizada com sucesso.")
            }
            else -> {
                println("Não foi possível realizar matrícula. Vagas indisponíveis.")
            }
        }

    }

    fun alocarProfessor(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        val professorTitular = listaProfessores[codigoProfessorTitular]
        val professorAdjunto = listaProfessores[codigoProfessorAdjunto]
        val curso = listaCursos[codigoCurso]
        if (curso != null) {
            curso.professorTitular = professorTitular as Titular
        }
        if (curso != null) {
            curso.professorAdjunto = professorAdjunto as Adjunto
        }

    }

    fun consultarAlunosCurso(codigoCurso: Int) {
        var curso = listaCursos[codigoCurso]
        println(curso?.listaAlunos)
    }

    fun consultarProfessoresCurso(codigoCurso: Int) {
        var curso = listaCursos[codigoCurso]
        print(curso?.professorTitular)
        print(" e ")
        println(curso?.professorAdjunto)
    }

    fun consultarMatriculaAluno(codigoAluno: Int) {
        var aluno = listaMatriculas[codigoAluno]
        println(aluno)
    }

}