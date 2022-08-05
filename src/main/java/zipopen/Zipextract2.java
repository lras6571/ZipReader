//package zipopen;
//import java.io.IOException;
//import java.util.Enumeration;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipFile;
//public class zipextract2 {
//
//    public static void main(String[] args) throws IOException {
//        ZipFile zip = null;
//        try {
//            zip = new ZipFile("C:\\Users\\Lasan Rashmika\\Documents\\Automation_Projects\\pom.zip");
//
//            for (Enumeration<?> e = zip.entries(); e.hasMoreElements();) {
//                ZipEntry entry = (ZipEntry) e.nextElement();
//                if (!entry.isDirectory()) {
//                    System.out.println(entry.getName());
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            zip.close();
//        }
//
//    }
//}