package kazi.tutorial.mathaptitudetest

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTION: String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "দুটি স্ংখ্যার যোগফল 128 & ল,সা,গু 240  সংখ্যা দুটি কী কী ?",
            "20 & 108", "90 & 38",
            "80 & 48", "60 & 68", 3

        )
         questionsList.add(que1)

        val que2 = Question(
            2,"তিনটি ঘনকের ধারের  আনুপাত  3 : 4 : 5 । এগুলিকে গলিয়ে নতুন একটা গোলক তৈরী করা হল , যার কর্ণ  12√3 সেমি। ঘনক গুলির দৈর্ঘ কত?",
            "3 সেমি, 4 সেমি, 5 সেমি", "6 সেমি, 8 সেমি, 10 সেমি", "9 সেমি, 12 সেমি, 15 সেমি",
            "কোনটি নয়।", 2
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "6 থেকে বড় কোন  মৌলিক সংখ্যাকে  6 দ্বারা ভাগ করলে ভাগশেষ হবে –",
            "1 অথবা 2", "1 অথবা 3", "1 অথবা 5",
            "3 অথবা 5",3
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "যদি 3a = 4b = 6c এবং  a + b + c = 27√29 হয় তাহলে √(a² + b² + c²) এর মান কত?",
            "3√29 ", "81", "87", "কোনটি নয়।", 3
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "দুটি সংখ্যার পার্থক্য হয় বড় সংখ্যার 20%, যদি ছোট সংখ্যাটা 20 হয় তবে বড় সংখ্যাটা কত?",
            "25","45", "50","80", 1
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "এক ব্যক্তি কোন জিনিস বিক্রি করে , বিক্রয়মূল্যের উপর 25% লাভ করল । তার শতকরা লাভ কত?",
            "16 2/3", "33 1/3", "20", "25", 2

        )
        questionsList.add(que6)

        val que7 = Question(
            7, " যদি  p : q : r = 1 : 2 : 4 হয়, তাহলে √( 5p² + q² + r²) এর সমান হবে - ",
            "5","2q", "5p","4r", 3
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "A, B, C 1 : 3 : 5 অনুপাতে একটি ব্যবসায় বিনিয়োগ করল। 4 মাস পরে A পূর্বের সমান মূলধন বিনিয়োগ করল এবং  B সেই সাথে C তাদের বিনিয়োগের অর্ধেক তুলে নিল। বছর শেষে তাদের লাভের অনুপাত কত?",
            "3:4:5", "5:6:10", "6:5:10","10:5:6", 2
        )
        questionsList.add(que8)

        val que9 = Question(
            9 , "ছয়টি স্বাভাবিক সংখ্যার প্রথম তিনটির সমষ্টি 27 হলে শেষ তিনটির সমষ্টি কত? ",
            "24", "25", "35", "36", 4
        )
        questionsList.add(que9)

        val que10 = Question(
            10, " দুতি ধনাত্মক সংখ্যার পার্থক্য 3 ও তাদের বর্গের  সমষ্টি  369 । তাদের সমষ্টি কত? ",
            "25", "27", "33","81", 2
        )

        questionsList.add(que10)





        return questionsList

    }
}