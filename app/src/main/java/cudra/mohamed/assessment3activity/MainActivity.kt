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
                tilNumbOne.error=getString(R.string.numbOneAdd_Error)
                return@setOnClickListener
            }
            if (numbTwo.isBlank()){
                tilNumbTwo.error=getString(R.string.numbTwoAdd_Error)
                return@setOnClickListener
            }
            addition(numbOne.toDouble(),numbTwo.toDouble())
        }
        btnSubtract.setOnClickListener {
            tvResults.text=""
            val numbOne=etNumbOne.toString()
            val numbTwo=etNumbTwo.toString()

            if (numbOne.isBlank()){
                tilNumbOne.error=getString(R.string.numbOneSubtract_Error)
                return@setOnClickListener
            }
            if (numbTwo.isBlank()){
                tilNumbTwo.error=getString(R.string.numbTwoSubtract_Error)
                return@setOnClickListener
            }
            subtraction(numbOne.toDouble(),numbTwo.toDouble())
        }
        btnModulus.setOnClickListener {
            tvResults.text=""
            val numbOne=etNumbOne.toString()
            val numbTwo=etNumbTwo.toString()

            if (numbOne.isBlank()){
                tilNumbOne.error=getString(R.string.numbOneModulus_Error)
                return@setOnClickListener
            }
            if (numbTwo.isBlank()){
                tilNumbTwo.error=getString(R.string.numbTwoModulus_Error)
                return@setOnClickListener
            }
            moduluss(numbOne.toDouble(),numbTwo.toDouble())
        }
        btnDivision.setOnClickListener {
            tvResults.text=""
            val numbOne=etNumbOne.toString()
            val numbTwo=etNumbTwo.toString()

            if (numbOne.isBlank()){
                tilNumbOne.error=getString(R.string.numbOneDivision_Error)
                return@setOnClickListener
            }
            if (numbTwo.isBlank()){
                tilNumbTwo.error=getString(R.string.numbTwoDivision_Error)
                return@setOnClickListener
            }
            division(numbOne.toDouble(),numbTwo.toDouble())
        }
    }
    fun addition(etNumbOne:Double,etNumbTwo:Double){
        var sum=etNumbOne + etNumbTwo
        tvResults.text=sum.toString()
    }
    fun subtraction(etNumbOne:Double,etNumbTwo:Double){
        var subtract=etNumbOne - etNumbTwo
        tvResults.text=subtract.toString()
    }
    fun moduluss(etNumbOne:Double,etNumbTwo:Double){
        var modulus=etNumbOne % etNumbTwo
        tvResults.text=modulus.toString()
    }
    fun division(etNumbOne:Double,etNumbTwo:Double){
        var divide=etNumbOne / etNumbTwo
        tvResults.text=divide.toString()
    }
}
