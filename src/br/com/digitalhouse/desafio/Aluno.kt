package br.com.digitalhouse.desafio

class Aluno(var nome: String, var sobrenome: String, val codigo: Int) {

    override fun equals(other: Aluno): Boolean {
        if (this.codigo == other.codigo) return true
    }

    override fun toString(): String {
        return "Aluno: ($nome $sobrenome - $codigo)"
    }

}