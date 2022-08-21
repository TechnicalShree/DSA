package ExtraOrdinary;

import java.io.*;
// import com.itextpdf.text.pdf.PdfReader

public class PdfDataRead {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\LENOVO\\Desktop\\Resume.pdf");

        OutputStream oos = new FileOutputStream("test.pdf");

        byte[] buf = new byte[8192];

        InputStream is = new FileInputStream(f);

        int c = 0;

        while ((c = is.read(buf, 0, buf.length)) > 0) {
            oos.write(buf, 0, c);
            oos.flush();
        }

        oos.close();
        System.out.println("stop");
        is.close();
    }
}
