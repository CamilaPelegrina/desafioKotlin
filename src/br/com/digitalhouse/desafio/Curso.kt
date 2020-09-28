package br.com.digitalhouse.desafio

class Curso(var nome: String, val codigoCur: Int, var professorTitular: Titular, var professorAdjunto: Adjunto) {

    var quantidadeAlunos: Int
    var listaAlunos = mutableListOf<Aluno>()


    override fun equals(other: Curso) {
        if (this.codigoCur == other.codigoCur) return true
    }

    override fun toString(): String {
        return "Curso: $nome - $codigoCur"
    }

}