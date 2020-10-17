package Chapter12.Exercise12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_12 {

	public static void main(String[] args) throws Exception{
		if (args.length != 1) {
            System.out.println("Invalid argument.");
            System.out.println("Usage: java Exercise12_12 Test.java");
            System.exit(1);
        }

        File filename = new File(args[0]);
        if (!filename.exists()) {
            System.out.println(filename + " does not exist.");
            System.exit(2);
        }
/* StringBuilder, System.Text isim uzayı altında yer alan ve temel olarak metinsel 
 * ifadeleri birleştirmek için kullanılan bir sınıftır. String sınıfıyla yapılan 
 * metin birleştirme işlemleri StringBuilder sınıfıyla da yapılabilmekte ve bu 
 * noktada StringBuilder sınıfının String sınıfına göre ciddi bir performans 
 * üstünlüğü bulunmaktadır. Çünkü String objesi değişmeyen (immutable) bir nesnedir
 *  ve '+' ile yeni bir karakter katarı (string) eklendiğinde her defasında yeni 
 *  bir String nesnesi yaratılmaktadır. StringBuilder nesnesi ise bir kez yaratılır
 *  ve daha sonra yeni veriler bu nesneye eklenir.*/
        StringBuilder sbldr = new StringBuilder();
        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                String s = input.nextLine();

                if (s.contains("{")) {
   /* append(): append kelime anlamıyla eklemek anlamına gelmektedir. Bu metodla 
    * StringBuilder nesnesinin içeriğinin sonuna yeni veri eklenebilir. */
                	sbldr.append(" {");
                } else {
                    sbldr.append("\n" + s );
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter output = new PrintWriter(filename);
            output.write(sbldr.toString());
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(sbldr);
    }

    public static int getIndex(String s, char ch) {

        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                return i;
            }
        }
        return -1;

	}

}
