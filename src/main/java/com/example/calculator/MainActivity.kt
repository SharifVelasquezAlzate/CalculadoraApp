package com.example.calculator

import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultadoTemporal = "";
        var resultadoAnterior = "";

        clearButton.setOnClickListener {view ->
            println("C")
        }

        bracketsButton.setOnClickListener{view ->
        
        }

        powerButton.setOnClickListener{view ->
            
        }

        divideButton.setOnClickListener{view ->
            resultadoTemporal += " /";
            result.text = resultadoTemporal;
            resultadoAnterior = resultadoTemporal;
            lastResult.text = resultadoAnterior;
            result.text = "";
            resultadoTemporal = "";
        }
        
        sevenButton.setOnClickListener{view ->
            resultadoTemporal += "7";
            result.text = resultadoTemporal;
        }

        eightButton.setOnClickListener{view ->
            resultadoTemporal += "8";
            result.text = resultadoTemporal;
        }

        nineButton.setOnClickListener{view ->
            resultadoTemporal += "9";
            result.text = resultadoTemporal;
        }

        multiplicationButton.setOnClickListener{view ->
            resultadoTemporal += " *";
            result.text = resultadoTemporal;
            resultadoAnterior = resultadoTemporal;
            lastResult.text = resultadoAnterior;
            result.text = "";
            resultadoTemporal = "";
        }

        fourButton.setOnClickListener{view ->
            resultadoTemporal += "4";
            result.text = resultadoTemporal;
        }

        fiveButton.setOnClickListener{view ->
            resultadoTemporal += "5";
            result.text = resultadoTemporal;
        }

        sixButton.setOnClickListener{view ->
            resultadoTemporal += "6";
            result.text = resultadoTemporal;
        }                

        restButton.setOnClickListener{view ->
            resultadoTemporal += " -";
            result.text = resultadoTemporal;
            resultadoAnterior = resultadoTemporal;
            lastResult.text = resultadoAnterior;
            result.text = "";
            resultadoTemporal = "";
        }

        oneButton.setOnClickListener{view ->
            resultadoTemporal += "1";
            result.text = resultadoTemporal;
        }


        twoButton.setOnClickListener{view ->
            resultadoTemporal += "2";
            result.text = resultadoTemporal;
        }


        threeButton.setOnClickListener{view ->
            resultadoTemporal += "3";
            result.text = resultadoTemporal;
        }


        plusButton.setOnClickListener{view ->
            resultadoTemporal += " +";
            result.text = resultadoTemporal;
            resultadoAnterior = resultadoTemporal;
            lastResult.text = resultadoAnterior;
            result.text = "";
            resultadoTemporal = "";
        }


        moreOrLessButton.setOnClickListener{view ->
            
        }

        pointButton.setOnClickListener{view ->
        
        }

        zeroButton.setOnClickListener{view ->
            resultadoTemporal += "0";
            result.text = resultadoTemporal;
        }

        equalButton.setOnClickListener{view ->
            resultadoAnterior += resultadoTemporal;
            resultadoTemporal = solveOperation(resultadoAnterior).toString();
            result.text = resultadoTemporal;
        }
    }

    fun solveOperation (operation: String) {
        val engine = ScriptEngineManager().getEngineByExtension("kts")!!
        return engine.eval(operation);
    }
}