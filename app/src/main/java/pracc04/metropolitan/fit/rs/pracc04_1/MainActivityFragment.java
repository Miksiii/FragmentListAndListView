package pracc04.metropolitan.fit.rs.pracc04_1;

import android.app.ListFragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivityFragment extends ListFragment {

    private String[] fitSubjects;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        fitSubjects = getResources().getStringArray(R.array.fit_subjects);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, fitSubjects);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView listVew, View view, int position, long id) {
        super.onListItemClick(listVew, view, position, id);
        Toast.makeText(getActivity(), "You choose: " + getListView().getItemAtPosition(position), Toast.LENGTH_LONG).show();
    }

}
