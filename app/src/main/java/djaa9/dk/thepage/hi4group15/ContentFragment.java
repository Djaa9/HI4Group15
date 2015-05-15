package djaa9.dk.thepage.hi4group15;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ContentFragment extends Fragment {
    public static final String ARG_SELECTED_ITEM ="param1" ;
    private String _selectedItem;
    private MenuFragment.OnFragmentInteractionListener mListener;
    private TextView _textView;

    public static ContentFragment newInstance(String param1) {
        ContentFragment fragment = new ContentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SELECTED_ITEM, param1);
        fragment.setArguments(args);
        return fragment;
    }

    public ContentFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            _selectedItem = getArguments().getString(ARG_SELECTED_ITEM);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_content, container, false);
        _textView = (TextView) v.findViewById(R.id.content_frag_txt);

        // Inflate the layout for this fragment
        _textView.setText(_selectedItem);
        return v;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}
