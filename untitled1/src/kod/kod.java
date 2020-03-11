package kod;

import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class kod {
    public static void main(String[] args) throws IOException {
        Scanner file =  new Scanner(new File("C:\\liste.txt"));
        ArrayList<ögrenci> ögrenciler = new ArrayList<ögrenci>();

        try
        {
            while (true) {
// Satırı boşluklara göre ayırıp values dizisine atıyoruz sonrada arrayliste ekliyoruz
                   String[] values = file.nextLine().split(" ");
                   ögrenciler.add(new ögrenci(values[0], values[1], values[2], values[3], values[4], values[5], values[6]));
                   System.out.println(values[0]);

           }

           }
        //Hata Yakalamak İçin Kullanıyoruz
        catch (NoSuchElementException e){

        }
 int yüzdeler[] = new int[5];
        int i = 0;

       while (i < ögrenciler.size()){
           //string olarak kaydetmiştik onları integer değere çeviriyoruz
            int ödev1Yüzde = Integer.parseInt(ögrenciler.get(i).ödev1) * 10 / 100;
            int ödev2Yüzde = Integer.parseInt(ögrenciler.get(i).odev2) * 10 / 100;
            int vizeYüzde = Integer.parseInt(ögrenciler.get(i).vizeNot) * 35 / 100;
            int finalYüzde = Integer.parseInt(ögrenciler.get(i).finalNot) * 45 / 100;
            yüzdeler [i] = ödev1Yüzde+ödev2Yüzde+vizeYüzde+finalYüzde;
            i++;
       }

       int sayacAA=0,sayacBA=0,sayacBB=0,sayacCB=0,sayacCC=0,sayacDC=0,sayacDD=0,sayacFD=0,sayacFF=0;
       for (int j = 0 ; j < i  ; j++){
           if(yüzdeler[j] >= 90 && yüzdeler[j]<=100)
               sayacAA++;
           if(yüzdeler[j] >= 85 && yüzdeler[j]<90)
               sayacBA++;
           if(yüzdeler[j] >= 80 && yüzdeler[j]<85)
               sayacBB++;
           if(yüzdeler[j] >= 75 && yüzdeler[j]<80)
               sayacCB++;
           if(yüzdeler[j] >= 65 && yüzdeler[j]<75)
               sayacCC++;
           if(yüzdeler[j] >= 58 && yüzdeler[j]<65)
               sayacDC++;
           if(yüzdeler[j] >= 50 && yüzdeler[j]<58)
               sayacDD++;
           if(yüzdeler[j] >= 40 && yüzdeler[j]<50)
               sayacFD++;
           if(yüzdeler[j] >= 0 && yüzdeler[j]<40)
               sayacFF++;





       }

       File file1 = new File("F:\\odev.txt");
       if(file1.exists()){
           file1.createNewFile();
       }

        FileWriter fileWriter = new FileWriter(file1,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("AA "+sayacAA+"\n");
            bufferedWriter.write("BA "+sayacBA+"\n");
            bufferedWriter.write("BB "+sayacBB+"\n");
            bufferedWriter.write("CB "+sayacCB+"\n");
            bufferedWriter.write("CC "+sayacCC+"\n");
            bufferedWriter.write("DC "+sayacDC+"\n");
            bufferedWriter.write("DD "+sayacDD+"\n");
            bufferedWriter.write("FD "+sayacFD+"\n");
            bufferedWriter.write("FF "+sayacFF+"\n");



bufferedWriter.close();








    }
}
