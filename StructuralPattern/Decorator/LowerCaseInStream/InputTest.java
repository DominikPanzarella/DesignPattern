package StructuralPattern.Decorator.LowerCaseInStream;

import java.io.*;
import java.nio.file.Path;

public class InputTest
{
    private static final File filePathName = Path.of("C:\\Users\\HP\\IdeaProjects\\DesignPattern\\src\\StructuralPattern\\Decorator\\LowerCaseInStream\\test.txt").toFile();

    public static void main(String[] args) throws FileNotFoundException {
        int c;
        try(
                InputStream in = new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream(filePathName)
                        )
                ) ;
        )
        {
            while((c = in.read()) >= 0)
                System.out.print((char)c);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
