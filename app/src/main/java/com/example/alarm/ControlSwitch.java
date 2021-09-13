package com.example.alarm;

import android.database.Cursor;
import android.widget.Toast;

public class ControlSwitch {




    public static void ControlDay(int dayNo) {

        switch (dayNo) {
            case 1:
                if (GetStatus.getStatus(Constants.DAY10).equals("1")) {
                    MainActivity.switch0.setChecked(true);
                } else {
                    MainActivity.switch0.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY11).equals("1")) {
                    MainActivity.switch1.setChecked(true);
                } else {
                    MainActivity.switch1.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY12).equals("1")) {
                    MainActivity.switch2.setChecked(true);
                } else {
                    MainActivity.switch2.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY13).equals("1")) {
                    MainActivity.switch3.setChecked(true);
                } else {
                    MainActivity.switch3.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY14).equals("1")) {
                    MainActivity.switch4.setChecked(true);
                } else {
                    MainActivity.switch4.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY15).equals("1")) {
                    MainActivity.switch5.setChecked(true);
                } else {
                    MainActivity.switch5.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY16).equals("1")) {
                    MainActivity.switch6.setChecked(true);
                } else {
                    MainActivity.switch6.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY17).equals("1")) {
                    MainActivity.switch7.setChecked(true);
                } else {
                    MainActivity.switch7.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY18).equals("1")) {
                    MainActivity.switch8.setChecked(true);
                } else {
                    MainActivity.switch8.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY19).equals("1")) {
                    MainActivity.switch9.setChecked(true);
                } else {
                    MainActivity.switch9.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY110).equals("1")) {
                    MainActivity.switch10.setChecked(true);
                } else {
                    MainActivity.switch10.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY111).equals("1")) {
                    MainActivity.switch11.setChecked(true);
                } else {
                    MainActivity.switch11.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY112).equals("1")) {
                    MainActivity.switch12.setChecked(true);
                } else {
                    MainActivity.switch12.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY113).equals("1")) {
                    MainActivity.switch13.setChecked(true);
                } else {
                    MainActivity.switch13.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY114).equals("1")) {
                    MainActivity.switch14.setChecked(true);
                } else {
                    MainActivity.switch14.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY115).equals("1")) {
                    MainActivity.switch15.setChecked(true);
                } else {
                    MainActivity.switch15.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY116).equals("1")) {
                    MainActivity.switch16.setChecked(true);
                } else {
                    MainActivity.switch16.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY117).equals("1")) {
                    MainActivity.switch17.setChecked(true);
                } else {
                    MainActivity.switch17.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY118).equals("1")) {
                    MainActivity.switch18.setChecked(true);
                } else {
                    MainActivity.switch18.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY119).equals("1")) {
                    MainActivity.switch19.setChecked(true);
                } else {
                    MainActivity.switch19.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY120).equals("1")) {
                    MainActivity.switch20.setChecked(true);
                } else {
                    MainActivity.switch20.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY121).equals("1")) {
                    MainActivity.switch21.setChecked(true);
                } else {
                    MainActivity.switch21.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY122).equals("1")) {
                    MainActivity.switch22.setChecked(true);
                } else {
                    MainActivity.switch22.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY123).equals("1")) {
                    MainActivity.switch23.setChecked(true);
                } else {
                    MainActivity.switch23.setChecked(false);
                }
                break;
            case 2:
                if (GetStatus.getStatus(Constants.DAY20).equals("1")) {
                    MainActivity.switch0.setChecked(true);
                } else {
                    MainActivity.switch0.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY21).equals("1")) {
                    MainActivity.switch1.setChecked(true);
                } else {
                    MainActivity.switch1.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY22).equals("1")) {
                    MainActivity.switch2.setChecked(true);
                } else {
                    MainActivity.switch2.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY23).equals("1")) {
                    MainActivity.switch3.setChecked(true);
                } else {
                    MainActivity.switch3.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY24).equals("1")) {
                    MainActivity.switch4.setChecked(true);
                } else {
                    MainActivity.switch4.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY25).equals("1")) {
                    MainActivity.switch5.setChecked(true);
                } else {
                    MainActivity.switch5.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY26).equals("1")) {
                    MainActivity.switch6.setChecked(true);
                } else {
                    MainActivity.switch6.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY27).equals("1")) {
                    MainActivity.switch7.setChecked(true);
                } else {
                    MainActivity.switch7.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY28).equals("1")) {
                    MainActivity.switch8.setChecked(true);
                } else {
                    MainActivity.switch8.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY29).equals("1")) {
                    MainActivity.switch9.setChecked(true);
                } else {
                    MainActivity.switch9.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY210).equals("1")) {
                    MainActivity.switch10.setChecked(true);
                } else {
                    MainActivity.switch10.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY211).equals("1")) {
                    MainActivity.switch11.setChecked(true);
                } else {
                    MainActivity.switch11.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY212).equals("1")) {
                    MainActivity.switch12.setChecked(true);
                } else {
                    MainActivity.switch12.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY213).equals("1")) {
                    MainActivity.switch13.setChecked(true);
                } else {
                    MainActivity.switch13.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY214).equals("1")) {
                    MainActivity.switch14.setChecked(true);
                } else {
                    MainActivity.switch14.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY215).equals("1")) {
                    MainActivity.switch15.setChecked(true);
                } else {
                    MainActivity.switch15.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY216).equals("1")) {
                    MainActivity.switch16.setChecked(true);
                } else {
                    MainActivity.switch16.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY217).equals("1")) {
                    MainActivity.switch17.setChecked(true);
                } else {
                    MainActivity.switch17.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY218).equals("1")) {
                    MainActivity.switch18.setChecked(true);
                } else {
                    MainActivity.switch18.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY219).equals("1")) {
                    MainActivity.switch19.setChecked(true);
                } else {
                    MainActivity.switch19.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY220).equals("1")) {
                    MainActivity.switch20.setChecked(true);
                } else {
                    MainActivity.switch20.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY221).equals("1")) {
                    MainActivity.switch21.setChecked(true);
                } else {
                    MainActivity.switch21.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY222).equals("1")) {
                    MainActivity.switch22.setChecked(true);
                } else {
                    MainActivity.switch22.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY223).equals("1")) {
                    MainActivity.switch23.setChecked(true);
                } else {
                    MainActivity.switch23.setChecked(false);
                }
                break;
            case 3:
                if (GetStatus.getStatus(Constants.DAY30).equals("1")) {
                    MainActivity.switch0.setChecked(true);
                } else {
                    MainActivity.switch0.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY31).equals("1")) {
                    MainActivity.switch1.setChecked(true);
                } else {
                    MainActivity.switch1.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY32).equals("1")) {
                    MainActivity.switch2.setChecked(true);
                } else {
                    MainActivity.switch2.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY33).equals("1")) {
                    MainActivity.switch3.setChecked(true);
                } else {
                    MainActivity.switch3.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY34).equals("1")) {
                    MainActivity.switch4.setChecked(true);
                } else {
                    MainActivity.switch4.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY35).equals("1")) {
                    MainActivity.switch5.setChecked(true);
                } else {
                    MainActivity.switch5.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY36).equals("1")) {
                    MainActivity.switch6.setChecked(true);
                } else {
                    MainActivity.switch6.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY37).equals("1")) {
                    MainActivity.switch7.setChecked(true);
                } else {
                    MainActivity.switch7.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY38).equals("1")) {
                    MainActivity.switch8.setChecked(true);
                } else {
                    MainActivity.switch8.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY39).equals("1")) {
                    MainActivity.switch9.setChecked(true);
                } else {
                    MainActivity.switch9.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY310).equals("1")) {
                    MainActivity.switch10.setChecked(true);
                } else {
                    MainActivity.switch10.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY311).equals("1")) {
                    MainActivity.switch11.setChecked(true);
                } else {
                    MainActivity.switch11.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY312).equals("1")) {
                    MainActivity.switch12.setChecked(true);
                } else {
                    MainActivity.switch12.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY313).equals("1")) {
                    MainActivity.switch13.setChecked(true);
                } else {
                    MainActivity.switch13.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY314).equals("1")) {
                    MainActivity.switch14.setChecked(true);
                } else {
                    MainActivity.switch14.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY315).equals("1")) {
                    MainActivity.switch15.setChecked(true);
                } else {
                    MainActivity.switch15.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY316).equals("1")) {
                    MainActivity.switch16.setChecked(true);
                } else {
                    MainActivity.switch16.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY317).equals("1")) {
                    MainActivity.switch17.setChecked(true);
                } else {
                    MainActivity.switch17.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY318).equals("1")) {
                    MainActivity.switch18.setChecked(true);
                } else {
                    MainActivity.switch18.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY319).equals("1")) {
                    MainActivity.switch19.setChecked(true);
                } else {
                    MainActivity.switch19.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY320).equals("1")) {
                    MainActivity.switch20.setChecked(true);
                } else {
                    MainActivity.switch20.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY321).equals("1")) {
                    MainActivity.switch21.setChecked(true);
                } else {
                    MainActivity.switch21.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY322).equals("1")) {
                    MainActivity.switch22.setChecked(true);
                } else {
                    MainActivity.switch22.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY323).equals("1")) {
                    MainActivity.switch23.setChecked(true);
                } else {
                    MainActivity.switch23.setChecked(false);
                }

                break;
            case 4:
                if (GetStatus.getStatus(Constants.DAY40).equals("1")) {
                    MainActivity.switch0.setChecked(true);
                } else {
                    MainActivity.switch0.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY41).equals("1")) {
                    MainActivity.switch1.setChecked(true);
                } else {
                    MainActivity.switch1.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY42).equals("1")) {
                    MainActivity.switch2.setChecked(true);
                } else {
                    MainActivity.switch2.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY43).equals("1")) {
                    MainActivity.switch3.setChecked(true);
                } else {
                    MainActivity.switch3.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY44).equals("1")) {
                    MainActivity.switch4.setChecked(true);
                } else {
                    MainActivity.switch4.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY45).equals("1")) {
                    MainActivity.switch5.setChecked(true);
                } else {
                    MainActivity.switch5.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY46).equals("1")) {
                    MainActivity.switch6.setChecked(true);
                } else {
                    MainActivity.switch6.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY47).equals("1")) {
                    MainActivity.switch7.setChecked(true);
                } else {
                    MainActivity.switch7.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY48).equals("1")) {
                    MainActivity.switch8.setChecked(true);
                } else {
                    MainActivity.switch8.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY49).equals("1")) {
                    MainActivity.switch9.setChecked(true);
                } else {
                    MainActivity.switch9.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY410).equals("1")) {
                    MainActivity.switch10.setChecked(true);
                } else {
                    MainActivity.switch10.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY411).equals("1")) {
                    MainActivity.switch11.setChecked(true);
                } else {
                    MainActivity.switch11.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY412).equals("1")) {
                    MainActivity.switch12.setChecked(true);
                } else {
                    MainActivity.switch12.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY413).equals("1")) {
                    MainActivity.switch13.setChecked(true);
                } else {
                    MainActivity.switch13.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY414).equals("1")) {
                    MainActivity.switch14.setChecked(true);
                } else {
                    MainActivity.switch14.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY415).equals("1")) {
                    MainActivity.switch15.setChecked(true);
                } else {
                    MainActivity.switch15.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY416).equals("1")) {
                    MainActivity.switch16.setChecked(true);
                } else {
                    MainActivity.switch16.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY417).equals("1")) {
                    MainActivity.switch17.setChecked(true);
                } else {
                    MainActivity.switch17.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY418).equals("1")) {
                    MainActivity.switch18.setChecked(true);
                } else {
                    MainActivity.switch18.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY419).equals("1")) {
                    MainActivity.switch19.setChecked(true);
                } else {
                    MainActivity.switch19.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY420).equals("1")) {
                    MainActivity.switch20.setChecked(true);
                } else {
                    MainActivity.switch20.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY421).equals("1")) {
                    MainActivity.switch21.setChecked(true);
                } else {
                    MainActivity.switch21.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY422).equals("1")) {
                    MainActivity.switch22.setChecked(true);
                } else {
                    MainActivity.switch22.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY423).equals("1")) {
                    MainActivity.switch23.setChecked(true);
                } else {
                    MainActivity.switch23.setChecked(false);
                }

                break;
            case 5:
                if (GetStatus.getStatus(Constants.DAY50).equals("1")) {
                    MainActivity.switch0.setChecked(true);
                } else {
                    MainActivity.switch0.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY51).equals("1")) {
                    MainActivity.switch1.setChecked(true);
                } else {
                    MainActivity.switch1.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY52).equals("1")) {
                    MainActivity.switch2.setChecked(true);
                } else {
                    MainActivity.switch2.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY53).equals("1")) {
                    MainActivity.switch3.setChecked(true);
                } else {
                    MainActivity.switch3.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY54).equals("1")) {
                    MainActivity.switch4.setChecked(true);
                } else {
                    MainActivity.switch4.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY55).equals("1")) {
                    MainActivity.switch5.setChecked(true);
                } else {
                    MainActivity.switch5.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY56).equals("1")) {
                    MainActivity.switch6.setChecked(true);
                } else {
                    MainActivity.switch6.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY57).equals("1")) {
                    MainActivity.switch7.setChecked(true);
                } else {
                    MainActivity.switch7.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY58).equals("1")) {
                    MainActivity.switch8.setChecked(true);
                } else {
                    MainActivity.switch8.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY59).equals("1")) {
                    MainActivity.switch9.setChecked(true);
                } else {
                    MainActivity.switch9.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY510).equals("1")) {
                    MainActivity.switch10.setChecked(true);
                } else {
                    MainActivity.switch10.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY511).equals("1")) {
                    MainActivity.switch11.setChecked(true);
                } else {
                    MainActivity.switch11.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY512).equals("1")) {
                    MainActivity.switch12.setChecked(true);
                } else {
                    MainActivity.switch12.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY513).equals("1")) {
                    MainActivity.switch13.setChecked(true);
                } else {
                    MainActivity.switch13.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY514).equals("1")) {
                    MainActivity.switch14.setChecked(true);
                } else {
                    MainActivity.switch14.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY515).equals("1")) {
                    MainActivity.switch15.setChecked(true);
                } else {
                    MainActivity.switch15.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY516).equals("1")) {
                    MainActivity.switch16.setChecked(true);
                } else {
                    MainActivity.switch16.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY517).equals("1")) {
                    MainActivity.switch17.setChecked(true);
                } else {
                    MainActivity.switch17.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY518).equals("1")) {
                    MainActivity.switch18.setChecked(true);
                } else {
                    MainActivity.switch18.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY519).equals("1")) {
                    MainActivity.switch19.setChecked(true);
                } else {
                    MainActivity.switch19.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY520).equals("1")) {
                    MainActivity.switch20.setChecked(true);
                } else {
                    MainActivity.switch20.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY521).equals("1")) {
                    MainActivity.switch21.setChecked(true);
                } else {
                    MainActivity.switch21.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY522).equals("1")) {
                    MainActivity.switch22.setChecked(true);
                } else {
                    MainActivity.switch22.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY523).equals("1")) {
                    MainActivity.switch23.setChecked(true);
                } else {
                    MainActivity.switch23.setChecked(false);
                }

                break;
            case 6:
                if (GetStatus.getStatus(Constants.DAY60).equals("1")) {
                    MainActivity.switch0.setChecked(true);
                } else {
                    MainActivity.switch0.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY61).equals("1")) {
                    MainActivity.switch1.setChecked(true);
                } else {
                    MainActivity.switch1.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY62).equals("1")) {
                    MainActivity.switch2.setChecked(true);
                } else {
                    MainActivity.switch2.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY63).equals("1")) {
                    MainActivity.switch3.setChecked(true);
                } else {
                    MainActivity.switch3.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY64).equals("1")) {
                    MainActivity.switch4.setChecked(true);
                } else {
                    MainActivity.switch4.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY65).equals("1")) {
                    MainActivity.switch5.setChecked(true);
                } else {
                    MainActivity.switch5.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY66).equals("1")) {
                    MainActivity.switch6.setChecked(true);
                } else {
                    MainActivity.switch6.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY67).equals("1")) {
                    MainActivity.switch7.setChecked(true);
                } else {
                    MainActivity.switch7.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY68).equals("1")) {
                    MainActivity.switch8.setChecked(true);
                } else {
                    MainActivity.switch8.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY69).equals("1")) {
                    MainActivity.switch9.setChecked(true);
                } else {
                    MainActivity.switch9.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY610).equals("1")) {
                    MainActivity.switch10.setChecked(true);
                } else {
                    MainActivity.switch10.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY611).equals("1")) {
                    MainActivity.switch11.setChecked(true);
                } else {
                    MainActivity.switch11.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY612).equals("1")) {
                    MainActivity.switch12.setChecked(true);
                } else {
                    MainActivity.switch12.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY613).equals("1")) {
                    MainActivity.switch13.setChecked(true);
                } else {
                    MainActivity.switch13.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY614).equals("1")) {
                    MainActivity.switch14.setChecked(true);
                } else {
                    MainActivity.switch14.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY615).equals("1")) {
                    MainActivity.switch15.setChecked(true);
                } else {
                    MainActivity.switch15.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY616).equals("1")) {
                    MainActivity.switch16.setChecked(true);
                } else {
                    MainActivity.switch16.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY617).equals("1")) {
                    MainActivity.switch17.setChecked(true);
                } else {
                    MainActivity.switch17.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY618).equals("1")) {
                    MainActivity.switch18.setChecked(true);
                } else {
                    MainActivity.switch18.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY619).equals("1")) {
                    MainActivity.switch19.setChecked(true);
                } else {
                    MainActivity.switch19.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY620).equals("1")) {
                    MainActivity.switch20.setChecked(true);
                } else {
                    MainActivity.switch20.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY621).equals("1")) {
                    MainActivity.switch21.setChecked(true);
                } else {
                    MainActivity.switch21.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY622).equals("1")) {
                    MainActivity.switch22.setChecked(true);
                } else {
                    MainActivity.switch22.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY623).equals("1")) {
                    MainActivity.switch23.setChecked(true);
                } else {
                    MainActivity.switch23.setChecked(false);
                }

                break;
            case 7:
                if (GetStatus.getStatus(Constants.DAY70).equals("1")) {
                    MainActivity.switch0.setChecked(true);
                } else {
                    MainActivity.switch0.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY71).equals("1")) {
                    MainActivity.switch1.setChecked(true);
                } else {
                    MainActivity.switch1.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY72).equals("1")) {
                    MainActivity.switch2.setChecked(true);
                } else {
                    MainActivity.switch2.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY73).equals("1")) {
                    MainActivity.switch3.setChecked(true);
                } else {
                    MainActivity.switch3.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY74).equals("1")) {
                    MainActivity.switch4.setChecked(true);
                } else {
                    MainActivity.switch4.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY75).equals("1")) {
                    MainActivity.switch5.setChecked(true);
                } else {
                    MainActivity.switch5.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY76).equals("1")) {
                    MainActivity.switch6.setChecked(true);
                } else {
                    MainActivity.switch6.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY77).equals("1")) {
                    MainActivity.switch7.setChecked(true);
                } else {
                    MainActivity.switch7.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY78).equals("1")) {
                    MainActivity.switch8.setChecked(true);
                } else {
                    MainActivity.switch8.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY79).equals("1")) {
                    MainActivity.switch9.setChecked(true);
                } else {
                    MainActivity.switch9.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY710).equals("1")) {
                    MainActivity.switch10.setChecked(true);
                } else {
                    MainActivity.switch10.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY711).equals("1")) {
                    MainActivity.switch11.setChecked(true);
                } else {
                    MainActivity.switch11.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY712).equals("1")) {
                    MainActivity.switch12.setChecked(true);
                } else {
                    MainActivity.switch12.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY713).equals("1")) {
                    MainActivity.switch13.setChecked(true);
                } else {
                    MainActivity.switch13.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY714).equals("1")) {
                    MainActivity.switch14.setChecked(true);
                } else {
                    MainActivity.switch14.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY715).equals("1")) {
                    MainActivity.switch15.setChecked(true);
                } else {
                    MainActivity.switch15.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY716).equals("1")) {
                    MainActivity.switch16.setChecked(true);
                } else {
                    MainActivity.switch16.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY717).equals("1")) {
                    MainActivity.switch17.setChecked(true);
                } else {
                    MainActivity.switch17.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY718).equals("1")) {
                    MainActivity.switch18.setChecked(true);
                } else {
                    MainActivity.switch18.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY719).equals("1")) {
                    MainActivity.switch19.setChecked(true);
                } else {
                    MainActivity.switch19.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY720).equals("1")) {
                    MainActivity.switch20.setChecked(true);
                } else {
                    MainActivity.switch20.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY721).equals("1")) {
                    MainActivity.switch21.setChecked(true);
                } else {
                    MainActivity.switch21.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY722).equals("1")) {
                    MainActivity.switch22.setChecked(true);
                } else {
                    MainActivity.switch22.setChecked(false);
                }
                if (GetStatus.getStatus(Constants.DAY723).equals("1")) {
                    MainActivity.switch23.setChecked(true);
                } else {
                    MainActivity.switch23.setChecked(false);
                }

                break;


        }
    }
}
