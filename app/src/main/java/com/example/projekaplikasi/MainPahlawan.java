package com.example.projekaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainPahlawan extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pahlawan);

        String nama_pahlawan[]={
                "Diponegoro",
                "Pattimura",
                "Soedirman",
                "Bung Tomo",
                "Kartini",
                "Sultan Hasanuddin",
                "Soekarno",
                "Ahmad Yani",
                "Moh Hatta",
                "Cut Nyak Dien"
        };

        int gambar_pahlawan[]={
                R.drawable.diponegoro,
                R.drawable.pattimura,
                R.drawable.soedirman,
                R.drawable.bung_tomo,
                R.drawable.kartini,
                R.drawable.hasanuddin,
                R.drawable.soekarno,
                R.drawable.ahmad_yani,
                R.drawable.moh_hatta,
                R.drawable.cut_nya_dien
        };

        String keterangan[]={
                "Pangeran Diponegoro lahir di Yogyakarta pada jumat 11 November 1785 " +
                        "dari ibu yang merupakan seorang selir bernama R.A. Mangkarawati, dan ayahnya " +
                        "yang bernama Gusti Raden Mas Surojo, yang di kemudian hari naik tahta bergelar " +
                        "Hamengkubuwono III." +
                        "Pada saat Pangeran Diponegoro lahir, Ia diberi nama Raden Mas Mustahar yang akhirnya " +
                        "ia diberi gelar pangeran dengan nama Pangeran Diponegoro pada 1812 ketika ayahnya " +
                        "naik tahta menjadi Hamengkubuwono III. ",

                "Pattimura lahir pada 8 Juni 1783 di Saparua, Maluku, lahir sebagai anak keturunan bangsawan dari Raja Sahulau. " +
                        "Sebuah kerajaan yang berada di Teluk Seram Selatan." +
                        "Pattimura memiliki seorang adik laki-laki bernama Yohanis. Pada 1810, " +
                        "kepulauan Maluku diambil alih Belanda oleh Inggris. Pattimura kemudian menerima " +
                        "pelatihan militer dari pasukan Inggris dan mencapai pangkat mayor",

                "Jenderal Sudirman lahir di Desa Bodas, Karangjati, Purbalingga, Jawa Tengah pada Senin 24 Januari 1916. " +
                        "Beliau bernama lengkap Raden Soedirman, ayahnya adalah Karsid Kartowirodji seorang pekerja " +
                        "pada pabrik gula di Kalibagor, Banyumas dan ibunya Siyem seorang keturunan Wedana Rembang." +
                        "Semasa kecilnya Sudirman diasuh oleh seorang camat Rembang bernama Raden Cokrosunaryo, " +
                        "karena saat itu Raden Cokro belum memiliki momongan maka kemudian memutuskan untuk mengasuh " +
                        "sang Jenderal kecil sampai menginjak usia 18 tahun.",

                "Sutomo atau kerap disapa dengan Bung Tomo adalah pahlawan yang terkenal karena perannya " +
                        "dalam membangkitkan semangat rakyat Surabaya melawan kembalinya penjajah Belanda " +
                        "melalui tentara NICA, yang berakhir dengan pertempuran 10 November 1945, " +
                        "yang saat ini diperingati sebagai Hari Pahlawan." +
                        "Bung Tomo dilahirkan di daerah Kampung Blauran, Surabaya, 3 Oktober 1920. " +
                        "Ayahnya bernama Kartawan Tjiptowidjojo, pegawai kelas menengah yang mengabdi " +
                        "di pegawai pemerintahan. Ibunda Bung Tomo memiliki darah campuran antara Jawa Tengah, Madura dan Sunda.",

                "Lahir pada 21 April 1979, R. A Kartini sendiri dikenal luas sebagai tokoh emansipasi wanita di Indonesia. " +
                        "Putri dari Raden Mas Adipati Ario Sosroningrat ini kemudian menjalani masa sekolah " +
                        "hingga usia 12 tahun, usia saat ia mulai dipingit. R.A Kartini sendiri mengenyam " +
                        "pendidikannya di Europese Lagere School.",

                "Sultan Hasanuddin memiliki nama asli Muhammad Bakir I Mallombasi Daeng Mattawang Karaeng Bonto Mangape. " +
                        "Ia lahir pada 12 Januari 1631 dan merupakan anak dari pasangan Sultan Malikussaid, Raja Gowa ke-15, " +
                        "dan I Sabbe To'mo Lakuntu."+
                        "Kecerdasan serta kepiawaiannya dalam memimpin telah ada sejak dirinya masih kecil. " +
                        "Sultan Hasanuddin juga pandai berdagang." +
                        "Sultan Hasanuddin pernah mengenyam pendidikan di Masjid Bontoala. " +
                        "Ia kerap diajak ayahnya untuk menghadiri pertemuan penting sebagai cara " +
                        "untuk mengasah skill dan pengalaman.",

                "Ir. Soekarno adalah presiden pertama Republik Indonesia, sekaligus tokoh proklamator negara ini. " +
                        "Soekarno akrab dipanggil dengan julukan Bung Karno. Bung Karno juga dikenal sebagai" +
                        " Putra Sang Fajar karena lahir saat fajar menyingsing.  Bung Karno lahir di Surabaya, " +
                        "6 Juni 1901 dan meninggal di Jakarta, 21 Juni 1970. Dikutip dari laman RRI, " +
                        "Soekarno awalnya diberi nama Koesno Sosrodihardjo. Karena sering sakit, " +
                        "namanya diganti menjadi Soekarno.",

                " Ahmad Yani lahir di Jenar, Purworejo, pada tanggal 19 Juni 1922. " +
                        "Ia adalah putra tertua dari Sarjo bin Suharyo dan Murtini, " +
                        "ayahnya tersebut sebagai nama M. Wongsorejo. " +
                        "Ahmad mempunyai dua orang adik yang bernama Asma dan Asina.",

                "Sosok Mohammad Hatta tida bisa dilepaskan dari perjuangan Kemerdekaan Republik Indonesia. " +
                        "Beliau adalah salah satu pemikir terhebat yang dimiliki Indonesia. " +
                        "Tak hanya dikenal sebagai Bapaqk Proklamator Indoensia, " +
                        "Mohammad Hatta juga Bakap Koperasi, Bapak Kedaulatan Rakyat, " +
                        "Bapak Perumahan Nasional, dan Bapak Hak Asasi Manusia.",

                "Cut Nyak Dien adalah wanita kelahiran Lampadang, Kerajaan Aceh pada tahun 1848. " +
                        "Sayangnya, tidak diketahui dengan pasti mengenai tanggal lahir dari Cut Nyak Dien."+
                        "Cut Nyak Dien lahir dari keluarga bangsawan yang memang sangat taat " +
                        "dalam beragama. Keluarga dari Cut Nyak Dien bertempat tinggal di Aceh Besar, " +
                        "wilayah VI Mukim."
        };
        listView=findViewById(R.id.listdatapahlawan);
        AdapterPahlawan adapterPahlawan=new AdapterPahlawan(this,nama_pahlawan,gambar_pahlawan,keterangan);
        listView.setAdapter(adapterPahlawan);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nm_pahlawan=nama_pahlawan[position].toString();
                int gbr_pahlawan=gambar_pahlawan[position];
                String ket=keterangan[position].toString();

                Intent intent=new Intent(MainPahlawan.this,DetailPahlawan.class);
                intent.putExtra("namapahlawan",nm_pahlawan);
                intent.putExtra("gambarpahlawan",gbr_pahlawan);
                intent.putExtra("keter",ket);
                startActivity(intent);
            }
        });
    }
}