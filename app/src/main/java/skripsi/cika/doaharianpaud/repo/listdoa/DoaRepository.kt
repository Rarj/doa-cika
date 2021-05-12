package skripsi.cika.doaharianpaud.repo.listdoa

class DoaRepository {

  fun getListDoa(): List<DoaModel> {
    return listOf(
      DoaModel(
        id = "1",
        doaName = "Doa Sebelum Tidur",
        arabic = "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ",
        translate = "Bismikallaahumma ahyaa wa ammuut",
        meaning = "\"Dengan menyebut nama Allah, aku hidup dan aku mati\""
      ),
      DoaModel(
        id = "2",
        doaName = "Doa Bangun Tidur",
        arabic = "اَلْحَمْدُ لِلَّهِ الَّذِيْ أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُوْرِ",
        translate = "Alhamdullillahilladzi ahyaanaa ba'da maa amaatanaa wa ilaihin nusyuur",
        meaning = "\"Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan\""
      ),
      DoaModel(
        id = "3",
        doaName = "Doa Masuk Kamar Mandi",
        arabic = "بِسْمِ اللهِ، اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْخُبُثِ وَالْخَبَائِثِ",
        translate = "Bismillaah, Allaahumma Innii A’uudzu bika Minal Khubutsi Wal Khabaa-its.",
        meaning = ""
      ),
      DoaModel(
        id = "4",
        doaName = "Doa Keluar Kamar Mandi",
        arabic = "غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنِّى اْلاَذَى وَعَافَانِىْ",
        translate = "Ghufranaka. Alhamdulillahilladzi azhaba ‘annil adzaa wa’aafaanii",
        meaning = "\"Dengan mengharap ampunan-Mu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan yang telah menyejahterakan.\""
      ),
      DoaModel(
        id = "5",
        doaName = "Doa Sebelum Makan",
        arabic = " اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ",
        translate = "Allahumma baarik lanaa fiimaa rozaqtanaa wa qinaa 'adzaa bannaar.",
        meaning = "\"Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka.\""
      ),
      DoaModel(
        id = "6",
        doaName = "Doa Sesudah Makan",
        arabic = " اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ",
        translate = "Alhamdulillahilladzi ath-amanaa wa saqoonaa wa ja'alanaa minal muslimiin.",
        meaning = "\"Segala puji bagi Allah yang telah memberi kami makan dan minum serta menjadikan kami termasuk dari kaum muslimin.\""
      ),
      DoaModel(
        id = "7",
        doaName = "Doa Keluar Rumah",
        arabic = " بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ، لَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللهِ",
        translate = "Bismillahhi tawakkaltu 'alallah, laa haula wa laa quwwata illa billaah.",
        meaning = "\"Bismillahhi tawakkaltu 'alallah, laa haula wa laa quwwata illa billaah.\""
      ),
      DoaModel(
        id = "8",
        doaName = "Doa Sebelum Belajar",
        arabic = "رَضِتُ بِااللهِ رَبَا وَبِالْاِسْلاَمِ دِيْنَا وَبِمُحَمَّدٍ نَبِيَا وَرَسُوْلاَ رَبِّ زِدْ نِيْ عِلْمًـاوَرْزُقْنِـيْ فَهْمًـا",
        translate = "Rodhitu billahi-robba, wabil islaamidina, wabi-muhammadin nabiyyaw warosula. Robbi zidnii 'ilmaa warzuqnii fahmaa",
        meaning = "\"Aku ridho Allah SWT sebagai Tuhanku, Islam sebagai agamaku, dan Nabi Muhammad SAW sebagai Nabi dan Rasul. Ya Allah, tambahkanlah kepadaku ilmu dan berikanlah aku pengertian yang baik\""
      ),
      DoaModel(
        id = "9",
        doaName = "Doa Sesudah Belajar",
        arabic = "اَللّٰهُمَّ اِنِّى اِسْتَوْدِعُكَ مَاعَلَّمْتَنِيْهِ فَارْدُدْهُ اِلَىَّ عِنْدَ حَاجَتِىْ وَلاَ تَنْسَنِيْهِ يَارَبَّ الْعَالَمِيْنَ",
        translate = "Allaahumma inni istaudi'uka maa 'allamtanihi fardud-hu ilayya 'inda haajati wa la tansanihi ya robbal 'alamiin",
        meaning = " \"Ya Allah, sesungguhnya ku titipkan kepada-Mu apa yang telah Engkau ajarkan kepadaku, maka kembalikanlah dia kepadaku disaat aku membutuhkannya. Janganlah Engkau buat aku lupa kepadanya. wahai Tuhan pemelihara alam.\"",
      ),
      DoaModel(
        id = "10",
        doaName = "Doa Sebelum Wudhu",
        arabic = "نَوَيْتُ الْوُضُوْءَ لِرَفْعِ الْحَدَثِ اْلاَصْغَرِ فَرْضًا ِللهِ تَعَالَى ",
        translate = "Nawaitul whudu-a lirof’il hadatsii ashghori fardhon lillaahi ta’aalaa",
        meaning = "\"Saya niat berwudhu untuk menghilangkan hadast kecil fardu (wajib) karena Allah Ta'ala\""
      ),
      DoaModel(
        id = "11",
        doaName = "Doa Sesudah Wudhu",
        arabic = "اَشْهَدُاَنْ لَااِلٰهَ اِلَّا اللّٰهُ وَحْدَهُ لَاشَرِيْكَ لَهُ. وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللّٰهُمَّ اجْعَلْنِىْ مِنَاالتَّوَّابِيْنَ، وَجْعَلْنِيْ مِنَ الْمُتَطَهِّرِيْنَ، وَجْعَلْنِىْ مِنْ عِبَادِكَ الصَّالِحِيْنَ ",
        translate = "Asyhadu allaa ilaaha illallah wahdahu laa syariikalahu . Wa asyhadu anna Muhammadan’abduhu wa rasuuluhu Allahumma-j alnii minattabinna waj alnii minal mutathohiirina waj alnii min ‘ibadatishalihin",
        meaning = "\"Saya bersaksi tiada Tuhan melainkan Allah yang esa , tiada sekutu bagi-Nya . Dan saya bersaksi bahwa nabi Muhammad adalah hamba-Nya dan utusan-Nya . Ya Allah jadikanlah saya orang yang ahli taubat , dan jadikanlah saya orang yang suci , dan jadikanlah saya dari golongan hamba-hamba Mu yang shaleh.\""
      ),
      DoaModel(
        id = "12",
        doaName = "Doa Masuk Masjid",
        arabic = "اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ",
        translate = "Allahummaf tahlii abwaaba rohmatik",
        meaning = "\"Ya Allah, bukalah untukku pintu-pintu rahmat-Mu\""
      ),
      DoaModel(
        id = "13",
        doaName = "Doa Keluar Masjid",
        arabic = "بِسْمِ اللهِ, وَالسَّلاَمُ عَلَى رَسُوْلِ اللهِ ,اللَّهُمَّ اغْفِرْلِيْ ذُنُوْبِيْ, وَافْتَحْ لِيْ أَبْوَابَ رَحْمَتِكََِ",
        translate = "BISMILLAH, WASSALAAMU ‘ALAA ROSUULILLAH, ALLOHUMMAGHFIRLII DZUNUUBII, WAFTAHLIII ABWAABA ROHMATIKA",
        meaning = "\"Dengan menyebut nama Allah dan salam atas Rasulullah. Ya Allah, ampunilah dosa-dosaku dan bukakanlah padaku pintu rahmat-Mu\""
      ),
      DoaModel(
        id = "14",
        doaName = "Doa Masuk Rumah",
        arabic = "اللَّهُمَّ إِنِّى أَسْأَلُكَ خَيْرَ الْمَوْلِجِ وَخَيْرَ الْمَخْرَجِ باسْمِ اللَّهِ وَلجْنا، وباسْمِ اللَّهِ خَرَجْنا، وَعَلى اللَّهِ رَبِّنا تَوَكَّلْنا",
        translate = "Allâhumma innî as’aluka khairal mauliji wa khairal makhraji bismillâhi walajnâ wa bismillâhi kharajnâ wa ‘ala-Llâhi rabbinâ tawakkalnâ",
        meaning = "\"Duhai Allah, aku memohon sebaik-baik tempat masuk dan sebaik-baik tempat keluar. Atas nama-Mu kami masuk dan atas nama-Mu kami keluar. Dan kepada Allah Tuhan kamilah kami bertawakal.\""
      ),
      DoaModel(
        id = "15",
        doaName = "Doa Keluar Rumah",
        arabic = "بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ، لَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللهِ",
        translate = "Bismillahi, tawakkaltu ’alallah, laa haula wa laa quwwata illaa billaah",
        meaning = "\"Dengan nama Allah, aku bertawakkal kepada Allah. Tiada daya dan kekuatan kecuali dengan Allah.\""
      )
    )
  }

}