package com.example.contract;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

import com.example.contract.adaptar.UserAdapter;
import com.example.contract.data.Userinfo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Userinfo> userinfoList;
    RecyclerView recyclerView;
    UserAdapter adapter;
    LinearLayout flash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userinfoList=new ArrayList<>();
        userinfoList.add(new Userinfo("Tanvir Shaharia","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/277785209_140427151845981_3009493927659639847_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeHW9QaqSdqe1-5vYoWLJ7gILP2a0wNVBtAs_ZrTA1UG0CxYKOamNTY0G1drNwr2FADnF9m_HagdcpOgoS7yO5AM&_nc_ohc=uh6s7j8KKG8AX8H6adK&_nc_ht=scontent.fdac116-1.fna&oh=00_AfCHXW7f1vZ3Xns_2pJkEQKWp97zdxH-XtQJIMiUtY0C7w&oe=6378D7E4","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Sohanur Rahman","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/310120763_1253985382121511_6585509761561714006_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeGz0WYKoL_Wa3ktVi4HQFqxEOIeFVq-aRgQ4h4VWr5pGD64C10lOQd2eCX2Dx19yRJzTtwr9cGMvlookGgOmx9k&_nc_ohc=etgNvgG1BcAAX9hHAck&_nc_ht=scontent.fdac116-1.fna&oh=00_AfCNR1ez3DpZNbxrdvDT7X5Yh4BDe0si1ujJB_2C0NhZtA&oe=63789F13","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Mainur Rahman","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/315036991_1310348653054595_2166946508422427741_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeGVZB1hyqzrvqvQFglz_9AWdsFRa9MEaUd2wVFr0wRpR9GUO0dU2PC_pO7lcPlBkevDNfHc6ObB3KDSpQJD63qa&_nc_ohc=keFFj_lGFo0AX8S81LO&_nc_ht=scontent.fdac116-1.fna&oh=00_AfAvS2dN-EWFLr_vm0s4ekas_WWPIGj8abBhHKljRWyjcw&oe=637877A1","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Hasan Ali","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/274597502_659969165219129_6894313651239990704_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeGmPmqscUXu4WV4k2SVXq7MYwhLHOCaScljCEsc4JpJyUbsVEFHCl-nmGOgscfeyFjRiRSBMq1gWRHXTsBfPCcX&_nc_ohc=CVBgm-a2--UAX_zV36M&_nc_ht=scontent.fdac116-1.fna&oh=00_AfAcErGNvUYlRlpJRo2Gk1mvqeRV3syd_zGkc9zr3zeUvQ&oe=6377FC1F","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Deloyer","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/301022715_597529991973664_3415399453351079067_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeFX0COLmvzhbgZHpAhPDf5ZT2rOpvZUUIVPas6m9lRQhWGRD7Pq9guB7wjzyz4YiKqzuZzGCL9N6konBnK0dvw8&_nc_ohc=npQQdDyCQ5oAX_7eCuL&_nc_ht=scontent.fdac116-1.fna&oh=00_AfCmw9dhQRj0JoRlW4NST9VmentvmsqtL8wht3zH3Ac_Xg&oe=6377E4FD","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Tanha Rahman","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/315610603_120382354200226_8593339714839122626_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeF6GaIKgZvwqslzR5TeLTPl3rX8X_RIQzXetfxf9EhDNU71ICfqMagblRYNyA69BCME0Yyulfrz9q5XjXE_j05H&_nc_ohc=ol1U1WE5jqcAX_lEWA2&_nc_ht=scontent.fdac116-1.fna&oh=00_AfCwqduTcqP_4g1LoAHh_fenJKHaTA0q7FRQGhX5jRLxUg&oe=63797BA0","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Sazu Ahmed","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/275273531_501566694749296_6474698582133728102_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=8bfeb9&_nc_eui2=AeHJbs4gjwNvkVz3p9RAq28RsUGnG2pIlbmxQacbakiVuZT5svGOVn55rjJnYiPbSXGe0xhwvcS1YXH6opUY-IJ8&_nc_ohc=HHMmG5Fv9gsAX8Z8qeO&tn=EiA_sGLsV3ex-ETG&_nc_ht=scontent.fdac116-1.fna&oh=00_AfDvkV6AHF3f0TCvPS-D-SSwToOKgLOIxaUqDCFHDlqAFQ&oe=637865A6","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Sr Raju Ahmed","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/273155908_485722743000358_9196926253260758106_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=174925&_nc_aid=0&_nc_eui2=AeGECEU3Y1b3Wfo6y677C4O4retbJywnnpSt61snLCeelCzfqpR8o7Ks1HUnRccCEZZDcj_L1UEheViYZDkhzBh2&_nc_ohc=ziDuXsv9MWAAX91B898&_nc_ht=scontent.fdac116-1.fna&oh=00_AfA4BnRm-kogZ2y0A915lINPA6yIHxJhLWBdCAJl6HkEsg&oe=63793D7A","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Golam Rabbani","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/203905361_733887467328133_6038445034224403692_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeHpvKl6aHEXN222SjaC1WlmsY2stB5d8RKxjay0Hl3xEoRPnkoc19USHtQjw5nymtqHalhVpAnuTCYio31xM1JI&_nc_ohc=iYIX0pu91nEAX_u9_ub&_nc_ht=scontent.fdac116-1.fna&oh=00_AfDxeh9TW-Oiy3RZe3zlHvoFrbWku6Td4qk1pN3gfPTmVA&oe=637926C2","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Sohag Ahamed","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/290657221_587670082715059_9159856162313875125_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=8bfeb9&_nc_eui2=AeGipNTmoimFk0XQCPhYN8Xo1h6ZRdxKaorWHplF3EpqiqG0YvrTBGWMEq3VCTc-5B1ZfPbIzZQQ57gxh8p2uwOc&_nc_ohc=PBSHwkCFlpkAX-1HbbX&_nc_ht=scontent.fdac116-1.fna&oh=00_AfD7-kcpNUoTikBMjjAgrpgFmuLbytYGMhTZxCGSBqWsfw&oe=6377F131","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Sozib Hossian","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/276277809_1063556040874668_5933031808432230337_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=8bfeb9&_nc_eui2=AeG7SRasfVzboBesQeJKfkRqCJPSD_imcgEIk9IP-KZyATGGH_8Pojc_aanea_Q8fhePvb8Zfv8_MBJdyspUkbfW&_nc_ohc=Vgjek0ocIRAAX-gAG0E&_nc_ht=scontent.fdac116-1.fna&oh=00_AfCQaBO7jJavmJotXhV6L3pKFvtytWskERitMVJ3h_Xvlw&oe=63796BF6","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Shamim Ahamed","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/277668728_515425733301213_7653059175574635257_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeHPtvW5uMdYzzpn7po37HstNRrytuFb4OU1GvK24Vvg5YfMCdGuQfzYkFSBeUNtnSWfdCHKH4yl9452mt0bhw9f&_nc_ohc=I4NEbgp5ahAAX9v-jdT&_nc_ht=scontent.fdac116-1.fna&oh=00_AfDICyoG6eD3aKC3xZ4KXHe1osT8U7iaC5bDCdXDfBNxYQ&oe=63797EB0","email@yahoo.com","01644566945"));
        userinfoList.add(new Userinfo("Tahir Ahamed","https://scontent.fdac116-1.fna.fbcdn.net/v/t39.30808-6/283209382_1033558980870423_3476280000798423577_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeFfBKusVBRnAIjkf1AJmrMgaN5FXWH1zexo3kVdYfXN7J-Q_OKBihskYpPQ-3VT8qUeyz0JpI4fGQ4DKmUhYgyC&_nc_ohc=AWzeFVsM4MoAX8Hkcn5&tn=EiA_sGLsV3ex-ETG&_nc_ht=scontent.fdac116-1.fna&oh=00_AfA3H-L12qRS_Lk9zKoIz_2c2dEeF3DHT4ypPGnp6ncf2Q&oe=6379867C","email@yahoo.com","01644566945"));

        recyclerView=findViewById(R.id.rechyler);
        flash=findViewById(R.id.flash);


        adapter = new UserAdapter(MainActivity.this,userinfoList);
        recyclerView.setAdapter(adapter);

        flash.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            flash.setVisibility(View.GONE);
            }
        },4000);

    }
}