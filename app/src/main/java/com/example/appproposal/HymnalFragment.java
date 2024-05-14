    package com.example.appproposal;

    import static java.util.Locale.filter;

    import android.content.Intent;
    import android.os.Bundle;

    import androidx.fragment.app.Fragment;

    import android.util.Log;
    import android.util.SparseArray;
    import android.view.LayoutInflater;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.AdapterView;
    import android.widget.ArrayAdapter;
    import android.widget.ListView;
    import androidx.appcompat.widget.SearchView;

    import android.widget.TextView;

    import com.google.firebase.database.DatabaseReference;

    import java.util.ArrayList;
    import java.util.List;

    /**
     * A simple {@link Fragment} subclass.
     * Use the {@link HymnalFragment#newInstance} factory method to
     * create an instance of this fragment.
     */
    public class HymnalFragment extends Fragment {
        private ArrayAdapter<String> arrayAdapter;
        private List<String> list;
        private SearchView searchView;



        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private static final String ARG_PARAM1 = "param1";
        private static final String ARG_PARAM2 = "param2";

        // TODO: Rename and change types of parameters
        private String mParam1;
        private String mParam2;

        public HymnalFragment() {
            // Required empty public constructor
        }

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HymnalFragment.
         */
        // TODO: Rename and change types and number of parameters
        public static HymnalFragment newInstance(String param1, String param2) {
            HymnalFragment fragment = new HymnalFragment();
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
            View rootView = inflater.inflate(R.layout.fragment_hymnal, container, false);

            ListView listView = rootView.findViewById(R.id.listview);
            searchView = rootView.findViewById(R.id.search_view);

            list = new ArrayList<>();
            list.add("1. GINOO KOTA NGA LIG-ON"); list.add("2. ANG ATONG DIOS MAKAGAGAHUM ");
            list.add("3. MATINUMANNON KA"); list.add("4. ANG DIOS MAN MAGABANTAY");
            list.add("5. ANG LANGITNON DAPIT GIBIYAAN MO"); list.add("6. ANG YUTA MAY KATAHUM");
            list.add("7. O DIOS, ANG MAGTATAMBANG KA"); list.add("8. ANG DYUTAYNG LUNGSOD SA BELEN ");
            list.add("9. PAMATIA BALITA"); list.add("10. KANILA NGA NAGABANTAY");
            list.add("11. SIMBAHON TA SI CRISTO "); list.add("12. GABIING BALAAN");
            list.add("13. JESUS KATAM-IS MO GAYUD"); list.add("14. MAGMALIPAYON ANG TANAN");
            list.add("15. SAYSAYI KO SA BALITA"); list.add("16. NANAUG SIYA GIKAN SA KALANGITAN");
            list.add("17. MAANYAG NGA JESUS"); list.add("18. KATAM-IS NGALAN NI JESUS");
            list.add("19. KONG PALANDUNGON KO ANG KRUS"); list.add("20. TUGOTI,DIOS,KING DILA KO MAG-AWIT");
            list.add("21. SA KALBARYO"); list.add("22. SA YUTA SA JERUSALEM");
            list.add("23. SILOT KONG TANAN IYANG GIBAYRAN"); list.add("24. GABII SA GETSEMANE");
            list.add("25. DUNAY HALANGDONG KALUMO"); list.add("26. NABANHAW ANG MANLULUWAS ");
            list.add("27. NABANHAW SIYA SA LUBONG"); list.add("28. MADUGAY PA BA GINOO ");
            list.add("29. ANDAM BA TA PAGSUGAT KANIYA?"); list.add("30. DI BA KAHA KARON?");
            list.add("31. ESPIRITU SA DIOS"); list.add("32. MAY BULAWANG ADLAW UNYA");
            list.add("33. ANG MAGLILIPAY TA"); list.add("34. O ESPIRITU SA DIOS");
            list.add("35. BULAHAN ANG GAPUS"); list.add("36. PUN-A NA AKO, JESUS");
            list.add("37. SANTO! SANTO! SANTO!"); list.add("38. GINAHIGUGMA KO ANG IGLESIA");
            list.add("39. SIMBAHON ANG HARI"); list.add("40. TUBURAN SA PANALANGIN");
            list.add("41. PURONGPURONGAN SIYA"); list.add("42. PAGAUBAN KAMO SA DIOS");
            list.add("43. KUYOG CRISTOHANON"); list.add("44. ANG BUGTONG PATUKORANAN ");
            list.add("45. PAGKAMAHIMAYAON MO"); list.add("46. TABANGI NA KAMI");
            list.add("47. ANG MAY GAHUM NGA SI JESUS"); list.add("48. GRAYSA NGA KAHIBULONGAN");
            list.add("49. ANG MAY GAHUM NGA SI JESUS"); list.add("50. TIPKANG TINAPAY SA KINABUHI");
            list.add("51. PAGDAYEG"); list.add("52. SA MANUNUBOS DUOL KAMO");
            list.add("53. NIINI NGA KAHIMTANG "); list.add("54. SA PAGPAMANAGBANAG");
            list.add("55. NAHINLOAN KA BA?"); list.add("56. SALIGING DUGO NI JESUS");
            list.add("57. MAY ULAN SA PANALANGIN"); list.add("58. MAY GAHUM GIHAPON SI JESUS");
            list.add("59. SA BUNGTOD SA KALBARYO"); list.add("60. DIDTO SA KALBARYO");
            list.add("61. PASUDLA SI JESU-CRISTO"); list.add("62. SI JESUS-CRISTO NAGSANGPIT KANUNAY");
            list.add("63. JESUS MODULO AKO"); list.add("64. SI JESUS MAKALUWAS");
            list.add("65. ANG TANAN MAKADUOL"); list.add("66. SI JESU-CRISTO NAGSANGPIT KARON ");
            list.add("67. SALIG LAMANG"); list.add("68. O MAGMALIPAYON PANAHON");
            list.add("69. DALAYEGON SI JESUS"); list.add("70. SUGA SA TANAN SI CRISTO");
            list.add("71. O MALIG-ON NGA BATO"); list.add("72. ANG PUANGOD SA DIOS");
            list.add("73. PULONG KATINGALAHAN"); list.add("74. JESUS, KATINGALAHAN KA");
            list.add("75. ANG MAPULA NGA TUBURAN"); list.add("76. KAY LUWAS NA AKO");
            list.add("77. NAILA KONG GITUOHAN KO"); list.add("78. DAYGA SI JESUS NGA MANUNUBOS");
            list.add("79. MAY AWIT ANG KASINGKASING KO"); list.add("80. SA LANGITNONG HARI NAG-ALAGAD KO");
            list.add("81. BUNGTOD SA KALBARYO"); list.add("82. PAG-AWITON KONG KAAGI");
            list.add("83. ANG KALAG KO MAY KAHAYAG NA"); list.add("84. ANG GINOO GIKINAHANGLAN KO");
            list.add("85. GUGMA SA DIOS"); list.add("86. DILI SIYA MOPAKYAS");
            list.add("87. DAYGON ANG MANUNUBOS"); list.add("88. BUHI,SI JESU-CRISTO");
            list.add("89. IYA AKO NI JESUS"); list.add("90. KAY NAAKO NA SI JESUS");
            list.add("91. SI JESUS ANG BAHANDI KO"); list.add("92. GUGMA’G KALUOY NI JESUS");
            list.add("93. PAGKATAHUM ISAYSAY"); list.add("94. ANG GUGMA SA MANLULUWAS");
            list.add("95. SI CRISTO MAG ANG BATO"); list.add("96. ANG KINABUHI KO MATAG GUTLO");
            list.add("97. NGALAN NI JESUS DAWATA"); list.add("98. BISA’G MAAKO ANG KALIBUTAN");
            list.add("99. SI JESUS SALIGAN KO"); list.add("100. BUOT KONG ISUGID SI JESUS KANINYO");
            list.add("101. SA BAGYO SALIPDANAN SIYA"); list.add("102. MANLULUWAS KO NAGMANDO");
            list.add("103. IYANG GISALIPDAN ANG AKONG KALAG"); list.add("104. PAGTOO MAOY PAGDAUG");
            list.add("105. PAGKATAM-IS NGA SALIGAN"); list.add("106. KUYOG KANG JESUS BISAN ASA");
            list.add("107. SA TIILAN MAN NI CRISTO"); list.add("108. PAGKABULUHANG PAGSALIG KO");
            list.add("109. KON MANLAKAW KITA"); list.add("110. NAGMANDO SIYA");
            list.add("111. ANG GINOO AMAHAN NAGKUGOS"); list.add("112. DASIGA KAMI");
            list.add("113. ALELUYA SIYA ABYAN KO"); list.add("114. GINAHALAD MO BA ANG TANAN?");
            list.add("115. PAGTUGYANG HINGPIT"); list.add("116. KINING KINABUHI KO");
            list.add("117. MANLULUWAS KONG JESUS"); list.add("118. SA KRUS GAYUD NI CRISTO");
            list.add("119. SI JESUS LAMANG"); list.add("120. O JESUS, HINGPIT NGA GUGMA");
            list.add("121. ANG TANAN ITUGYAN NAKO"); list.add("122. SUNOD KO SI JESUS");
            list.add("123. IMO MAN AKO,O GINOO KO"); list.add("124. JESUS, NAHIGUGMA KANIMO AKO");
            list.add("125. MOSUNOD AKO KANIYA"); list.add("126. O GUGMANG NAGPUGONG KANAKO");
            list.add("127. MOADTO AKO SA TAMANG DAPIT"); list.add("128. PAGKATAM-IS NGA KUYOGAN");
            list.add("129. KANG CRISTO MAHISAMA UNTA KO"); list.add("130. ANG DIOS NGA BALAAN");
            list.add("131. NANINGKAMOT KO PAGTUNGAS"); list.add("132. PAKIGDAIT,HATAG SA DIOS");
            list.add("133. DUOL KAMONG MAY KAMINGAW"); list.add("134. MABALAKA BA SI JESUS");
            list.add("135. PAMATION MO"); list.add("136. SA DUGHAN NI JESUS");
            list.add("137. SI CRISTO ALAGARON KO"); list.add("138. ANG BATUGANG MANANAMBAL");
            list.add("139. ANG PAGTUGYAN"); list.add("140. SI CRISTO BA LANG MAGPAS-AN");
            list.add("141. TIMONI AKO JESUS"); list.add("142. KANIMO, O JESUS MITOO KO");
            list.add("143. SULTIHAN MOA KO,O DIOS"); list.add("144. DUNGAGI,O JESUS,ANG GUGMA KO");
            list.add("145. O KAHIBULONGAN KONG GINOO"); list.add("146. O JESUS AKO NAGSAAD");
            list.add("147. KON AKO TINTALON"); list.add("148. ANG GINANGANDOY SA KALAG");
            list.add("149. ANG PANAHON SA PAG-AMPO"); list.add("150. DILI MOA KO PASAGDAN ");
            list.add("151. GIKINAHANGLAN KA"); list.add("152. ANG DIOS NIA SA SIMBAHAN N'YA");
            list.add("153. KANG JESUS LANG MAGTAWAG"); list.add("154. SI JESUS ATONG ABYAN");
            list.add("155. MANDOI ANG,JEHOVAH"); list.add("156. HADUOL,O JESUS");
            list.add("157. ANG MGA PULONG"); list.add("158. ANG ALANIHON");
            list.add("159. SA LAYO NGA DAPIT"); list.add("160. HANGTUD ANG TANAN MASAKSIHAN NA");
            list.add("161. MAGAPANGITA  KA SA NANGAWALA"); list.add("162. SI JESUS MOLUWAS");
            list.add("163. LUNGSOD SA DIOS"); list.add("164. MAY BALITA SA KANASURAN");
            list.add("165. DAD-ON MO ANG SUGA"); list.add("166. ANG SUGA MO PASIGAA");
            list.add("167. SA KRUS SUNDALO BA AKO?"); list.add("168. O DIOS NGA HARING DAYON");
            list.add("169. ANG PULONG SA DIOS MATINUMANON"); list.add("170. SA IYA NGA BANDILA");
            list.add("171. DALI-A ANG BULOHATON"); list.add("172. GITAWAG TA SA GINOO");
            list.add("173. GIHATAG KO KANIMO"); list.add("174. ANG LABING MAYO BUHATA");
            list.add("175. SI JESUS MAILHAN NAKO"); list.add("176. KONG TAWGON ANG AKONG NGALAN");
            list.add("177. O DIOS SA AMONG MGA AMAHAN"); list.add("178. O MAO NING HIMAYA KO");
            list.add("179. GUGMANG PUTLI UG BALAAN"); list.add("180. GINAHIGUGMA AKO NI JESUS");
            list.add("181. UBANAN KO IKAW UNTA"); list.add("182. DIDTO UNYA SA LANGIT");
            list.add("183. O,NAGAMALIPAYON AKO"); list.add("184. DAGHANNG SAMALAT");
            list.add("185. DILI KA PABUNTOG SA PAGPANULAY"); list.add("186. MANDOI KAMI JESUS SA GUGMA");
            list.add("187. IHATAG MO SA GINOO"); list.add("188. DAD-ONG BANDILA NI CRISTO");
            list.add("189. MAGKINABUHI AKO KANG JESUS"); list.add("190. KONG MOBALIK NA SI CRISTO");
            list.add("191. AKONG MATA PAGBUKSAN MO"); list.add("192. UMARI LUNGSOD SA DIOS");
            list.add("193. IHAPA ANG PANALANGIN MO"); list.add("194. KANG CRISTO TA MOTINDOG");
            list.add("195. ANG HINGPIT NGA GUGMA SA DIOS"); list.add("196. ANG DIOS PASALAMATON KO");
            list.add("197. PASALAMATAN TA ANG DIOS"); list.add("198. SA DIOS ANG HIMAYA");
            list.add("199. GLORIA PATRI"); list.add("200. AMENS");
            list.add("201. LUWAS"); list.add("202. MANGANDAM KITA");
            list.add("203. AKO HIMOA NGA PANALANGIN"); list.add("204. GRASYANG KAHIBULONGAN");
            list.add("205. SA KALBARYO"); list.add("206. MAY KATUNGDANAN KO");
            list.add("207. DUNA BAY LAWAK SA DUGHAN"); list.add("208. MISAKAT NA ANG SINIPIT KO");
            list.add("209. WALAY MAKULANG KANAKO"); list.add("210. GIKUHA N ANI CRISTO");
            list.add("211. BALAANG ESPIRITU, LAMBAGI AKO"); list.add("212. KINSA MAN ANG NAGLUWAS");
            list.add("213. ANAK KO SA HAR"); list.add("214. SILONG SA IYANG PAKO");
            list.add("215. SA MATAG GUTLO, JESUS, IMO KO"); list.add("216. AKONG GIHANGYO, GINOO KO");
            list.add("217. O GINOO,TUDLOI AKO"); list.add("218. UNTA AKONG TUTOKAN IKAW");
            list.add("219. DAYGON ANG DIOS NGA GAMHANAN"); list.add("220. MGA BINUHAT NGA TANAN");
            list.add("221. ALANG KANILANG MIPAHULAY NA"); list.add("222. IPADUOL AKO GINOO");
            list.add("223. PABILIN KANUNAY SA GINOO"); list.add("224. SA KRUS MO");
            list.add("225. O DIOS NGA AMONG AMAHAN"); list.add("226. DAYGON TA ANG MANLULUWAS");
            list.add("227. AKONG GIHIGUGMA"); list.add("228. ANG PULONG MO MAOY SUGA");
            list.add("229. SALIG"); list.add("230. ANG SAAD SA GINOO");
            list.add("231. MATAM-IS ANG GUGMA NIYA"); list.add("232. ANG BUOT MO TUMANA JESUS");
            list.add("233. AKO NAKIG-UBAN SA HARI"); list.add("234. AKONG MAGBALANTAY");
            list.add("235. O BULUHANG KALAG"); list.add("236. KINABUHI KO,GINOO");
            list.add("237. GIHATAG KO BA ANG TANAN?"); list.add("238. JESUS, AKO NAGSAAD");
            list.add("239. MAY BAG-ONG ADLAW"); list.add("240. NAGASALIG");
            list.add("241. SI JESUS HIGALA NAKO"); list.add("242. UNTA MAHISAMA KANIMO");
            list.add("243. ANG TANANG MGA BUTANG"); list.add("244. KABIGON KONG MGA KALAG");
            list.add("245. NGANO MAN?"); list.add("246. GINOO IPADALA AKO");
            list.add("247. ANG PUTLING GUGMA MO GIKINAHANGLAN"); list.add("248. MGA ANGHEL SA HIMAYA");

            Log.d("ListContents", list.toString());

            arrayAdapter = new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, list);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Class<?> targetActivity = null;

                    // I-determine ang target activity base sa position
                    switch(position) {
                        case 0:
                            targetActivity = Song1Activity.class;
                            break;
                        case 1:
                            targetActivity = Song2Activity.class;
                            break;
                        case 2:
                            targetActivity = Song3Activity.class;
                            break;
                        case 3:
                            targetActivity = Song4Activity.class;
                            break;
                        case 4:
                            targetActivity = Song5Activity.class;
                            break;
                        case 5:
                            targetActivity = Song6Activity.class;
                            break;
                        case 6:
                            targetActivity = Song7Activity.class;
                            break;
                        case 7:
                            targetActivity = Song8Activity.class;
                            break;
                        case 8:
                            targetActivity = Song9Activity.class;
                            break;
                        case 9:
                            targetActivity = Song10Activity.class;
                            break;
                        case 10:
                            targetActivity = Song11Activity.class;
                            break;
                        case 11:
                            targetActivity = Song12Activity.class;
                            break;
                        case 12:
                            targetActivity = Song13Activity.class;
                            break;
                        case 13:
                            targetActivity = Song14Activity.class;
                            break;
                        case 14:
                            targetActivity = Song15Activity.class;
                            break;
                        case 15:
                            targetActivity = Song16Activity.class;
                            break;
                        case 16:
                            targetActivity = Song17Activity.class;
                            break;
                        case 17:
                            targetActivity = Song18Activity.class;
                            break;
                        case 18:
                            targetActivity = Song19Activity.class;
                            break;
                        case 19:
                            targetActivity = Song20Activity.class;
                            break;
                        case 20:
                            targetActivity = Song21Activity.class;
                            break;
                        case 21:
                            targetActivity = Song22Activity.class;
                            break;
                        case 22:
                            targetActivity = Song23Activity.class;
                            break;
                        case 23:
                            targetActivity = Song24Activity.class;
                            break;
                        case 24:
                            targetActivity = Song25Activity.class;
                            break;
                        case 25:
                            targetActivity = Song26Activity.class;
                            break;
                        case 26:
                            targetActivity = Song27Activity.class;
                            break;
                        case 27:
                            targetActivity = Song28Activity.class;
                            break;
                        case 28:
                            targetActivity = Song29Activity.class;
                            break;
                        case 29:
                            targetActivity = Song30Activity.class;
                            break;
                        case 30:
                            targetActivity = Song31Activity.class;
                            break;
                        case 31:
                            targetActivity = Song32Activity.class;
                            break;
                        case 32:
                            targetActivity = Song33Activity.class;
                            break;
                        case 33:
                            targetActivity = Song34Activity.class;
                            break;
                        case 34:
                            targetActivity = Song35Activity.class;
                            break;
                        case 35:
                            targetActivity = Song36Activity.class;
                            break;
                        case 36:
                            targetActivity = Song37Activity.class;
                            break;
                        case 37:
                            targetActivity = Song38Activity.class;
                            break;
                        case 38:
                            targetActivity = Song39Activity.class;
                            break;
                        case 39:
                            targetActivity = Song40Activity.class;
                            break;
                        case 40:
                            targetActivity = Song41Activity.class;
                            break;
                        case 41:
                            targetActivity = Song42Activity.class;
                            break;
                        case 42:
                            targetActivity = Song43Activity.class;
                            break;
                        case 43:
                            targetActivity = Song44Activity.class;
                            break;
                        case 44:
                            targetActivity = Song45Activity.class;
                            break;
                        case 45:
                            targetActivity = Song46Activity.class;
                            break;
                        case 46:
                            targetActivity = Song47Activity.class;
                            break;
                        case 47:
                            targetActivity = Song48Activity.class;
                            break;
                        case 48:
                            targetActivity = Song49Activity.class;
                            break;
                        case 49:
                            targetActivity = Song50Activity.class;
                            break;
                        case 50:
                            targetActivity = Song51Activity.class;
                            break;
                        case 51:
                            targetActivity = Song52Activity.class;
                            break;
                        case 52:
                            targetActivity = Song53Activity.class;
                            break;
                        case 53:
                            targetActivity = Song54Activity.class;
                            break;
                        case 54:
                            targetActivity = Song55Activity.class;
                            break;
                        case 55:
                            targetActivity = Song56Activity.class;
                            break;
                        case 56:
                            targetActivity = Song57Activity.class;
                            break;
                        case 57:
                            targetActivity = Song58Activity.class;
                            break;
                        case 58:
                            targetActivity = Song59Activity.class;
                            break;
                        case 59:
                            targetActivity = Song60Activity.class;
                            break;
                        case 60:
                            targetActivity = Song61Activity.class;
                            break;
                        case 61:
                            targetActivity = Song62Activity.class;
                            break;
                        case 62:
                            targetActivity = Song63Activity.class;
                            break;
                        case 63:
                            targetActivity = Song64Activity.class;
                            break;
                        case 64:
                            targetActivity = Song65Activity.class;
                            break;
                        case 65:
                            targetActivity = Song66Activity.class;
                            break;
                        case 66:
                            targetActivity = Song67Activity.class;
                            break;
                        case 67:
                            targetActivity = Song68Activity.class;
                            break;
                        case 68:
                            targetActivity = Song69Activity.class;
                            break;
                        case 69:
                            targetActivity = Song70Activity.class;
                            break;
                        case 70:
                            targetActivity = Song71Activity.class;
                            break;
                        case 71:
                            targetActivity = Song72Activity.class;
                            break;
                        case 72:
                            targetActivity = Song73Activity.class;
                            break;
                        case 73:
                            targetActivity = Song74Activity.class;
                            break;
                        case 74:
                            targetActivity = Song75Activity.class;
                            break;
                        case 75:
                            targetActivity = Song76Activity.class;
                            break;
                        case 76:
                            targetActivity = Song77Activity.class;
                            break;
                        case 77:
                            targetActivity = Song78Activity.class;
                            break;
                        case 78:
                            targetActivity = Song79Activity.class;
                            break;
                        case 79:
                            targetActivity = Song80Activity.class;
                            break;
                        case 80:
                            targetActivity = Song81Activity.class;
                            break;
                        case 81:
                            targetActivity = Song82Activity.class;
                            break;
                        case 82:
                            targetActivity = Song83Activity.class;
                            break;
                        case 83:
                            targetActivity = Song84Activity.class;
                            break;
                        case 84:
                            targetActivity = Song85Activity.class;
                            break;
                        case 85:
                            targetActivity = Song86Activity.class;
                            break;
                        case 86:
                            targetActivity = Song87Activity.class;
                            break;
                        case 87:
                            targetActivity = Song88Activity.class;
                            break;
                        case 88:
                            targetActivity = Song89Activity.class;
                            break;
                        case 89:
                            targetActivity = Song90Activity.class;
                            break;
                        case 90:
                            targetActivity = Song91Activity.class;
                            break;
                        case 91:
                            targetActivity = Song92Activity.class;
                            break;
                        case 92:
                            targetActivity = Song93Activity.class;
                            break;
                        case 93:
                            targetActivity = Song94Activity.class;
                            break;
                        case 94:
                            targetActivity = Song95Activity.class;
                            break;
                        case 95:
                            targetActivity = Song96Activity.class;
                            break;
                        case 96:
                            targetActivity = Song97Activity.class;
                            break;
                        case 97:
                            targetActivity = Song98Activity.class;
                            break;
                        case 98:
                            targetActivity = Song99Activity.class;
                            break;
                        case 99:
                            targetActivity = Song100Activity.class;
                            break;
                        case 100:
                            targetActivity = Song101Activity.class;
                            break;
                        case 101:
                            targetActivity = Song102Activity.class;
                            break;
                        case 102:
                            targetActivity = Song103Activity.class;
                            break;
                        case 103:
                            targetActivity = Song104Activity.class;
                            break;
                        case 104:
                            targetActivity = Song105Activity.class;
                            break;
                        case 105:
                            targetActivity = Song106Activity.class;
                            break;
                        case 106:
                            targetActivity = Song107Activity.class;
                            break;
                        case 107:
                            targetActivity = Song108Activity.class;
                            break;
                        case 108:
                            targetActivity = Song109Activity.class;
                            break;
                        case 109:
                            targetActivity = Song110Activity.class;
                            break;
                        case 110:
                            targetActivity = Song111Activity.class;
                            break;
                        case 111:
                            targetActivity = Song112Activity.class;
                            break;
                        case 112:
                            targetActivity = Song113Activity.class;
                            break;
                        case 113:
                            targetActivity = Song114Activity.class;
                            break;
                        case 114:
                            targetActivity = Song115Activity.class;
                            break;
                        case 115:
                            targetActivity = Song116Activity.class;
                            break;
                        case 116:
                            targetActivity = Song117Activity.class;
                            break;
                        case 117:
                            targetActivity = Song118Activity.class;
                            break;
                        case 118:
                            targetActivity = Song119Activity.class;
                            break;
                        case 119:
                            targetActivity = Song120Activity.class;
                            break;
                        case 120:
                            targetActivity = Song121Activity.class;
                            break;
                        case 121:
                            targetActivity = Song122Activity.class;
                            break;
                        case 122:
                            targetActivity = Song123Activity.class;
                            break;
                        case 123:
                            targetActivity = Song124Activity.class;
                            break;
                        case 124:
                            targetActivity = Song125Activity.class;
                            break;
                        case 125:
                            targetActivity = Song126Activity.class;
                            break;
                        case 126:
                            targetActivity = Song127Activity.class;
                            break;
                        case 127:
                            targetActivity = Song128Activity.class;
                            break;
                        case 128:
                            targetActivity = Song129Activity.class;
                            break;
                        case 129:
                            targetActivity = Song130Activity.class;
                            break;
                        case 130:
                            targetActivity = Song131Activity.class;
                            break;
                        case 131:
                            targetActivity = Song132Activity.class;
                            break;
                        case 132:
                            targetActivity = Song133Activity.class;
                            break;
                        case 133:
                            targetActivity = Song134Activity.class;
                            break;
                        case 134:
                            targetActivity = Song135Activity.class;
                            break;
                        case 135:
                            targetActivity = Song136Activity.class;
                            break;
                        case 136:
                            targetActivity = Song137Activity.class;
                            break;
                        case 137:
                            targetActivity = Song138Activity.class;
                            break;
                        case 138:
                            targetActivity = Song139Activity.class;
                            break;
                        case 139:
                            targetActivity = Song140Activity.class;
                            break;
                        case 140:
                            targetActivity = Song141Activity.class;
                            break;
                        case 141:
                            targetActivity = Song142Activity.class;
                            break;
                        case 142:
                            targetActivity = Song143Activity.class;
                            break;
                        case 143:
                            targetActivity = Song144Activity.class;
                            break;
                        case 144:
                            targetActivity = Song145Activity.class;
                            break;
                        case 145:
                            targetActivity = Song146Activity.class;
                            break;
                        case 146:
                            targetActivity = Song147Activity.class;
                            break;
                        case 147:
                            targetActivity = Song148Activity.class;
                            break;
                        case 148:
                            targetActivity = Song149Activity.class;
                            break;
                        case 1419:
                            targetActivity = Song150Activity.class;
                            break;
                        case 150:
                            targetActivity = Song151Activity.class;
                            break;
                        case 151:
                            targetActivity = Song152Activity.class;
                            break;
                        case 152:
                            targetActivity = Song153Activity.class;
                            break;
                        case 153:
                            targetActivity = Song154Activity.class;
                            break;
                        case 154:
                            targetActivity = Song155Activity.class;
                            break;
                        case 155:
                            targetActivity = Song156Activity.class;
                            break;
                        case 156:
                            targetActivity = Song157Activity.class;
                            break;
                        case 157:
                            targetActivity = Song158Activity.class;
                            break;
                        case 158:
                            targetActivity = Song159Activity.class;
                            break;
                        case 159:
                            targetActivity = Song160Activity.class;
                            break;
                        case 160:
                            targetActivity = Song161Activity.class;
                            break;
                        case 161:
                            targetActivity = Song162Activity.class;
                            break;
                        case 162:
                            targetActivity = Song163Activity.class;
                            break;
                        case 163:
                            targetActivity = Song164Activity.class;
                            break;
                        case 164:
                            targetActivity = Song165Activity.class;
                            break;
                        case 165:
                            targetActivity = Song166Activity.class;
                            break;
                        case 166:
                            targetActivity = Song167Activity.class;
                            break;
                        case 167:
                            targetActivity = Song168Activity.class;
                            break;
                        case 168:
                            targetActivity = Song169Activity.class;
                            break;
                        case 169:
                            targetActivity = Song170Activity.class;
                            break;
                        case 170:
                            targetActivity = Song171Activity.class;
                            break;
                        case 171:
                            targetActivity = Song172Activity.class;
                            break;
                        case 172:
                            targetActivity = Song173Activity.class;
                            break;
                        case 173:
                            targetActivity = Song174Activity.class;
                            break;
                        case 174:
                            targetActivity = Song175Activity.class;
                            break;
                        case 175:
                            targetActivity = Song176Activity.class;
                            break;
                        case 176:
                            targetActivity = Song177Activity.class;
                            break;
                        case 177:
                            targetActivity = Song178Activity.class;
                            break;
                        case 178:
                            targetActivity = Song179Activity.class;
                            break;
                        case 179:
                            targetActivity = Song180Activity.class;
                            break;
                        case 180:
                            targetActivity = Song181Activity.class;
                            break;
                        case 181:
                            targetActivity = Song182Activity.class;
                            break;
                        case 182:
                            targetActivity = Song183Activity.class;
                            break;
                        case 183:
                            targetActivity = Song184Activity.class;
                            break;
                        case 184:
                            targetActivity = Song185Activity.class;
                            break;
                        case 185:
                            targetActivity = Song186Activity.class;
                            break;
                        case 186:
                            targetActivity = Song187Activity.class;
                            break;
                        case 187:
                            targetActivity = Song188Activity.class;
                            break;
                        case 188:
                            targetActivity = Song189Activity.class;
                            break;
                        case 189:
                            targetActivity = Song190Activity.class;
                            break;
                        case 190:
                            targetActivity = Song191Activity.class;
                            break;
                        case 191:
                            targetActivity = Song192Activity.class;
                            break;
                        case 192:
                            targetActivity = Song193Activity.class;
                            break;
                        case 193:
                            targetActivity = Song194Activity.class;
                            break;
                        case 194:
                            targetActivity = Song195Activity.class;
                            break;
                        case 195:
                            targetActivity = Song196Activity.class;
                            break;
                        case 196:
                            targetActivity = Song197Activity.class;
                            break;
                        case 197:
                            targetActivity = Song198Activity.class;
                            break;
                        case 198:
                            targetActivity = Song199Activity.class;
                            break;
                        case 199:
                            targetActivity = Song200Activity.class;
                            break;
                        case 200:
                            targetActivity = Song201Activity.class;
                            break;
                        case 201:
                            targetActivity = Song202Activity.class;
                            break;
                        case 202:
                            targetActivity = Song203Activity.class;
                            break;
                        case 203:
                            targetActivity = Song204Activity.class;
                            break;
                        case 204:
                            targetActivity = Song205Activity.class;
                            break;
                        case 205:
                            targetActivity = Song206Activity.class;
                            break;
                        case 206:
                            targetActivity = Song207Activity.class;
                            break;
                        case 207:
                            targetActivity = Song208Activity.class;
                            break;
                        case 208:
                            targetActivity = Song209Activity.class;
                            break;
                        case 209:
                            targetActivity = Song210Activity.class;
                            break;
                        case 210:
                            targetActivity = Song211Activity.class;
                            break;
                        case 211:
                            targetActivity = Song212Activity.class;
                            break;
                        case 212:
                            targetActivity = Song213Activity.class;
                            break;
                        case 213:
                            targetActivity = Song214Activity.class;
                            break;
                        case 214:
                            targetActivity = Song215Activity.class;
                            break;
                        case 215:
                            targetActivity = Song216Activity.class;
                            break;
                        case 216:
                            targetActivity = Song217Activity.class;
                            break;
                        case 217:
                            targetActivity = Song218Activity.class;
                            break;
                        case 218:
                            targetActivity = Song219Activity.class;
                            break;
                        case 219:
                            targetActivity = Song220Activity.class;
                            break;
                        case 220:
                            targetActivity = Song221Activity.class;
                            break;
                        case 221:
                            targetActivity = Song222Activity.class;
                            break;
                        case 222:
                            targetActivity = Song223Activity.class;
                            break;
                        case 223:
                            targetActivity = Song224Activity.class;
                            break;
                        case 224:
                            targetActivity = Song225Activity.class;
                            break;
                        case 225:
                            targetActivity = Song226Activity.class;
                            break;
                        case 226:
                            targetActivity = Song227Activity.class;
                            break;
                        case 227:
                            targetActivity = Song228Activity.class;
                            break;
                        case 228:
                            targetActivity = Song229Activity.class;
                            break;
                        case 229:
                            targetActivity = Song230Activity.class;
                            break;
                        case 230:
                            targetActivity = Song231Activity.class;
                            break;
                        case 231:
                            targetActivity = Song232Activity.class;
                            break;
                        case 232:
                            targetActivity = Song233Activity.class;
                            break;
                        case 233:
                            targetActivity = Song234Activity.class;
                            break;
                        case 234:
                            targetActivity = Song235Activity.class;
                            break;
                        case 235:
                            targetActivity = Song236Activity.class;
                            break;
                        case 236:
                            targetActivity = Song237Activity.class;
                            break;
                        case 237:
                            targetActivity = Song238Activity.class;
                            break;
                        case 238:
                            targetActivity = Song239Activity.class;
                            break;
                        case 239:
                            targetActivity = Song240Activity.class;
                            break;
                        case 240:
                            targetActivity = Song241Activity.class;
                            break;
                        case 241:
                            targetActivity = Song242Activity.class;
                            break;
                        case 242:
                            targetActivity = Song243Activity.class;
                            break;
                        case 243:
                            targetActivity = Song244Activity.class;
                            break;
                        case 244:
                            targetActivity = Song245Activity.class;
                            break;
                        case 245:
                            targetActivity = Song246Activity.class;
                            break;
                        case 246:
                            targetActivity = Song247Activity.class;
                            break;
                        case 247:
                            targetActivity = Song248Activity.class;
                            break;
                    }
                    // Tsekahon kung ang targetActivity adunay value
                    if (targetActivity != null) {
                        Intent intent = new Intent(getActivity(), targetActivity);
                        startActivity(intent);
                    }
                }
            });

            // Add search functionality
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    // Handle submission if needed
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    filter(newText);
                    return true;
                }
            });

            return rootView;
        }

        // Method to filter the list based on the search query
        private void filter(String text) {
            List<String> filteredList = new ArrayList<>();
            if (text.isEmpty()) {
                // If the search query is empty, show all items in the original list
                filteredList.addAll(list);
            } else {
                // Otherwise, filter the list based on the search query
                for (String hymn : list) {
                    if (hymn.toLowerCase().contains(text.toLowerCase())) {
                        filteredList.add(hymn);
                    }
                }
            }
            arrayAdapter.clear();
            arrayAdapter.addAll(filteredList);
            arrayAdapter.notifyDataSetChanged();
        }
    }