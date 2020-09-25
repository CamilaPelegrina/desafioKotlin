package br.com.digitalhouse.desafio

class Curso(var nome: String, val codigo: Int) {

    override fun equals(other: Curso) {
        if (this.codigo == other.codigo) return true
    }

    override fun toString(): String {
        return "Curso: $nome - $codigo"
    }

}