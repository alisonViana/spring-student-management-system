package br.com.alisonviana

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StudentManagementSystemApplication

fun main(args: Array<String>) {
    runApplication<StudentManagementSystemApplication>(*args)
}
