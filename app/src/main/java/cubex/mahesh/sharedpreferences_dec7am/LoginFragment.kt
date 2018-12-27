package cubex.mahesh.sharedpreferences_dec7am

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.view.*

class LoginFragment : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.login,container,false)

       v.register.setOnClickListener {

        var fManager = activity!!.supportFragmentManager
        var tx = fManager.beginTransaction()
        tx.replace(R.id.frag1,RegisterFragment())
        tx.commit()

       }

        return v
    }

}