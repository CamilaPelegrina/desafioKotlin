package br.com.digitalhouse.desafio

import java.time.LocalDate
import java.time.Period
import java.util.*

class Titular(override var nome: String = "", override var sobrenome: String = "", override val codigoProf: Int = -1, var especialidade: String = ""): Professor(nome, sobrenome, codigoProf) {

    val dataEntrada = LocalDate.now()
    var dataAtual = LocalDate.now()
    var tempoDeCasa = Period.between(dataEntrada, dataAtual)

}