package dev.pgm.practicealten322

object MockUtils {
    fun generateStudentList(): List<StudentDomain> {


        val student1 = StudentDomain(1,
            "Jesús Castro Sanz",
            "5",
            11,
            "2ºB")

        val student2 = StudentDomain(2,
            "Armando Escándalo",
            "3",
            10,
            "1ºA")
        val student3 = StudentDomain(3,
            "Mar Lozano Ortiz",
            "9",
            11,
            "2ºB")
        val student4 = StudentDomain(4,
            "Clara Gonzalez Iglesias",
            "6",
            11,
            "2ºB")
        val student5 = StudentDomain(5,
            "Iker Gonzalez Lopez",
            "6",
            11,
            "2ºB")


        val student6 = StudentDomain(6,
            "Carmen Caballero Vicente",
            "NOT PRESENTED",
            12,
            "3ºA")

        val student7 = StudentDomain(7,
            "Valeria Ortiz Santana",
            "10",
            10,
            "1ºA")
        val student8 = StudentDomain(8,
            "Armando Escándalo",
            "NOT PRESENTED",
            12,
            "3ºA")
        val student9 = StudentDomain(9,
            "Alejandra Roca Cano",
            "1",
            11,
            "2ºB")
        val student10 = StudentDomain(10,
            "Arnau Romero Gallardo",
            "2",
            12,
            "3ºA")

        return arrayListOf(
            student1,
            student2,
            student2,
            student3,
            student4,
            student5,
            student6,
            student7,
            student8,
            student9,
            student10)
    }

}