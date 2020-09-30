package br.com.digitalhouse.desafio

import java.util.*

class Matricula(var aluno: Aluno?, var curso: Curso?) {

    var data = Date()

    override fun toString(): String {
        return "$aluno $curso"
    }

}