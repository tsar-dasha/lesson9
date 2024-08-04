import org.junit.jupiter.api.Test;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipArchive {

    @Test
    void readingandCheckingZipFileTest() throws Exception {
        ClassLoader cl = getClass().getClassLoader();
        try (ZipInputStream zis = new ZipInputStream(
                cl.getResourceAsStream("11zon_zip.zip")
        )) {
            ZipEntry entry;

            while((entry = zis.getNextEntry()) != null) {
                System.out.println(entry.getName());
            }
        }
    }
}
