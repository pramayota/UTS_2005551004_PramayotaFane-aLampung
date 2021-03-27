import java.util.Scanner;
public class hitungKotak {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("Pilih [1].Kotak A  [2] Kotak B");
        int pilih = masuk.nextInt();
        if(pilih==1){
            konstruktorKotak satu = new konstruktorKotak("A");
            System.out.println("masukkan nilai sisi ");
            int si = masuk.nextInt();
            masuk.nextLine();
            satu.setSisi(si);
            satu.cetak();
            // System.out.println(satu.getNama());

            //test set dan getNama
            // System.out.println("masukkan nama");
            // String  anjay = masuk.nextLine();
            // satu.setNama(anjay);
            // System.out.println(satu.getNama());
        } else if(pilih==2){
            System.out.println("masukkan nilai sisi ");
            int s = masuk.nextInt();
            konstruktorKotak dua = new konstruktorKotak("B",s);
            dua.cetak();
        } else {
            System.out.println("PILIHAN SALAH!!! ");
        }

        
    }

}