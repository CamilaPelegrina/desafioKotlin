package br.com.digitalhouse.desafio

abstract class Professor(var nome: String, var sobrenome: String, var tempoDeCasa: Int, val codigoProf: Int) {

    override fun equals(other: Professor) {
        if (this.codigoProf == other.codigoProf) return true
    }

    override fun toString(): String {
        return "Professor: $nome $sobrenome - $codigoProf"
    }

}