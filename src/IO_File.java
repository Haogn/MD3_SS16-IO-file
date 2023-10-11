import java.io.File;
import java.io.IOException;

public class IO_File {
    public static void main(String[] args) throws IOException {
        File outputDir = new File( "output") ;
        File helloFile = new File("output/heloo.txt") ;
        File subDir = new File ("output/subfoder");
        File sub1File = new File("output/subfoder/output1.txt");
        File sub1Dir = new File("output/subfoder/output1");

        if (outputDir.exists()) {
            outputDir.delete();
        }
        if ( outputDir.mkdir()) {
            helloFile.createNewFile();
            if (subDir.mkdir()) {
                sub1Dir.mkdir();
                sub1File.createNewFile();
            }
        }

        subDir.renameTo(new File("output/subfout1"));
        System.out.println("Cau truc cuar cay thu muc la");
        displayDirTree(outputDir);
    }

    private static void displayDirTree(File rootDir) {
        if (rootDir.isDirectory()) {
            System.out.println(rootDir.getName());
            File[] subFilesLv1 = rootDir.listFiles();
            String prefixLv1 = "_" ;
            for (File subFile : subFilesLv1) {
                System.out.println(prefixLv1 + subFile.getName());
                if ( subFile.isDirectory()) {
                    String prefixLv2 = "__" ;
                    File[] subFilesLv2 = subFile.listFiles();
                    for (File subFileLv2 : subFilesLv2 ) {
                        System.out.println(prefixLv2 + subFileLv2.getName());
                    }
                } else {
                    System.out.println(rootDir.getName());
                }
            }
        }
    }
}
