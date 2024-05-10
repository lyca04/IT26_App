package com.example.appproposal;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BibleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BibleFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BibleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BibleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BibleFragment newInstance(String param1, String param2) {
        BibleFragment fragment = new BibleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_bible, container, false);

        CardView gen = view.findViewById(R.id.gen);
        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Genesis.class);
                startActivity(intent);
            }
        });

        CardView exo = view.findViewById(R.id.exo);
        exo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Exodo.class);
                startActivity(intent);
            }
        });

        CardView lev = view.findViewById(R.id.lev);
        lev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Levitico.class);
                startActivity(intent);
            }
        });

        CardView num = view.findViewById(R.id.num);
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Numeros.class);
                startActivity(intent);
            }
        });

        CardView deut = view.findViewById(R.id.deut);
        deut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Deutoronomio.class);
                startActivity(intent);
            }
        });

        CardView jos = view.findViewById(R.id.jos);
        jos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Josue.class);
                startActivity(intent);
            }
        });

        CardView mag = view.findViewById(R.id.mag);
        mag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Maghuhukom.class);
                startActivity(intent);
            }
        });

        CardView ruth = view.findViewById(R.id.ruth);
        ruth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Ruth.class);
                startActivity(intent);
            }
        });

        CardView sam = view.findViewById(R.id.sam);
        sam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Samuel.class);
                startActivity(intent);
            }
        });

        CardView hari = view.findViewById(R.id.hari);
        hari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Hari.class);
                startActivity(intent);
            }
        });

        CardView cron = view.findViewById(R.id.cron);
        cron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Cronicas.class);
                startActivity(intent);
            }
        });

        CardView esd = view.findViewById(R.id.esd);
        esd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Esdras.class);
                startActivity(intent);
            }
        });

        CardView neh = view.findViewById(R.id.neh);
        neh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Nehemias.class);
                startActivity(intent);
            }
        });

        CardView est = view.findViewById(R.id.est);
        est.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Ester.class);
                startActivity(intent);
            }
        });

        CardView job = view.findViewById(R.id.job);
        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Job.class);
                startActivity(intent);
            }
        });

        CardView sal = view.findViewById(R.id.sal);
        sal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Salmo.class);
                startActivity(intent);
            }
        });

        CardView pan = view.findViewById(R.id.pan);
        pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Panultihon.class);
                startActivity(intent);
            }
        });

        CardView ecc = view.findViewById(R.id.ecc);
        ecc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Ecclesiastes.class);
                startActivity(intent);
            }
        });

        CardView awit = view.findViewById(R.id.awit);
        awit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Awit.class);
                startActivity(intent);
            }
        });

        CardView is = view.findViewById(R.id.is);
        is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Isaias.class);
                startActivity(intent);
            }
        });

        CardView jer = view.findViewById(R.id.jer);
        jer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Jeremias.class);
                startActivity(intent);
            }
        });

        CardView pag = view.findViewById(R.id.pag);
        pag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Pagbangutan.class);
                startActivity(intent);
            }
        });

        CardView eze = view.findViewById(R.id.eze);
        eze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Ezequiel.class);
                startActivity(intent);
            }
        });

        CardView dan = view.findViewById(R.id.dan);
        dan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Daniel.class);
                startActivity(intent);
            }
        });

        CardView os = view.findViewById(R.id.os);
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Oseas.class);
                startActivity(intent);
            }
        });

        CardView joel = view.findViewById(R.id.joel);
        joel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Joel.class);
                startActivity(intent);
            }
        });

        CardView amos = view.findViewById(R.id.amos);
        amos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Amos.class);
                startActivity(intent);
            }
        });

        CardView abd = view.findViewById(R.id.abd);
        abd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Abdias.class);
                startActivity(intent);
            }
        });

        CardView jon = view.findViewById(R.id.jon);
        jon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Jonas.class);
                startActivity(intent);
            }
        });

        CardView miq = view.findViewById(R.id.miq);
        miq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Miqueas.class);
                startActivity(intent);
            }
        });

        CardView nah = view.findViewById(R.id.nah);
        nah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Nahum.class);
                startActivity(intent);
            }
        });

        CardView hab = view.findViewById(R.id.hab);
        hab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Habacuc.class);
                startActivity(intent);
            }
        });

        CardView sof = view.findViewById(R.id.sof);
        sof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Sofonias.class);
                startActivity(intent);
            }
        });

        CardView hag = view.findViewById(R.id.hag);
        hag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Hageo.class);
                startActivity(intent);
            }
        });

        CardView zac = view.findViewById(R.id.zac);
        zac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Zacarias.class);
                startActivity(intent);
            }
        });

        CardView mal = view.findViewById(R.id.mal);
        mal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Malaquias.class);
                startActivity(intent);
            }
        });

        CardView mat = view.findViewById(R.id.mat);
        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Mateo.class);
                startActivity(intent);
            }
        });

        CardView mar = view.findViewById(R.id.mar);
        mar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Marcos.class);
                startActivity(intent);
            }
        });

        CardView luc = view.findViewById(R.id.luc);
        luc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Lucas.class);
                startActivity(intent);
            }
        });

        CardView juan = view.findViewById(R.id.juan);
        juan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Juan.class);
                startActivity(intent);
            }
        });

        CardView buh = view.findViewById(R.id.buh);
        buh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Buhat.class);
                startActivity(intent);
            }
        });

        CardView roma = view.findViewById(R.id.rom);
        roma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Roma.class);
                startActivity(intent);
            }
        });

        CardView cor = view.findViewById(R.id.cor);
        cor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Corinto.class);
                startActivity(intent);
            }
        });

        CardView gal = view.findViewById(R.id.gal);
        gal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Galacia.class);
                startActivity(intent);
            }
        });

        CardView ef = view.findViewById(R.id.ef);
        ef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Efeso.class);
                startActivity(intent);
            }
        });

        CardView fil = view.findViewById(R.id.fil);
        fil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Filipos.class);
                startActivity(intent);
            }
        });

        CardView col = view.findViewById(R.id.col);
        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Colosas.class);
                startActivity(intent);
            }
        });

        CardView tes = view.findViewById(R.id.tes);
        tes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Tesalonica.class);
                startActivity(intent);
            }
        });

        CardView tim = view.findViewById(R.id.tim);
        tim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Timoteo.class);
                startActivity(intent);
            }
        });

        CardView tito = view.findViewById(R.id.tito);
        tito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Tito.class);
                startActivity(intent);
            }
        });

        CardView filim = view.findViewById(R.id.filim);
        filim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Filemon.class);
                startActivity(intent);
            }
        });

        CardView heb = view.findViewById(R.id.heb);
        heb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Hebreo.class);
                startActivity(intent);
            }
        });

        CardView san = view.findViewById(R.id.san);
        san.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Santiago.class);
                startActivity(intent);
            }
        });

        CardView ped = view.findViewById(R.id.ped);
        ped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Pedro.class);
                startActivity(intent);
            }
        });

        CardView juan1 = view.findViewById(R.id.juan1);
        juan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Juan1.class);
                startActivity(intent);
            }
        });

        CardView jud = view.findViewById(R.id.jud);
        jud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Judas.class);
                startActivity(intent);
            }
        });

        CardView pin = view.findViewById(R.id.pin);
        pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Pinadayag.class);
                startActivity(intent);
            }
        });

        return view;
    }
}