package com.example.myquizapp

object Constant {

    const val USER_NAME : String="user_name"
    const val TOTAL_QUESTIONS : String ="total_questions"
    const val CORRECT_ANSWER : String ="correct_answer"

    fun getQuestion() : ArrayList<Question> {

        val questionList =ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia","Armenia",
            "Austria",1
        )
        questionList.add(que1)
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Brazil","Australia","Armenia",
            "Austria",2
        )
        questionList.add(que2)
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "England","Argentina","Brazil","India",
            3
        )
        questionList.add(que3)
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "England","Armenia","Denmark",
            "Belgium",4
        )
        questionList.add(que4)
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Spain","India","Jordan",
            "Germany",4
        )
        questionList.add(que5)
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Armenia","England","New_zealand",
            "Belgium",3
        )
        questionList.add(que6)
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Fiji","Kuwait","India",
            "Germany",3
        )
        questionList.add(que7)
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Spain","Fiji","Jordan",
            "Argentina",2
        )
        questionList.add(que8)
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark","Norway","Spain",
            "Portugal",1
        )
        questionList.add(que9)

        return questionList
    }
}