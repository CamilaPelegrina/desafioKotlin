package br.com.digitalhouse.desafio

class Curso(var nome: String, val codigoCur: Int, var quantidadeMaximaDeAlunos: Int) {

    var listaAlunos = mutableListOf<Aluno>()
    //var quantidadeAlunos: Int = (listaAlunos.count())
    var professorTitular: Titular = Titular()
    var professorAdjunto: Adjunto = Adjunto()


    fun adicionarUmAluno(): Boolean {
        var quantidadeAlunos: Int = (listaAlunos.count())
        when {
            quantidadeAlunos < quantidadeMaximaDeAlunos -> return true
            else -> return false
        }
    }

    fun excluirAluno(aln: Aluno) {
        listaAlunos.remove(aln)
    }


    override fun toString(): String {
        return "Curso: $nome - $codigoCur"
    }

}