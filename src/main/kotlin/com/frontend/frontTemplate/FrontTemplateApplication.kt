package com.frontend.frontTemplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FrontTemplateApplication

fun main(args: Array<String>) {
	runApplication<FrontTemplateApplication>(*args)
	println("\nApp started\n")
}
