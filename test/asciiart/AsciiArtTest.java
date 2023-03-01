
package asciiart;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AsciiArtTest {
    
    public AsciiArtTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of printContent method, of class AsciiArt.
     */
    @Test
    public void testPrintContent() throws Exception {
        System.out.println("printContent");
        String path = "imagen1.txt";
        AsciiArt.printContent(path);
    }

    /**
     * Test of read method, of class AsciiArt.
     */
    
    @Test
    public void testRead() throws Exception {
        System.out.println("read");
        String path = "imagen10.txt";
        String expResult = "                                                                                \n"
                + "                                &&&&&&&&&&&&&&&&&%&&&&&&&&&                     \n"
                + "                              &..%%........................#&                   \n"
                + "                           &%....&#.........................&                   \n"
                + "                  &&%%&&&&......&%......................... (                   \n"
                + "                ,&*******&..................................&                   \n"
                + "                &&*******&......... ........................&                   \n"
                + "                &&**&&&&&&&&&&&%&&&&&&&&&&&&&&&&&&&&&&&&&&&&&                   \n"
                + "                &&&,,,,,,,,,,,,,,,,,,,,,,.,,,,,,,,,,,,,,,,,,.,&&                \n"
                + "                &&,,,,,,,,.,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,&#               \n"
                + "                &&,,,,,,,,.,,,,,,,,,,,,,,,.,,,,,,,,,,,,,,,,,,,,%&               \n"
                + "                &&,,,,,,,,,,,,,,,,,,,,,,.,,,,,,,,,,,,,,,,,,,,,,%&               \n"
                + "                &&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%&               \n"
                + "                &&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%&               \n"
                + "                &&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%&               \n"
                + "                &&,,,,,,,,,.,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%&               \n"
                + "                &&,,,,,,..,,,,,,,,,,,,,,,,,,,.,,,,,,,,,,,,,,,,,&&               \n"
                + "                &&,,,.,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%&               \n"
                + "                &&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%&               \n"
                + "                &&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%&               \n"
                + "                 &,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,&                \n"
                + "                   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&%&#                  \n"
                + "                                                                                \n"
                + "                                                                                \n"
                + "\n"
                + "";
        String result = AsciiArt.read(path);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of compress method, of class AsciiArt.
     */
    
    @Test
    public void testCompress() throws IOException{
        System.out.println("compress");
        String text = "imagen1.txt";
        String expResult = "32 2	1*6/1,23 1\n"
                + "80 1\n"
                + "44 1.16(1,3 3/12 1\n"
                + "40 3(1,18 1.3(1.13 1\n"
                + "37 2(1/26 1.2(1.10 1\n"
                + "35 2(15 2/15 2(1*8 1\n"
                + "33 2(17 2/17 2(7 1\n"
                + "32 2(18 2/18 1,1(1*5 1\n"
                + "31 2(19 2/5 2/1.11 1.1(1.4 1\n"
                + "30 1/1(20 2/2 1.2/15 2(4 1\n"
                + "30 2(20 4/1,17 1.1(1.3 1\n"
                + "30 2(20 2/20 1.1(1.3 1\n"
                + "74 1/1(4 1\n"
                + "4 1*14(4 22(4/25 1(1/4 1\n"
                + "31 10(7/1,24 2(5 1\n"
                + "4 12(1 1,19(11/23 1.1(1/6 1\n"
                + "34 14/1 12/9 2(8 1\n"
                + "5 1.5(2 16(18/2 2/8 1*1/1*5 1,2(10 1\n"
                + "26 1,19/1*1 2/1.9 1*1/1,2 2(1.12 1\n"
                + "10 4/3 4/4*21/1.1 2/11 2/1.16 1\n"
                + "23 23/1 19/1,13 1\n"
                + "22 1.22/1.1 19/1.13 1\n"
                + "9 26,5.6 1,19/14 1\n"
                + "9 1.5/7 32/6 1*4/1.14 1\n"
                + "9 4/2.6(2 28/1*1 1*6(1 1*3/15 1\n"
                + "14 1/6(32 7(20 1\n"
                + "16 3(35 1*2(1*8 2\n";
        String result = AsciiArt.compress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
    @Test
    public void test2Compress() throws IOException {
        System.out.println("compress");
        String text = "imagen2.txt";
        String expResult = "80 1\n"
                + "80 1\n"
                + "44 1/35 1\n"
                + "43 1/36 1\n"
                + "40 2/4 1/33 1\n"
                + "37 2/3 1/1,36 1\n"
                + "36 2/3 1/1*37 1\n"
                + "37 1*1,2 1*2/36 1\n"
                + "43 1/36 1\n"
                + "31 2(1*9 1.1,2/4 1(1/27 1\n"
                + "34 1,15 1(1/28 1\n"
                + "80 1\n"
                + "35 10(1.34 1\n"
                + "28 1*2(1.16 1.1/1.29 1\n"
                + "33 1*1,1.7 1.1,1*2(1/1.30 1\n"
                + "80 1\n"
                + "29 2/49 1\n"
                + "29 2/5 1*1/1 1,1/2 1.1/5 1,1/28 1\n"
                + "29 2/1 1*1/2 1,1/2 2/1 1/1.1 1,1/2 1.1/28 1\n"
                + "29 2/1 4/1*1/3 2/1,2 1*5/28 1\n"
                + "28 2/50 1\n";
        String result = AsciiArt.compress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
    @Test
    public void test3Compress() throws IOException {
        System.out.println("compress");
        String text = "imagen3.txt";
        String expResult = "80 1\n"
                + "26 1&1*25,1*1(25 1\n"
                + "23 1*7,1(17#1(7,1/22 1\n"
                + "20 1.1*5,27#5,1*20 1\n"
                + "19 1@4,1/31#1*5,18 1\n"
                + "18 1(4,11#13 11#4,18 1\n"
                + "18 4,13#11 13#3,1*17 1\n"
                + "17 1&3,1*37#1*3,17 1\n"
                + "17 1*3,39#3,1@16 1\n"
                + "17 4,11#1,15 1,11#3,1(16 1\n"
                + "17 4,3#1(4#23 4#1/3#3,1(16 1\n"
                + "17 4,3#33 3#3,1(16 1\n"
                + "17 4,3#33 3#3,1(16 1\n"
                + "17 1*3,3#33 2#1(3,1@16 1\n"
                + "18 4,3#31 3#4,17 1\n"
                + "18 1/4,3#29 3#4,1*17 1\n"
                + "19 1*4,3#26 1.3#4,1/18 1\n"
                + "20 1/4,1/3#23 3#1*4,1#19 1\n"
                + "21 1.1*4,1/4#17 4#5,1*21 1\n"
                + "22 1(1*6,1(4#1(9 5#1(6,1*1&21 1\n"
                + "17 1,1*8,1(2#4,1(11#1/3,1*2#1(8,1/1,16 1\n"
                + "13 1#1*7,1*11#1(11,1(11#1*7,1*1#12 1\n"
                + "9 1(8,20#4,1*20#8,1/8 1\n"
                + "6 1/7,25#3,25#1*6,1(5 1\n"
                + "4 1*5,30#1,30#5,4 1\n"
                + "3 1#4,1(63#1(4,1&2 1\n"
                + "2 1.4,67#5,1 1\n"
                + "2 4,69#3,1*1 1\n"
                + "1 1/3,1/69#1/3,1(1\n"
                + "1 4,14#8,1*25#1*8,14#4,1\n"
                + "1 3,11#1*6,1*1/1*6,1/17#1*6,1*1/1*6,1/10#1(3,1\n"
                + "1 3,1/8#1/4,11%22,1*11%4,1(8#1*3,1\n"
                + "1 1*4,1*6#3,1*1#2(2/2(7%19,7%4(3#4,6#5,1/1\n"
                + "3 1*6,4#1*9,33%9,1/4#6,1/2 1\n"
                + "6 1*17,33%16,2*5 1\n"
                + "10 1#1*4,1/13%1*19,1*13%1*3,2*1,9 1\n"
                + "13 1/5,9%5,1/13 1*5,9%5,1(12 1\n"
                + "15 1/15,1/17 1*14,1*1%2 1\n";
        String result = AsciiArt.compress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
    @Test
    public void test4Compress() throws IOException {
        System.out.println("compress");
        String text = "imagen4.txt";
        String expResult = "1\n"
                + "80 1\n"
                + "19 44&1,16 1\n"
                + "19 1&5 25.2,1.3,1.5,2%16 1\n"
                + "19 1&5 25.12,2%16 1\n"
                + "19 1&5 22.15,2%16 1\n"
                + "19 1&42,2%16 1\n"
                + "19 1&12,1.15,1.13,2%16 1\n"
                + "19 1&42,2%16 1\n"
                + "19 1&12,1.29,2%16 1\n"
                + "19 1&42,2%16 1\n"
                + "19 44&1*16 1\n"
                + "40 3&1*36 1\n"
                + "31 5&10@6&1/27 2\n";
        String result = AsciiArt.compress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
    
    
    @Test
    public void test5Compress() throws IOException {
        System.out.println("compress");
        String text = "imagen5.txt";
        String expResult = "80 1\n"
                + "27 1,25@27 1\n"
                + "22 36@1%21 1\n"
                + "17 1.44@1&17 1\n"
                + "14 1*51@14 1\n"
                + "12 14@2&2@3&1@7&1@2&3@3&1@3&14@1%11 1\n"
                + "9 1.15@1(2 2%2 1.1@2*2 1,1*1/1&3 1.4 1@1.2 17@9 1\n"
                + "8 17@1(2 2*2 1.3@2 1(2@1&2 1@2 1#2 1@1,2 2%1#15@1&7 1\n"
                + "6 1&18@1%2/2@1(2/3@2/1%3@2/3@1&2/1@1(5/17@1,5 1\n"
                + "5 70@1&4 1\n"
                + "3 1.18@38 1.16@3 1\n"
                + "3 19@1.37 1/16@1&2 1\n"
                + "2 1&19@1*37 1&17@1/1 1\n"
                + "1 1,21@6 1%23@1/6 19@1 1\n"
                + "1 1&21@6 1(23@1.6 19@1,1\n"
                + "1 22@6 1.4@1#24 1,19@1&1\n"
                + "1 22@1*6 4@1&24 1%19@1&1\n"
                + "1 22@1#6 1&21@1#6 20@1&1\n"
                + "1 1&22@6 1#21@1*6 20@1,1\n"
                + "1 1,22@23 5@6 1.20@1 1\n"
                + "2 1&21@1,6 4@1%11 5@6 1/19@1*1 1\n"
                + "3 21@1/6 5@1,9 1*4@1&6 1%18@1#2 1\n"
                + "4 20@1%6 20@1(6 18@1%3 1\n"
                + "5 20@10 1*1#9@1#1,10 17@1(4 1\n"
                + "6 1/18@32 1*16@6 1\n"
                + "8 17@1*31 1#14@1(7 1\n"
                + "10 21@1&1/16 1.1(19@1#9 1\n"
                + "12 1%28@1#26@1,11 1\n"
                + "15 50@1#14 1\n"
                + "18 1#43@1,17 1\n"
                + "22 1*34@1&22 1\n"
                + "28 1,1&21@1%28 1\n";
        String result = AsciiArt.compress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
     
    @Test
    public void test6Compress() throws IOException {
        System.out.println("compress");
        String text = "imagen6.txt";
        String expResult = "80 1\n"
                + "19 36@25 1\n"
                + "19 3@29 6@23 1\n"
                + "19 3@29 1,8@20 1\n"
                + "19 3@31 9@18 1\n"
                + "19 3@37 3@18 1\n"
                + "19 3@37 3@18 1\n"
                + "19 3@6 25&6 3@18 1\n"
                + "19 3@37 3@18 1\n"
                + "19 3@6 25@6 3@18 1\n"
                + "19 3@37 3@18 1\n"
                + "14 53@13 1\n"
                + "14 53@13 1\n"
                + "14 53@13 1\n"
                + "14 11@2 3@2 3@2 1/2@1%3 2@3 3@3 4@2 6@13 1\n"
                + "14 11@2 3@4 1.5@2 6@2 2@2 1*2 2@2 6@13 1\n"
                + "14 11@2 8@3 2@2 6@2 2@2 2@2 1&2 6@13 1\n"
                + "14 6@1/2 1*3 3@3 1(1.3 3@3 1*1.3 3@2 3@1%3 6@13 1\n"
                + "14 53@13 1\n"
                + "14 53@13 1\n"
                + "14 53@13 1\n"
                + "19 3@37 3@18 1\n"
                + "19 3@37 3@18 1\n"
                + "19 43@18 1\n"
                + "80 1\n";
        String result = AsciiArt.compress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
    @Test
    public void test7Compress() throws IOException {
        System.out.println("compress");
        String text = "imagen7.txt";
        String expResult = "3 35*42 1\n"
                + "3 18*14.3*42 1\n"
                + "4 17*14.2*1,42 1\n"
                + "4 12*3 2*1.11 1.1,2*43 1\n"
                + "4 12*3 2*1.3 9.3*43 1\n"
                + "4 12*3 2*1.3 9.3*43 1\n"
                + "4 1,11*3 2*1.3 9.3*5 1@14 1@18 1@3 1\n"
                + "5 11*3 2*1.10 2.2*1,5 1@1 3@1%1 1@2%1 3@3 3@1*2 1@1(2 1@1 1@2 1@1 1@3 1\n"
                + "5 11*3 2*1.5 2.3 1.1,2*35 1@8 1\n"
                + "5 4*1.6*3 2*8.3 1.3*44 1\n"
                + "5 1,3*10 2*1.10 1.3*44 1\n"
                + "6 7*1.5 2*1.7 4.2*1,44 1\n"
                + "6 15*11.1,2*45 1\n"
                + "6 15*9.5*45 1\n"
                + "10 1,19*1,49 1\n"
                + "19 3*58 1\n";
        String result = AsciiArt.compress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
    @Test
    public void test8Compress() throws IOException {
        System.out.println("compress");
        String text = "imagen8.txt";
        String expResult = "1\n"
                + "66 1\n"
                + "32 1,13(20 1\n"
                + "30 3(2.13(1/17 1\n"
                + "30 3(2.14(17 1\n"
                + "30 19(17 1\n"
                + "23 26(6.11 1\n"
                + "21 28(8.9 1\n"
                + "20 28(1/9.8 1\n"
                + "20 26(12.8 1\n"
                + "20 10(28.8 1\n"
                + "20 9(29.8 1\n"
                + "21 8(28.9 1\n"
                + "23 6(26.11 1\n"
                + "28 20.18 1\n"
                + "30 18.18 1\n"
                + "30 18.18 1\n"
                + "33 13.20 1\n"
                + "41 5.20 ";
        String result = AsciiArt.compress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
    @Test
    public void test9Compress() throws IOException {
        System.out.println("compress");
        String text = "imagen9.txt";
        String expResult = "80 1\n"
                + "34 1,5*1,6*1.32 1\n"
                + "30 2*2,1.12 3,2*28 1\n"
                + "27 1/1*2,20.2,2*25 1\n"
                + "25 1,1*2,24.2,1*24 1\n"
                + "24 2*2,7.1#18.2,2*22 1\n"
                + "23 2*8,4(1.6,1*3(1.8,1*1,21 1\n"
                + "23 1*10,3#8,3#10,1*21 1\n"
                + "23 1*34,1*21 1\n"
                + "23 1*34,1*21 1\n"
                + "24 1*32,1*22 1\n"
                + "24 1.1*9,3#6,3#9,1*23 1\n"
                + "26 1*28,1*24 1\n"
                + "28 2*22,2*26 1\n"
                + "31 2*16,2*29 1\n"
                + "37 7*1/35 1\n"
                + "";
        String result = AsciiArt.compress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
    @Test
    public void test10Compress() throws IOException {
        System.out.println("compress");
        String text = "imagen10.txt";
        String expResult = "80 1\n"
                + "32 17&1%9&21 1\n"
                + "30 1&2.2%24.1#1&19 1\n"
                + "27 1&1%4.1&1#25.1&19 1\n"
                + "18 2&2%4&6.1&1%25.1 1(19 1\n"
                + "16 1,1&7*1&34.1&19 1\n"
                + "16 2&7*1&9.1 24.1&19 1\n"
                + "16 2&2*11&1%29&19 1\n"
                + "16 3&22,1.18,1.1,2&16 1\n"
                + "16 2&8,1.36,1&1#15 1\n"
                + "16 2&8,1.15,1.20,1%1&15 1\n"
                + "16 2&22,1.22,1%1&15 1\n"
                + "16 2&45,1%1&15 1\n"
                + "16 2&45,1%1&15 1\n"
                + "16 2&45,1%1&15 1\n"
                + "16 2&9,1.35,1%1&15 1\n"
                + "16 2&6,2.19,1.17,2&15 1\n"
                + "16 2&3,1.41,1%1&15 1\n"
                + "16 2&45,1%1&15 1\n"
                + "16 2&45,1%1&15 1\n"
                + "17 1&45,1&16 1\n"
                + "19 40&1%1&1#18 1\n"
                + "80 1\n"
                + "80 2\n"
                + "";
        String result = AsciiArt.compress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
   
    /**
     * Test of decompress method, of class AsciiArt.
     */
    
    @Test
    public void testDecompress() throws IOException{
        System.out.println("decompress");
        String text = "imagen6.txt";
        String expResult = "                                                                                \n"
                + "                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                         \n"
                + "                   @@@                             @@@@@@                       \n"
                + "                   @@@                             ,@@@@@@@@                    \n"
                + "                   @@@                               @@@@@@@@@                  \n"
                + "                   @@@                                     @@@                  \n"
                + "                   @@@                                     @@@                  \n"
                + "                   @@@      &&&&&&&&&&&&&&&&&&&&&&&&&      @@@                  \n"
                + "                   @@@                                     @@@                  \n"
                + "                   @@@      @@@@@@@@@@@@@@@@@@@@@@@@@      @@@                  \n"
                + "                   @@@                                     @@@                  \n"
                + "              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             \n"
                + "              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             \n"
                + "              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             \n"
                + "              @@@@@@@@@@@  @@@  @@@  /@@%   @@   @@@   @@@@  @@@@@@             \n"
                + "              @@@@@@@@@@@  @@@    .@@@@@  @@@@@@  @@  *  @@  @@@@@@             \n"
                + "              @@@@@@@@@@@  @@@@@@@@   @@  @@@@@@  @@  @@  &  @@@@@@             \n"
                + "              @@@@@@/  *   @@@   (.   @@@   *.   @@@  @@@%   @@@@@@             \n"
                + "              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             \n"
                + "              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             \n"
                + "              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             \n"
                + "                   @@@                                     @@@                  \n"
                + "                   @@@                                     @@@                  \n"
                + "                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                  \n"
                + "                                                                                \n"
                + "";
        String result = AsciiArt.decompress(AsciiArt.read(text));
        assertEquals(expResult, result);
    }
    
    /**
     * Test of main method, of class AsciiArt.
     */
    /*
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        AsciiArt.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */   
}
