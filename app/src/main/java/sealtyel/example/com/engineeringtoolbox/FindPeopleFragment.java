package sealtyel.example.com.engineeringtoolbox;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FindPeopleFragment extends Fragment {
	
	public FindPeopleFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_find_people, container, false);
        Button boton= (Button) rootView.findViewById(R.id.buttonFind);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            		Toast toast1 = android.widget.Toast.makeText(getActivity().getApplicationContext(),"Find",android.widget.Toast.LENGTH_SHORT);
            		toast1.show();
            	}
            		
            
        });
        return rootView;
    }
}
