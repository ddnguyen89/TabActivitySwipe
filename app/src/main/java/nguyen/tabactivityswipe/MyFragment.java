package nguyen.tabactivityswipe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    //define widget variables
    private TextView msgTV;
    private Button clickMe;

    public MyFragment() {
        // Required empty public constructor
    }

    public static MyFragment newInstance() {
        MyFragment fragment = new MyFragment();

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);

        msgTV = rootView.findViewById(R.id.msgTV);
        clickMe = rootView.findViewById(R.id.clickButton);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(msgTV.getText().toString().contains("Welcome")) {
                    msgTV.setText("Hi");
                } else {
                    msgTV.setText("Welcome");
                }
            }
        });

        return rootView;
    }

}
