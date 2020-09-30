package br.com.digitalhouse.desafio

class Aluno(var nome: String, var sobrenome: String, val codigoAl: Int) {

    override fun toString(): String {
        return "Aluna(o): $nome $sobrenome (Código: $codigoAl)"
    }

}