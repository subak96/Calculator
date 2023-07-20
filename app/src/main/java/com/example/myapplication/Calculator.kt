package com.example.myapplication

open class Calculator{
    fun op() {
        while (true)
    {
        try {
            println("번호를 선택해주세요")
            println("[1]덧셈 , [2]뺄셈 , [3]곱셈 , [4]나눗셈")
            var selec = readLine()!!.toDouble()
            var calc = Calculator()
            println("첫번째 값을 입력해주세요")
            var num1 = readLine()!!.toDouble()
            println("두번째 값을 입력해주세요")
            var num2 = readLine()!!.toDouble()

            if (selec == 1.0) {
                // 덧셈일 때
                println("${calc.op(AddOperation(),num1, num2)}")
            } else if (selec == 2.0) {
                // 뺄셈일 때
                println("${calc.op(SubstractOperation(), num1, num2)} ")
            } else if (selec == 3.0) {
                // 곱셈일 때
                println("${calc.op(MultiplyOperation(), num1, num2)}")
            } else if (selec == 4.0) {
                // 나눗셈일 때
                println("${calc.op(DivideOperation(), num1, num2)}")
            } else {
                // 잘못된 연산자 일 때
                println("입력이 잘못되었습니다")
            }
            println("한 번 더 계산하시겠습니까? (y/n)")
            var choice = readLine()!!
            if (choice == "y") {
                return main()
            }
            break
        }
        catch (e: NumberFormatException)
        {
            println("다시 입력해주세요.")
        }
    }
    }
}