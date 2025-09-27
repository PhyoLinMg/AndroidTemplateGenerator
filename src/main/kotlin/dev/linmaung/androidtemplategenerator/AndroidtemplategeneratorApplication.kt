package dev.linmaung.androidtemplategenerator

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class AndroidtemplategeneratorApplication

fun main(args: Array<String>) {
	runApplication<AndroidtemplategeneratorApplication>(*args)
}
