import org.junit.jupiter.api.Test;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.io.InputStream;

public class ZipArchive {

    @Test
    void readingandCheckingZipFileTest() throws Exception {
        ClassLoader cl = getClass().getClassLoader();
        try (InputStream is = cl.getResourceAsStream("11zon_zip.zip")) {
            if (is == null) {
                throw new IllegalArgumentException("Файл 11zon_zip.zip не найден");
            }
            try (ZipInputStream zis = new ZipInputStream(is)) {
                ZipEntry entry;
                while ((entry = zis.getNextEntry()) != null) {
                    System.out.println(entry.getName());
                }
            }
        }
    }
}
