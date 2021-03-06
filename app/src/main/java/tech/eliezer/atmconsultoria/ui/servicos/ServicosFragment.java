package tech.eliezer.atmconsultoria.ui.servicos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import tech.eliezer.atmconsultoria.R;
import tech.eliezer.atmconsultoria.ui.tools.ToolsViewModel;

public class ServicosFragment extends Fragment {

    public ServicosFragment() {
    }


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_servicos, container, false);
        final TextView textView = root.findViewById(R.id.text_tools);

        return root;
    }
}