package br.com.digitalhouse.desafio

fun main() {

    var admin = DigitalHouseManager()

    admin.registrarProfessorTitular("João", "Camargo", 1, "Kotlin")
    admin.registrarProfessorTitular("Carlos", "Adão", 2, "Metodologias Ágeis")

    admin.registrarProfessorAdjunto("Vitória", "Gonçalves", 3, 4)
    admin.registrarProfessorAdjunto("Maria", "Silva", 4, 2)

    admin.registrarCurso("Full Stack",20001, 3)
    admin.registrarCurso("Android",20002, 2)

    admin.alocarProfessor(20001, 1, 3)
    admin.alocarProfessor(20002, 2, 4)

    admin.registrarAluno("Camila", "Pelegrina", 1)
    admin.registrarAluno("Francesco", "Paero", 2)
    admin.registrarAluno("Gustavo", "Lourenço", 3)
    admin.registrarAluno("Beatriz", "Silva", 4)
    admin.registrarAluno("Adriani", "Nascimento",5)

    admin.matricularAluno(1, 20001)
    admin.matricularAluno(2, 20001)

    admin.matricularAluno(3, 20002)
    admin.matricularAluno(1, 20002)
    admin.matricularAluno(5, 20002)


    println("---")
    println(admin.listaAlunos.values)
    println("---")
    println(admin.listaProfessores.values)
    println("---")
    println(admin.listaCursos.values)
    println("---")
    println(admin.listaMatriculas.values)

    println("---")
    admin.consultarAlunosCurso(20002)
    println("---")
    admin.consultarProfessoresCurso(20002)
    println("---")
    admin.consultarMatriculaAluno(1)

}