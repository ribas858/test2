package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers


class TestAddUnitV extends FlatSpec with Matchers {

	var literal100: Literal = _
  	var literal200: Literal = _

  	literal100 = new Literal(100)
 	literal200 = new Literal(200)

	
	var size = new SizeExpression
	val add = new Add(literal100, literal200)

	var test3 = 3

	add.accept(size)

	if(size.result() == test3){
		print("\n====>> Teste unitario tamanho ADD: " + " O tamanho da expressao e " + size.result() + " ==> ")
		print("O teste passou com sucesso!!\n\n")
	}else{
		print("\n====>> Teste unitario tamanho ADD: " + " O tamanho da expressao e " + size.result() + " mas deveria ser 3" + " ==> ")
		println("O teste falhou!!\n\n")
	}

}