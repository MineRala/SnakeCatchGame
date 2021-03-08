package com.example.snakeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    var score =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "Your Score : 0"
        b1.visibility = View.INVISIBLE;
        b2.visibility = View.INVISIBLE;
        b3.visibility = View.INVISIBLE;
        b4.visibility = View.INVISIBLE;
        b5.visibility = View.INVISIBLE;
        b6.visibility = View.INVISIBLE;
        b7.visibility = View.INVISIBLE;
        b8.visibility = View.INVISIBLE;
        b9.visibility = View.INVISIBLE;

        object : CountDownTimer(10000000,2000){

            override fun onFinish() {

            }


            override fun onTick(millisUntilFinished: Long) {
                var random = (1..9).random()

                if(random == 1){
                    b1.visibility =  View.VISIBLE
                }

                else if(random == 2){
                    b2.visibility =  View.VISIBLE
                }

                else if(random == 3){
                    b3.visibility =  View.VISIBLE
                }

                else if(random == 4){
                    b4.visibility =  View.VISIBLE
                }

                else if(random == 5){
                    b5.visibility =  View.VISIBLE
                }

                else if(random == 6){
                    b6.visibility =  View.VISIBLE
                }

                else if(random == 7){
                    b7.visibility =  View.VISIBLE
                }

                else if(random == 8){
                    b8.visibility =  View.VISIBLE
                }

                else if(random == 9){
                    b9.visibility =  View.VISIBLE
                }

              GlobalScope.launch(context = Dispatchers.Main){

                  delay(500)

                  b1.visibility = View.INVISIBLE;
                  b2.visibility = View.INVISIBLE;
                  b3.visibility = View.INVISIBLE;
                  b4.visibility = View.INVISIBLE;
                  b5.visibility = View.INVISIBLE;
                  b6.visibility = View.INVISIBLE;
                  b7.visibility = View.INVISIBLE;
                  b8.visibility = View.INVISIBLE;
                  b9.visibility = View.INVISIBLE;
              }


            }



        }.start()

    }

    fun b1(view: View){
        if(b1.visibility == View.VISIBLE){
            score++
            textView.text = "Your Score : ${score}"
        }
    }

    fun b2(view: View){
        if(b2.visibility == View.VISIBLE){
            score++
            textView.text = "Your Score : ${score}"
        }
    }

    fun b3(view: View){
        if(b3.visibility == View.VISIBLE){
            score++
            textView.text = "Your Score : ${score}"
        }
    }

    fun b4(view: View){
        if(b4.visibility == View.VISIBLE){
            score++
            textView.text = "Your Score : ${score}"
        }
    }

    fun b5(view: View){
        if(b5.visibility == View.VISIBLE){
            score++
            textView.text = "Your Score : ${score}"
        }
    }

    fun b6(view: View){
        if(b6.visibility == View.VISIBLE){
            score++
            textView.text = "Your Score : ${score}"
        }
    }

    fun b7(view: View){
        if(b7.visibility == View.VISIBLE){
            score++
            textView.text = "Your Score : ${score}"
        }
    }

    fun b8(view: View){
        if(b8.visibility == View.VISIBLE){
            score++
            textView.text = "Your Score : ${score}"
        }
    }

    fun b9(view: View){
        if(b9.visibility == View.VISIBLE){
            score++
            textView.text = "Your Score : ${score}"
        }
    }
}