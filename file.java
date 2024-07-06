import java.io.*;

class createfile {
    public static void main(String[] args) {
        try {
            // Creating a file
            File f = new File("Home\\projects\\java practice\\f.txt");
            if (f.createNewFile()) {
                System.out.println("File successfully created..!");
            } else {
                System.out.println("File already exists.");
            }
            
            // Displaying file information
            if (f.exists()) {
                System.out.println("File name: " + f.getName());
                System.out.println("File Location: " + f.getAbsolutePath());
                System.out.println("File Writable: " + f.canWrite());
                System.out.println("File Size: " + f.length());
            } else {
                System.out.println("File does not exist.");
            }

            // Renaming a file
            File r = new File("Home\\projects\\java practice\\bk.txt");
            if (f.exists()) {
                System.out.println("File already exists");
                System.out.println(f.renameTo(r)); // Rename a file using renameTo method
            } else {
                System.out.println("File does not exist");
            }

            // Copying data from one file to another
            FileInputStream inputStream = new FileInputStream("Home//projects//java practice//r.txt");
            FileOutputStream outputStream = new FileOutputStream("Home//projects//java practice//b.txt");
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write((byte) i);
            }
            System.out.println("Data copied successfully");
            
            // Closing streams
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e);
        }
    }
}
