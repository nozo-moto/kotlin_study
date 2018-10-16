package code.main

import spark.kotlin.*
import org.jetbrains.exposed.sql.Database
import java.sql.Connection


fun main(args: Array<String>) {
    val http: Http = ignite()
    val db = Database.connect("jdbc:mysql://localhost:3308/kotlin_study", driver = "com.mysql.jdbc.Driver", user = "root", password = "mysql")

    http.get("/hello") {
        "Hello Spark Kotlin!"
    }

}
