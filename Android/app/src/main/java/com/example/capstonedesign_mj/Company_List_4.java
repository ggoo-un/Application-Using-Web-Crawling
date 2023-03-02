package com.example.capstonedesign_mj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Company_List_4 extends Activity {

    private static int num =1;

    private static String name[] = new String[5];
    private static String field[] = new String[5];
    private static String area[] = new String[5];
    private static String salary[] = new String[5];

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.comp_search);

        int cnt = 5;
        int image[] = new int[cnt];
        image[0] = R.drawable.noimage;

        //객체생성
        LinearLayout comp_frame[] = new LinearLayout[cnt];
        ImageView comp_image[] = new ImageView[cnt];
        LinearLayout text_frame[] = new LinearLayout[cnt];
        LinearLayout sub_frame1[] = new LinearLayout[cnt];
        LinearLayout sub_frame2[] = new LinearLayout[cnt];
        TextView comp_name[] = new TextView[cnt];
        TextView slash[] = new TextView[cnt];
        TextView comp_field[] = new TextView[cnt];
        TextView comp_area[] = new TextView[cnt];
        TextView comp_salary[] = new TextView[cnt];
        Button comp_bookmark[] = new Button[cnt];


        //어느나라 기업인지 보여주는 코드
        final TextView domain = (TextView)findViewById(R.id.domain);
        Intent intent = getIntent();
        final int code = intent.getExtras().getInt("code");

        switch(code)
        {
            case 1:
                domain.setText("<국내 100대 대기업 목록>");
                image[0] = R.drawable.samsung;
                name[0] = "삼성";
                field[0] = "통합IT";
                area[0] = "32만 명";
                salary[0] = "4000만 원";

                num=1;
                break;
            case 2:
                domain.setText("<국내 400대 벤처기업 목록>");
                image[0] = R.drawable.wonderful;
                name[0] = "원더풀 플랫폼";
                field[0] = "머신러닝,AI";
                area[0] = "40 명";
                salary[0] = "3300만 원";

                num=1;
                break;
            case 3:
                domain.setText("<미국 100대 기업 목록>");
                image[0] = R.drawable.google_icon;
                name[0] = "Google";
                field[0] = "integrated IT";
                area[0] = "10만 명";
                salary[0] = "1억 3000만 원";

                image[1] = R.drawable.facebook;
                name[1] = "Facebook";
                field[1] = "integrated IT";
                area[1] = "3만 명";
                salary[1] = "1억 2000만원";

                image[2] = R.drawable.cisco;
                name[2] = "Cisco";
                field[2] = "Network System";
                area[2] = "7만 명";
                salary[2] = "7000만원";

                num=3;
                break;
            case 4:
                domain.setText("<일본 100대 기업 목록>");
                image[0] = R.drawable.noimage;
                num=0;
                break;
            case 5:
                domain.setText("<중국 100대 기업 목록>");
                image[0] = R.drawable.xiaomi;
                name[0] = "小米";
                field[0] = "积分";
                area[0] = "1.7만 명";
                salary[0] = "3100만원";

                image[1] = R.drawable.didi;
                name[1] = "滴滴";
                field[1] = "艺术";
                area[1] = "7천 명";
                salary[1] = "4550만원";

                image[2] = R.drawable.vivo;
                name[2] = "Vivo";
                field[2] = "发展";
                area[2] = "1만 명";
                salary[2] = "2500만원";

                num=3;
                break;
        }

        for (int i=num; i<cnt; i++){
            image[i] = R.drawable.noimage;
            name[i] = "기업 " + i;
            field[i] = "분야 " + i;
            area[i] = "지역 " + i;
            salary[i] = "평균연봉 " + i;
        }

        //기업 목록 생성
        LinearLayout company_list = (LinearLayout)findViewById(R.id.company_list);

        //레이아웃 생성

        LinearLayout.LayoutParams big_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        big_param.height = DtS(100);

        LinearLayout.LayoutParams img_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
        img_param.width = DtS(100);
        img_param.weight = 1;

        LinearLayout.LayoutParams small_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
        small_param.width = DtS(237);
        small_param.weight = 1;

        LinearLayout.LayoutParams sub1_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        sub1_param.height = DtS(55);

        LinearLayout.LayoutParams sub2_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout.LayoutParams name_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        name_param.width = DtS(100);
        name_param.gravity = Gravity.CENTER;

        LinearLayout.LayoutParams slash_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        slash_param.width = DtS(0.25);
        slash_param.weight = 1;
        slash_param.topMargin = DtS(5);
        slash_param.bottomMargin = DtS(5);
        slash_param.gravity = Gravity.CENTER;

        LinearLayout.LayoutParams field_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        field_param.width = DtS(100);
        field_param.gravity = Gravity.CENTER;
        field_param.weight = 1;

        LinearLayout.LayoutParams area_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        area_param.width = DtS(100);
        area_param.gravity = Gravity.CENTER;

        LinearLayout.LayoutParams salary_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        salary_param.width = DtS(100);
        salary_param.gravity = Gravity.CENTER;
        salary_param.weight = 1;

        LinearLayout.LayoutParams but_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        but_param.setMargins(DtS(10),DtS(10),DtS(10),DtS(10));
        but_param.weight = 1;

        final int test[] = {1,2,3,4,5};

        //기업 생성
       for(int i=0;i<cnt;i++) {

           final int position = i;
           final int get_image = image[i];
           final String get_name = name[i];
           final String get_field = field[i];
           final String get_area = area[i];
           final String get_salary = salary[i];

            comp_frame[i] = new LinearLayout(this);
            comp_frame[i].setOrientation(LinearLayout.HORIZONTAL);
            comp_frame[i].setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Job_List_5.class);
                    intent.putExtra("code",code);
                    intent.putExtra("code2", position);
                    intent.putExtra("image", get_image);
                    intent.putExtra("name", get_name);
                    intent.putExtra("field", get_field);
                    intent.putExtra("area", get_area);
                    intent.putExtra("salary", get_salary);
                    startActivity(intent);
                }

            });
            company_list.addView(comp_frame[i], big_param);

            comp_image[i] = new ImageView(this);
            comp_image[i].setImageResource(image[i]);
            comp_frame[i].addView(comp_image[i], img_param);

            text_frame[i] = new LinearLayout(this);
            text_frame[i].setOrientation(LinearLayout.VERTICAL);
            comp_frame[i].addView(text_frame[i],small_param);

            sub_frame1[i] = new LinearLayout(this);
            sub_frame1[i].setOrientation(LinearLayout.HORIZONTAL);
            text_frame[i].addView(sub_frame1[i],sub1_param);


            comp_name[i] = new TextView(this);
            comp_name[i].setText(name[i]);
            comp_name[i].setTextSize(21);
            comp_name[i].setGravity(Gravity.CENTER);
            sub_frame1[i].addView(comp_name[i], name_param);

            slash[i] = new TextView(this);
            slash[i].setText("/");
            slash[i].setGravity(Gravity.CENTER);
            slash[i].setTextSize(25);
            sub_frame1[i].addView(slash[i],slash_param);

            comp_field[i] = new TextView(this);
            comp_field[i].setText(field[i]);
            comp_field[i].setTextSize(21);
            comp_field[i].setGravity(Gravity.CENTER);
            sub_frame1[i].addView(comp_field[i], field_param);

            sub_frame2[i] = new LinearLayout(this);
            sub_frame2[i].setOrientation(LinearLayout.HORIZONTAL);
            text_frame[i].addView(sub_frame2[i],sub2_param);

            comp_area[i] = new TextView(this);
            comp_area[i].setText(area[i]);
            comp_area[i].setTextSize(20);
            comp_area[i].setGravity(Gravity.CENTER);
            sub_frame2[i].addView(comp_area[i], area_param);

            comp_salary[i] = new TextView(this);
            comp_salary[i].setText(salary[i]);
            comp_salary[i].setTextSize(20);
            comp_salary[i].setGravity(Gravity.CENTER);
            sub_frame2[i].addView(comp_salary[i], salary_param);

            comp_bookmark[i] = new Button(this);
            comp_bookmark[i].setText("☆");
            comp_bookmark[i].setTextSize(30);
            comp_frame[i].addView(comp_bookmark[i], but_param);
        }

    }

    public void logout(View view){
        Intent intent = new Intent(getApplicationContext(), Login_1.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public int DtS(double DP){ //DP -> 픽셀 변환
        double SP = DP*(getResources().getDisplayMetrics().density);
        return (int)SP;
    }

    public void Pop(View view){
        Intent intent = getIntent();
        final int code = intent.getExtras().getInt("code");

       intent = new Intent(getApplicationContext(), Rotation_List.class);
        switch(code)
        {
            case 1:
                intent.putExtra("code",1);
                startActivity(intent);
                break;
            case 2:
                intent.putExtra("code",2);
                startActivity(intent);
                break;
            case 3:
                intent.putExtra("code",3);
                startActivity(intent);
                break;
            case 4:
                intent.putExtra("code",4);
                startActivity(intent);
                break;
            case 5:
                intent.putExtra("code",5);
                startActivity(intent);
                break;
        }
    }

}
