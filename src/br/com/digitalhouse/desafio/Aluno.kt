package br.com.digitalhouse.desafio

class Aluno(var nome: String, var sobrenome: String, val codigoAl: Int) {

    override fun equals(other: Aluno) {
        if (this.codigoAl == other.codigoAl) return true
    }

    override fun toString(): String {
        return "Aluno: $nome $sobrenome - $codigoAl"
    }

}