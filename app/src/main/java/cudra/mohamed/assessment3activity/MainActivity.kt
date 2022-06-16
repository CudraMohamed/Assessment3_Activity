package cudra.mohamed.assessment3activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tvTwoNums:TextView

    lateinit var tilNumbOne:TextInputLayout
    lateinit var etNumbOne:TextInputEditText

    lateinit var tilNumbTwo:TextInputLayout
    lateinit var etNumbTwo:TextInputEditText

    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnDivision:Button

    lateinit var tvResults:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTwoNums=findViewById(R.id.tvTwoNums)
        tilNumbOne=findViewById(R.id.tilNumbOne)
        etNumbOne=findViewById(R.id.etNumbOne)
        tilNumbTwo=findViewById(R.id.tilNumbTwo)
        etNumbTwo=findViewById(R.id.etNumbTwo)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnModulus=findViewById(R.id.btnModulus)
        btnDivision=findViewById(R.id.btnDivision)
        tvResults=findViewById(R.id.tvResults)

        btnAdd.setOnClickListener {
            tvResults.text=""
            val numbOne=etNumbOne.toString()
            val numbTwo=etNumbTwo.toString()

            if (numbOne.isBlank()){
                tilNumbOne.error="Number is Required"
                return@setOnClickListener
            }
            if (numbTwo.isBlank()){
                tilNumbTwo.error="Number is Required"
                return@setOnClickListener
            }
            addition(numbOne.toInt(),numbTwo.toInt())
        }
        btnSubtract.setOnClickListener {
            tvResults.text=""
            val numbOne=etNumbOne.toString()
            val numbTwo=etNumbTwo.toString()

            if (numbOne.isBlank()){
                tilNumbOne.error="Number is Required"
                return@setOnClickListener
            }
            if (numbTwo.isBlank()){
                tilNumbTwo.error="Number is Required"
                return@setOnClickListener
            }
            subtraction(numbOne.toInt(),numbTwo.toInt())
        }
        btnModulus.setOnClickListener {
            tvResults.text=""
            val numbOne=etNumbOne.toString()
            val numbTwo=etNumbTwo.toString()

            if (numbOne.isBlank()){
                tilNumbOne.error="Number is Required"
                return@setOnClickListener
            }
            if (numbTwo.isBlank()){
                tilNumbTwo.error="Number is Required"
                return@setOnClickListener
            }
            moduluss(numbOne.toInt(),numbTwo.toInt())
        }
        btnDivision.setOnClickListener {
            tvResults.text=""
            val numbOne=etNumbOne.toString()
            val numbTwo=etNumbTwo.toString()

            if (numbOne.isBlank()){
                tilNumbOne.error="Number is Required"
                return@setOnClickListener
            }
            if (numbTwo.isBlank()){
                tilNumbTwo.error="Number is Required"
                return@setOnClickListener
            }
            division(numbOne.toInt(),numbTwo.toInt())
        }
    }
    fun addition(etNumbOne:Int,etNumbTwo:Int){
        var sum=etNumbOne + etNumbTwo
        tvResults.text=sum.toString()
    }
    fun subtraction(etNumbOne:Int,etNumbTwo:Int){
        var subtract=etNumbOne - etNumbTwo
        tvResults.text=subtract.toString()
    }
    fun moduluss(etNumbOne:Int,etNumbTwo:Int){
        var modulus=etNumbOne % etNumbTwo
        tvResults.text=modulus.toString()
    }
    fun division(etNumbOne:Int,etNumbTwo:Int){
        var divide=etNumbOne / etNumbTwo
        tvResults.text=divide.toString()
    }
}
