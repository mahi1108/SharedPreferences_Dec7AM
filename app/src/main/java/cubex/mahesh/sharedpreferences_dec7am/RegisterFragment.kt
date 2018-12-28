package cubex.mahesh.sharedpreferences_dec7am

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.register.*
import kotlinx.android.synthetic.main.register.view.*

class RegisterFragment : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.register,container,false)

        v.submit.setOnClickListener {

            if (validations(v)) {

                var spf: SharedPreferences = activity!!.getSharedPreferences(
                    "and7amdec", Context.MODE_PRIVATE
                )
                var spe: SharedPreferences.Editor = spf.edit()
                spe.putString("uname", v.username.text.toString())
                spe.putString("pass", v.pass.text.toString())
                spe.putString("email", v.email.text.toString())
                spe.putLong("phoneno", v.mno.text.toString().toLong())
                spe.commit()

                var fManager = activity!!.supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1, LoginFragment())
                tx.commit()

            }
        }



        return v
    }

    fun  validations(v:View):Boolean {
      var msg = ""

        if(v.username.text.length == 0){
            msg = "Please Enter User Name"
        }
        if(v.pass.text.length == 0){
            msg = msg + "\n Please Enter Password"
        }
        if(v.email.text.length == 0){
            msg = msg + "\n Please Enter Email"
        }
        if(v.mno.text.length != 10){
            msg = msg + "\n Please Enter Valid Mobile Number"
        }

        if(msg.equals("")){
            return  true
        }else{

            Toast.makeText(activity, msg,Toast.LENGTH_LONG).show()

            return  false
        }

    }


}  // RegisterFragment