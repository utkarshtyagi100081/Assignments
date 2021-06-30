import java.io.*;
class ReadFile{
    public static void main(String arr[])throws Exception
    {
        
        String path="E:\\download\\Assignments\\Filehandling\\file.txt";
        File file = new File(path);
        BufferedReader bfr =new  BufferedReader(new FileReader(file));



        String word;
        while((word=bfr.readLine())!=null)
        {
            System.out.print(word);
        }

    }
}