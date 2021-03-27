
public class konstruktorKotak {
    private String namski;
    private int sisi;


    // //this dipake untuk nunjuk variabel yang di class kalo nama variabel sama
    // public void setNama(String nama){
    //     String namski = nama;
    //     this.namski = namski;
    // }

    public void setSisi(int sisi){
        this.sisi = sisi;
    }

    //kalo namski harus di liat isinya di class lain pake getNama

    // public String getNama(){
    //     return namski;
    // }

    public int getSisi(){
        return sisi;
    }

    konstruktorKotak(String nm){
        namski = nm;
        sisi = 0;
    }

    konstruktorKotak(String nm,int s){
        namski = nm;
        sisi = s;
    }

    int hitungKeliling(){
        return 4*sisi;
    }

    int hitungLuas(){
        return sisi*sisi;
    }

    void cetak(){
        if (sisi==0){
            System.out.println("Nilai sisi kotak "+namski+" harus di input");
        } else {
            System.out.println("Keliling kotak "+namski+" = "+hitungKeliling()+"cm");
            System.out.println("Luas kotak "+namski+" = "+hitungLuas()+"cm2");
        }
    }

}