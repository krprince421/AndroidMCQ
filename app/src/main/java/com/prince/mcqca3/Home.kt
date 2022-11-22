package com.prince.mcqca3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class Home : AppCompatActivity() {

    lateinit var q1o1 : TextView
    lateinit var q1o2 : TextView
    lateinit var q1o3 : TextView
    lateinit var q1o4 : TextView

    lateinit var q2o1 : TextView
    lateinit var q2o2 : TextView

    lateinit var q3o1 : TextView
    lateinit var q3o2 : TextView
    lateinit var q3o3 : TextView
    lateinit var q3o4 : TextView

    lateinit var q4o1 : TextView
    lateinit var q4o2 : TextView
    lateinit var q4o3 : TextView
    lateinit var q4o4 : TextView

    lateinit var q5o1 : TextView
    lateinit var q5o2 : TextView
    lateinit var q5o3 : TextView
    lateinit var q5o4 : TextView

    lateinit var q6o1 : TextView
    lateinit var q6o2 : TextView
    lateinit var q6o3 : TextView
    lateinit var q6o4 : TextView

    lateinit var q7o1 : TextView
    lateinit var q7o2 : TextView
    lateinit var q7o3 : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home )

        q1o1 = findViewById( R.id.q1o1 )
        q1o2 = findViewById( R.id.q1o2 )
        q1o3 = findViewById( R.id.q1o3 )
        q1o4 = findViewById( R.id.q1o4 )

        q2o1 = findViewById( R.id.q2o1 )
        q2o2 = findViewById( R.id.q2o2 )

        q3o1 = findViewById( R.id.q3o1 )
        q3o2 = findViewById( R.id.q3o2 )
        q3o3 = findViewById( R.id.q3o3 )
        q3o4 = findViewById( R.id.q3o4 )

        q4o1 = findViewById( R.id.q4o1 )
        q4o2 = findViewById( R.id.q4o2 )
        q4o3 = findViewById( R.id.q4o3 )
        q4o4 = findViewById( R.id.q4o4 )

        q5o1 = findViewById( R.id.q5o1 )
        q5o2 = findViewById( R.id.q5o2 )
        q5o3 = findViewById( R.id.q5o3 )
        q5o4 = findViewById( R.id.q5o4 )

        q6o1 = findViewById( R.id.q6o1 )
        q6o2 = findViewById( R.id.q6o2 )
        q6o3 = findViewById( R.id.q6o3 )
        q6o4 = findViewById( R.id.q6o4 )

        q7o1 = findViewById( R.id.q7o1 )
        q7o2 = findViewById( R.id.q7o2 )
        q7o3 = findViewById( R.id.q7o3 )

        
        // For question number 1
        q1o1.setOnClickListener{
            q1o1.setBackgroundColor( Color.GREEN )
            q1o2.setBackgroundColor( Color.WHITE )
            q1o3.setBackgroundColor( Color.WHITE)
            q1o4.setBackgroundColor( Color.WHITE )
        }

        q1o2.setOnClickListener{
            q1o1.setBackgroundColor( Color.WHITE )
            q1o2.setBackgroundColor( Color.RED )
            q1o3.setBackgroundColor( Color.WHITE)
            q1o4.setBackgroundColor( Color.WHITE )
        }
        q1o3.setOnClickListener{
            q1o1.setBackgroundColor( Color.WHITE )
            q1o2.setBackgroundColor( Color.WHITE )
            q1o3.setBackgroundColor( Color.RED )
            q1o4.setBackgroundColor( Color.WHITE )
        }
        q1o4.setOnClickListener{
            q1o1.setBackgroundColor( Color.WHITE )
            q1o2.setBackgroundColor( Color.WHITE )
            q1o3.setBackgroundColor( Color.WHITE )
            q1o4.setBackgroundColor( Color.RED )
        }

        // FOR QUESTION 2

        q2o1.setOnClickListener{
            q2o1.setBackgroundColor( Color.GREEN )
            q2o2.setBackgroundColor( Color.WHITE )

        }

        q2o2.setOnClickListener{
            q2o1.setBackgroundColor( Color.WHITE )
            q2o2.setBackgroundColor( Color.RED )

        }


        // For question Number 3

        q3o1.setOnClickListener{
            q3o1.setBackgroundColor( Color.RED )
            q3o2.setBackgroundColor( Color.WHITE )
            q3o3.setBackgroundColor( Color.WHITE)
            q3o4.setBackgroundColor( Color.WHITE )
        }

        q3o2.setOnClickListener{
            q3o1.setBackgroundColor( Color.WHITE )
            q3o2.setBackgroundColor( Color.GREEN )
            q3o3.setBackgroundColor( Color.WHITE)
            q3o4.setBackgroundColor( Color.WHITE )
        }
        q3o3.setOnClickListener{
            q3o1.setBackgroundColor( Color.WHITE )
            q3o2.setBackgroundColor( Color.WHITE )
            q3o3.setBackgroundColor( Color.RED )
            q3o4.setBackgroundColor( Color.WHITE )
        }
        q3o4.setOnClickListener{
            q3o1.setBackgroundColor( Color.WHITE )
            q3o2.setBackgroundColor( Color.WHITE )
            q3o3.setBackgroundColor( Color.WHITE )
            q3o4.setBackgroundColor( Color.RED )
        }


        // For question 4

        q4o1.setOnClickListener{
            q4o1.setBackgroundColor( Color.RED )
            q4o2.setBackgroundColor( Color.WHITE )
            q4o3.setBackgroundColor( Color.WHITE)
            q4o4.setBackgroundColor( Color.WHITE )
        }

        q4o2.setOnClickListener{
            q4o1.setBackgroundColor( Color.WHITE )
            q4o2.setBackgroundColor( Color.RED )
            q4o3.setBackgroundColor( Color.WHITE)
            q4o4.setBackgroundColor( Color.WHITE )
        }
        q4o3.setOnClickListener{
            q4o1.setBackgroundColor( Color.WHITE )
            q4o2.setBackgroundColor( Color.WHITE )
            q4o3.setBackgroundColor( Color.GREEN )
            q4o4.setBackgroundColor( Color.WHITE )
        }
        q4o4.setOnClickListener{
            q4o1.setBackgroundColor( Color.WHITE )
            q4o2.setBackgroundColor( Color.WHITE )
            q4o3.setBackgroundColor( Color.WHITE )
            q4o4.setBackgroundColor( Color.RED )
        }

        // For question 5

        q5o1.setOnClickListener{
            q5o1.setBackgroundColor( Color.RED )
            q5o2.setBackgroundColor( Color.WHITE )
            q5o3.setBackgroundColor( Color.WHITE)
            q5o4.setBackgroundColor( Color.WHITE )
        }

        q5o2.setOnClickListener{
            q5o1.setBackgroundColor( Color.WHITE )
            q5o2.setBackgroundColor( Color.RED )
            q5o3.setBackgroundColor( Color.WHITE)
            q5o4.setBackgroundColor( Color.WHITE )
        }
        q5o3.setOnClickListener{
            q5o1.setBackgroundColor( Color.WHITE )
            q5o2.setBackgroundColor( Color.WHITE )
            q5o3.setBackgroundColor( Color.RED )
            q5o4.setBackgroundColor( Color.WHITE )
        }
        q5o4.setOnClickListener{
            q5o1.setBackgroundColor( Color.WHITE )
            q5o2.setBackgroundColor( Color.WHITE )
            q5o3.setBackgroundColor( Color.WHITE )
            q5o4.setBackgroundColor( Color.GREEN )
        }

        // For question 6

        q6o1.setOnClickListener{
            q6o1.setBackgroundColor( Color.RED )
            q6o2.setBackgroundColor( Color.WHITE )
            q6o3.setBackgroundColor( Color.WHITE)
            q6o4.setBackgroundColor( Color.WHITE )
        }

        q6o2.setOnClickListener{
            q6o1.setBackgroundColor( Color.WHITE )
            q6o2.setBackgroundColor( Color.RED )
            q6o3.setBackgroundColor( Color.WHITE)
            q6o4.setBackgroundColor( Color.WHITE )
        }
        q6o3.setOnClickListener{
            q6o1.setBackgroundColor( Color.WHITE )
            q6o2.setBackgroundColor( Color.WHITE )
            q6o3.setBackgroundColor( Color.GREEN )
            q6o4.setBackgroundColor( Color.WHITE )
        }
        q6o4.setOnClickListener{
            q6o1.setBackgroundColor( Color.WHITE )
            q6o2.setBackgroundColor( Color.WHITE )
            q6o3.setBackgroundColor( Color.WHITE )
            q6o4.setBackgroundColor( Color.RED )
        }

        // FOR QUESTION 7

        q7o1.setOnClickListener{
            q7o1.setBackgroundColor( Color.GREEN )
            q7o2.setBackgroundColor( Color.WHITE )
            q7o3.setBackgroundColor( Color.WHITE)
        }

        q7o2.setOnClickListener{
            q7o1.setBackgroundColor( Color.WHITE )
            q7o2.setBackgroundColor( Color.RED )
            q7o3.setBackgroundColor( Color.WHITE)

        }
        q7o3.setOnClickListener{
            q7o1.setBackgroundColor( Color.WHITE )
            q7o2.setBackgroundColor( Color.WHITE )
            q7o3.setBackgroundColor( Color.RED )

        }

    }
}