package com.jibs.ceepws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController

//@SpringBootApplication
//@RestController
data class User(val name: String, val age: Int)
{
	override fun toString(): String {
		return super.toString()
	}
}
fun main(){
	val user = User(
		name = "fulano",
		age = 15)

	println(user)

	val user2 = User(
		name = "fulano",
		age = 15)

	println(user2)

	println(user == user2)

	//val user3 = user.copy(age = 30)
	//println(user3)
}//sem data class, sem copy, copiando um dado e editando algo
//comparando em memoria, ou comparando o codigo