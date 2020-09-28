package br.com.digitalhouse.desafio

class Curso(var nome: String, val codigoCur: Int) {

    override fun equals(other: Curso) {
        if (this.codigoCur == other.codigoCur) return true
    }

    override fun toString(): String {
        return "Curso: $nome - $codigoCur"
    }

}