package Fragments_Shopping;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.onlineclothingshopping.MainActivity;
import com.onlineclothingshopping.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment_Shopping extends Fragment {

    private EditText user_login, pas_login;
    private Button btnloginbutton;

    public LoginFragment_Shopping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_login, container, false);


        View view = inflater.inflate(R.layout.fragment_login, container, false);

        user_login = view.findViewById(R.id.usrname);
        pas_login = view.findViewById(R.id.password);
        btnloginbutton = view.findViewById(R.id.btnlogin);

        btnloginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
        return view;
    }

    public void Login() {
        SharedPreferences sharedPreferences=this.getActivity().getSharedPreferences("User", Context.MODE_PRIVATE);
        String username=sharedPreferences.getString("username","");
        String password=sharedPreferences.getString("password","");

        if (username.equals(user_login.getText().toString()) && password.equals(pas_login.getText().toString())){
            Toast.makeText(this.getActivity(), "Successfully logged in", Toast.LENGTH_SHORT).show();

            Intent intent=new Intent(this.getActivity(), MainActivity.class);
            startActivity(intent);

        }
        else
        {
            Toast.makeText(this.getActivity(), "Invalid username and password", Toast.LENGTH_SHORT).show();
        }
    }

}
